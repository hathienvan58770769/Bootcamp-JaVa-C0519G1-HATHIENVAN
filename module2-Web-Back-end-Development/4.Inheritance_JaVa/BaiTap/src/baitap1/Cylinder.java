package baitap1;

public class Cylinder extends Circle{
    private double height = 3.0;
    public Cylinder(){
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight()
                +" and radius = " + super.getRadius()
                + " have color is " + super.getColor()
                + " Cylinder volume = " + getVolume();
    }
}
