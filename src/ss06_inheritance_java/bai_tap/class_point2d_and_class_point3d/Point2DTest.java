package ss06_inheritance_java.bai_tap.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(3.0f,5.6f);
        System.out.println(point2D1);
        System.out.println(Arrays.toString(point2D1.getXY()));
    }
}
