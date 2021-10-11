package ss06_inheritance_java.thuc_hanh.system_of_geometric_objects;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", true);
        System.out.println(shape);
    }
}
