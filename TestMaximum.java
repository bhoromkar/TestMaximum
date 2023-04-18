package com.bridgelabz.testmaximum;
import java.util.*;
public class TestMaximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max;
        if(x.compareTo(y)>0 && (x.compareTo(z)>0)){
           max=x;
        }else if(y.compareTo(z)>0){
           max=y;
        }else{
          max=z;
        }
        return max; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf( "Maximum is "+ maximum(3, 4, 5));
        System.out.println();
        System.out.printf("Maximum is " + maximum(6.6, 8.8, 7.7));
        System.out.println();
        System.out.printf( "Maximum is " +maximum("apple", "mango", "banana"));
    }
}



