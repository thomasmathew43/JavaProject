package Javaproject;

public class HybridInheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Polygon polygon = new Polygon();

        circle.draw();      // Output: Drawing a circle
        rectangle.draw();   // Output: Drawing a rectangle
        polygon.draw();     // Output: Drawing a polygon
    }
}
