package ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape;

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

    @Override
    public void resize (double percent) {
        setWidth(getWidth() * (1 + percent / 100));
        setLength(getLength() * (1 + percent / 100));
    }


}
