package com.bridgelabz.testmaximum;
import java.util.*;
public class TestMaximum {

    public static void main(String[] args) {
        Integer obj1 = (97);
        Integer obj2 = (98);
        Integer obj3 = (35);
        if(obj1.compareTo(obj2)>0 && (obj1.compareTo(obj3)>0)){
            System.out.println(obj1);
        }else if(obj2.compareTo(obj3)>0){
            System.out.println(obj2);
        }else{
            System.out.println(obj3);
        }

    }
}
