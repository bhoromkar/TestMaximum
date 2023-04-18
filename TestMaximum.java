package com.bridgelabz.testmaximum;
import java.util.*;
public class TestMaximum {

    public static void main(String[] args) {
        String obj1 = ("apple");
        String obj2 = ("mango");
        String obj3 = ("banana");
        if(obj1.compareTo(obj2)>0 && (obj1.compareTo(obj3)>0)){
            System.out.println(obj1);
        }else if(obj2.compareTo(obj3)>0){
            System.out.println(obj2);
        }else{
            System.out.println(obj3);
        }

    }
}
