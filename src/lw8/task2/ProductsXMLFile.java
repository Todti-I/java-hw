package lw8.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductsXMLFile {
    private File file;
    private Document doc;


    public ProductsXMLFile(String filePath) {
        try {
            file = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.printf("Не удалось открыть файл: %s\n", e.getMessage());
        }
    }

    public void add(String name, String price) {
        Element root = doc.getDocumentElement();

        Element product = doc.createElement("product");

        UUID id = UUID.randomUUID();
        Element idElement = doc.createElement("id");
        idElement.appendChild(doc.createTextNode(id.toString()));
        product.appendChild(idElement);

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(name));
        product.appendChild(nameElement);

        Element priceElement = doc.createElement("price");
        priceElement.appendChild(doc.createTextNode(price));
        product.appendChild(priceElement);

        root.appendChild(product);
        System.out.printf("Продукт \"%s\" успешно добавлен\n", id);
    }

    public List<Product> searchByName(String name) {
        NodeList nodes = doc.getElementsByTagName("product");
        return IntStream.range(0, nodes.getLength())
                .mapToObj(nodes::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> element
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent()
                        .equals(name))
                .map(element -> new Product(
                        UUID.fromString(element.getElementsByTagName("id").item(0).getTextContent()),
                        element.getElementsByTagName("name").item(0).getTextContent(),
                        element.getElementsByTagName("price").item(0).getTextContent()))
                .collect(Collectors.toList());
    }

    public void removeById(UUID id) {
        NodeList nodeList = doc.getElementsByTagName("product");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String productId = element
                        .getElementsByTagName("id")
                        .item(0)
                        .getTextContent();
                if (productId.equals(id.toString())) {
                    doc.getDocumentElement().removeChild(node);
                    System.out.printf("Продукт \"%s\" успешно удален\n", id);
                    break;
                }
            }
        }
    }

    public void close() {
        try {
            doc.setXmlStandalone(true);
            doc.normalize();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            System.out.println("Файл успешно сохранен!");
        } catch (TransformerException e) {
            System.out.printf("Не удалось сохранить файл: %s\n", e.getMessage());
        }
    }
}
