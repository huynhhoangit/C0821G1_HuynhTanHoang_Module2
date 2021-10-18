package ss06_inheritance_java.thuc_hanh.system_of_geometric_objects;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public Rectangle( double width, double length ,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with" + getWidth()
                                  + " and "
                                  + getLength()
                                  + " , which is a subclass of "
                                  + super.toString();
    }
}
