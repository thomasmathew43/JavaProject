package Javaproject;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class overloading {
    public static void main(String[] args) {
        // Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Using method overloading:");
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(3.5, 7.2));
        System.out.println();

        // Method Overriding
        Animal animal = new Animal();
        Animal dog = new Dog();
        System.out.println("Using method overriding:");
        animal.makeSound(); // Prints "Animal makes a sound"
        dog.makeSound();    // Prints "Dog barks"
    }
}
