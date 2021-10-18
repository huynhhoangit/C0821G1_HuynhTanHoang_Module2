package ss06_inheritance_java.bai_tap.class_point2d_and_class_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {

        this.getX();
        this.getY();
        this.z = z;

    }
    public float[] getXYZ(){
        float[] array1 = new float[3];
        array1[0] = getX();
        array1[1] = getY();
        array1[2] = getZ();
        return array1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
