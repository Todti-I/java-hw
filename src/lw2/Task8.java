package lw2;

public class Task8 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Спайк", 2),
                new Cat("Серсея", 4)
        };
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println();
        Shape shape = new Triangle(3, 4, 5);
        System.out.printf(
                "%s | Периметр = %.1f Площадь = %.1f\n",
                shape,
                shape.getPerimeter(),
                shape.getSquare()
        );
    }
}

abstract class Animal {
    public final String name;
    public final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Who am I?");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.printf("[%s] Wof wof\n", name);
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.printf("[%s] Meow meow\n", name);
    }
}

abstract class Shape {
    public double getPerimeter() {
        throw new UnsupportedOperationException();
    }

    public double getSquare() {
        throw new UnsupportedOperationException();
    }
}

class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double halfP = (a + b + c) / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public String toString() {
        return String.format("[Треугольник] A = %.1f B = %.1f C = %.1f", a, b, c);
    }
}
