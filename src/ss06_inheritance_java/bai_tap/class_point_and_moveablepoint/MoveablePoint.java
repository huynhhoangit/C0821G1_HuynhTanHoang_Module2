package ss06_inheritance_java.bai_tap.class_point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private  float xSpeed = 0.0f;
    private  float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = getXSpeed();
        this.ySpeed = getYSpeed();
    }
    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = getXSpeed();
        array[1] = getYSpeed();
        return array;
    }


    @Override
    public String toString() {
        return "XY = " + Arrays.toString(getXY())
                       + " speed "
                       + Arrays.toString(getSpeed());
    }
    public MoveablePoint move () {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }

}
