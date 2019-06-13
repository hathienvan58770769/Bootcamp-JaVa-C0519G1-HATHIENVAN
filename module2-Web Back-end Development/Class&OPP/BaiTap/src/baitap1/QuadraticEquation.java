package baitap1;

public class QuadraticEquation {
    public double a, b, c ;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1(){

        if (getDiscriminant() >= 0){
            return (-this.b + Math.pow(getDiscriminant(), 0.5))/(2 * this.a);
        }else {
            return 0;
        }
    }

    public double getRoot2(){
        if (getDiscriminant() >= 0){
            return ((-this.b) - Math.pow(getDiscriminant(), 0.5))/(2 * this.a);
        }else {
            return 0;
        }
    }

    public String display(){
        return "r1 = " + getRoot1() + ", r2 = " + getRoot2();
    }
}
