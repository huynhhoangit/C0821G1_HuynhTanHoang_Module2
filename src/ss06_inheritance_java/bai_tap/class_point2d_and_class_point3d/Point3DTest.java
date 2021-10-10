package ss06_inheritance_java.bai_tap.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(3.5f,4.9f,8.1f);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}
