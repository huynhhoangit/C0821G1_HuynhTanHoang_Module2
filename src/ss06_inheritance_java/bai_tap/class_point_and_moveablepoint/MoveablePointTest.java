package ss06_inheritance_java.bai_tap.class_point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        System.out.println();

        moveablePoint = new MoveablePoint(1.4f, 2.7f);
        System.out.println(moveablePoint);
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        System.out.println(moveablePoint.move());
        System.out.println();

        moveablePoint.setSpeed(3.4f, 4.8f);
        System.out.println(moveablePoint);
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        System.out.println(moveablePoint.move());
    }
}
