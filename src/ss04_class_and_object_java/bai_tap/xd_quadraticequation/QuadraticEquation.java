package ss04_class_and_object_java.bai_tap.xd_quadraticequation;

public class QuadraticEquation {
    private double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDiscriminant() {
        return (this.b*this.b-4*this.a*this.c);

    }
    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return  0;
        } else {
            return (-this.b + (Math.pow(this.getDiscriminant(), 0.5))) / (2 * this.a);
        }
    }
    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return  0;
        } else {
            return (-this.b - (Math.pow(this.getDiscriminant(), 0.5))) / (2 * this.a);
        }
    }
    public void display() {
        if (this.getDiscriminant() < 0) {
            System.out.print("Phương trình đã cho vô nghiệm");
        } else if (this.getDiscriminant() == 0) {
            System.out.print("Phương trình đã cho có nghiệm kép là: x = " + this.getRoot1());
        } else {
            System.out.print("Phương trình đã cho có nghiệm là: x1 = " + this.getRoot1() + " và x2 = " + this.getRoot2());
        }
    }
}
