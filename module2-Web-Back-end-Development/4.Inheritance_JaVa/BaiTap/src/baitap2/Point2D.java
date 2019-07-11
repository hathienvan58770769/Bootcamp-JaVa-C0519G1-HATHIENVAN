package baitap2;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f, y = 0.0f;
    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public  void setXY(){
        this.x = getX();
        this.y = getY();
    }
    public float[] getXY(){
        float[] array = {getX(),getY()};
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
