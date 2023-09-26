package Javaproject;
import Javaproject.Person;
import Javaproject.Student;

public class Encapulationinheritance {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());

        // Create a Student object
        Student student = new Student("Bob", 20, "S12345");
        System.out.println("Student's name: " + student.getName());
        System.out.println("Student's age: " + student.getAge());
        System.out.println("Student's ID: " + student.getStudentId());
    }
}
