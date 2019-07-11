package baitap3;

import java.util.Arrays;

public class Point {
    private float x = 0.0f, y =0.0f;

    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public  void setXY(){
        this.x = x;
        this.y = y;
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
