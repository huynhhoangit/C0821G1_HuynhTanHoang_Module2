package ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.service;

import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape.Shape;

public class RectangleService extends Shape implements IResizeableService {
    private double width;
    private double length;
    public RectangleService() {
        this(1.0, 1.0);
    }
    public RectangleService (double width, double length) {
        this.width = width;
        this.length = length;
    }
    public RectangleService(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public  double getWidth () {
        return this.width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getlength () {
        return this.length;
    }
    public void setlength (double length) {
        this.length = length;
    }
    public double getArea () {
        return this.width * this.length;
    }
    public double getPerimeter () {
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString () {
        return "A Rectangle with width = " + getWidth() + " and height = " + getlength() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize (double percent) {
        setWidth(getWidth() * (1 + percent / 100));
        setlength(getlength() * (1 + percent / 100));
    }
}
