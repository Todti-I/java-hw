package lw2;

public class Task4 {
    public static void main(String[] args) {
        Person person = new Person("NiKiTa", 22, "male");
        System.out.printf("Name: %s\n", person.getName());
        System.out.printf("Age: %d\n", person.getAge());
        System.out.printf("Gender: %s\n", person.getGender());

        person.setName("Nikita").setAge(23).setGender("other");

        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Имя = %s, Возраст = %d, Пол = %s", name, age, gender);
    }
}


