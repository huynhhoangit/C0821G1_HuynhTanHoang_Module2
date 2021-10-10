package ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape;

import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.service.RectangleService;

public class Square extends RectangleService {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide () {
        return getWidth();
    }
    public void setSide (double side) {
        setWidth(side);
        setlength(side);
    }
    @Override
    public String toString () {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}