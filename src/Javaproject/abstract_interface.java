package Javaproject;



public class abstract_interface {
    public static void main(String[] args) {
        Circle circle = new Circle("My Circle", 5.0);

        System.out.println("Shape: " + circle.getName());
        System.out.println("Area: " + circle.area());

        circle.draw();
    }
}
