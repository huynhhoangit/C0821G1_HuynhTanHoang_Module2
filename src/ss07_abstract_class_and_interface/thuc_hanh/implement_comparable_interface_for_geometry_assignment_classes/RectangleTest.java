package ss07_abstract_class_and_interface.thuc_hanh.implement_comparable_interface_for_geometry_assignment_classes;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle(20.0, 15.0, "yellow", false);
        System.out.println(rectangle);
    }
}
