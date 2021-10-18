package ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape;



public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius , String color, boolean filled) {
        super(color, filled);  // kế thừa của thằng cha Shape
        this.radius = radius;  // thuộc tính của thằng con Circle
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {  // viết construstor trả về diện tích hình tròn
        return radius * radius * Math.PI;
    }

    public double getPerimeter() { // viết construstor trả về chu vi
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();

    }
    @Override
    public void resize (double percent) {
        setRadius(getRadius() * (1 + percent / 100));
    }


    }

