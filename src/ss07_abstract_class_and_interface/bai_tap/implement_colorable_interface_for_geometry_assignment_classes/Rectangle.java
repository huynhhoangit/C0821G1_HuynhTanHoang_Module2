package ss07_abstract_class_and_interface.bai_tap.implement_colorable_interface_for_geometry_assignment_classes;

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

     public double getdientich(){
       return getWidth() * getLength();
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
