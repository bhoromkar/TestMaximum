package com.bridgelabz.testmaximum;


public class TestMaximum<T extends Comparable> {
    T x;
    T y;
    T z;

    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }
    <T>  T testMaxNum(){
        T maximum = (T) MaxVaLue.maximum(x, y, z);
        return maximum;
    }


}



