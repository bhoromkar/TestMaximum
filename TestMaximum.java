package com.bridgelabz.testmaximum;
import java.util.*;
public class TestMaximum {

    public static void main(String[] args) {
        Float obj1 = (20.37F);
        Float obj2 = (98.15F);
        Float obj3 = (35.21f);
        if(obj1.compareTo(obj2)>0 && (obj1.compareTo(obj3)>0)){
            System.out.println(obj1);
        }else if(obj2.compareTo(obj3)>0){
            System.out.println(obj2);
        }else{
            System.out.println(obj3);
        }

    }
}
