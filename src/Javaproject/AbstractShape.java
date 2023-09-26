package Javaproject;





public abstract class AbstractShape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public abstract double area();

    public String getName() {
        return name;
    }
}
