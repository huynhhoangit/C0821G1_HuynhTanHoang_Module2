package ss06_inheritance_java.bai_tap.class_point_and_moveablepoint;

import ss06_inheritance_java.bai_tap.class_point2d_and_class_point3d.Point2D;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(3.0f,5.6f);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));
    }
}
