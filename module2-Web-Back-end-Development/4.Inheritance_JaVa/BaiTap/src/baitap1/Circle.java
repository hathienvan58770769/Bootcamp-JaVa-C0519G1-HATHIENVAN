package baitap1;

public class Circle {
    private double radius = 1.0;
    private String color = "black";
    public Circle(){
    }
    public Circle(double radius){
     this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle radius = " + getRadius()
                + " and color is " + getColor()
                + " have Area = " + getArea() +
                " and Perimeter = "+ getPerimeter();
    }
}
