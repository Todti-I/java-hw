package lw7;

import java.io.*;

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Nikita Vedeshkin", 23);
        File personFile = new File("src/lw7/person.bin");

        try (
                FileOutputStream fileOutput = new FileOutputStream(personFile);
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        ) {
            objectOutput.writeObject(person);
            System.out.printf("Сериализованные данные записаны в файл: %s\n", personFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.printf("Ошибка при записи Person: %s\n", e.getMessage());
        }
    }

    private static class Person implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
