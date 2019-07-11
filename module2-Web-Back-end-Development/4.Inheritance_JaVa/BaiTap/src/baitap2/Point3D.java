package baitap2;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
         super.setXY();
         this.z =z;

    }
    public float[] getXYZ(){
        float[] array = {super.getX(), super.getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
