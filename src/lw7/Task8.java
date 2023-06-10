package lw7;

import java.io.*;

public class Task8 {
    public static void main(String[] args) {
        File personFile = new File("src/lw7/person.bin");

        try (
                FileOutputStream fileOutput = new FileOutputStream(personFile);
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)
        ) {
            Person person = new Person("Nikita Vedeshkin", 23);
            objectOutput.writeObject(person);
            System.out.printf("Объект успешно сохранен в %s\n", personFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.printf("Ошибка при сохранении объекта: %s\n", e.getMessage());
        }

        try (
                FileInputStream fileIn = new FileInputStream(personFile);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)
        ) {
            Person restoredPerson = (Person) objectIn.readObject();
            System.out.printf("Объект успешно восстановлен из %s\n", personFile.getAbsolutePath());
            System.out.printf("Имя: %s; Возраст: %d\n", restoredPerson.getName(), restoredPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            System.err.printf("Ошибка при восстановлении объекта: %s\n", e.getMessage());
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
