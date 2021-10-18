package ss07_abstract_class_and_interface.bai_tap.implement_colorable_interface_for_geometry_assignment_classes;

public class Test {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 9);
        shapes[2] = new Square(8);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {

                System.out.println(((Circle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("abc");
                System.out.println(((Square) shape).setdientichvuong());
                ((Square) shape).howToColor();

            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getdientich());

            }

        }
    }
}


