package baitap1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder =  new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5,4.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(5.7, 3.5, "yellow");
        System.out.println(cylinder);
    }
}
