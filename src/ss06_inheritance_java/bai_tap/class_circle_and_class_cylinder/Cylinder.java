package ss06_inheritance_java.bai_tap.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height ;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return  getRadius()*getRadius()*Math.PI*getHeight() ;
    }

    @Override
    public String toString() {
        return "Cylinder có Màu : " + getColor()
                                    + " có bán kính : "
                                    + getRadius()
                                    + " có chiều cao : "
                                    + getHeight()
                                    + " Có Thể Tích Là : V="
                                    + getVolume();

    }
}
