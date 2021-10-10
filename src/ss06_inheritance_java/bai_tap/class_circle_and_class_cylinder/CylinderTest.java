package ss06_inheritance_java.bai_tap.class_circle_and_class_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(5.0,3.5,"red");
        System.out.println(cylinder1);
        System.out.println(cylinder1.getVolume());
    }
}
