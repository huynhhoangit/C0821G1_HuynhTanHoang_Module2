package ss07_abstract_class_and_interface.thuc_hanh.implement_comparable_interface_for_geometry_assignment_classes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
