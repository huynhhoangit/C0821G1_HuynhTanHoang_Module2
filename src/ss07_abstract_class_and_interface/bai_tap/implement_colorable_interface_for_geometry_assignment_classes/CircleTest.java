package ss07_abstract_class_and_interface.bai_tap.implement_colorable_interface_for_geometry_assignment_classes;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", true);
        System.out.println(circle);

    }
}
