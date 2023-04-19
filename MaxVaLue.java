package com.bridgelabz.testmaximum;
import java.util.*;
public class MaxVaLue {


        public static <T extends Comparable> T maximum(T x,T y,T z) {

            T max;
            if (x.compareTo(y) > 0 && (x.compareTo(z) > 0)) {
                max = x;
            } else if (y.compareTo(z) > 0) {
                max = y;
            } else {
                max = z;
            }
            return max; // returns the largest object
        }
    public static void main(String args[]) {

        TestMaximum<Integer> num = new TestMaximum<>(56,78,63);
        Object testMaxNum = num.testMaxNum();
        System.out.println(testMaxNum);
        TestMaximum<Float> floatNum = new TestMaximum<>(95.20F,78.20F,63.36F);
        Object testMaxNum2 = floatNum.testMaxNum();
        System.out.println(testMaxNum2);
        TestMaximum<String> string1 = new TestMaximum<>("apple","pear","banana");
        Object testMaxNum3 = string1.testMaxNum();
        System.out.println(testMaxNum3);


    }
    }

