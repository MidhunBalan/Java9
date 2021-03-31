package com.introduction;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String arg[]){
        List<String> l1= Arrays.asList("A","B");
        List<String> l2= Arrays.asList("C","D");
        List<String> l3= Arrays.asList("E","F");
        m1(l1, l2, l3);
    }
    @SafeVarargs
    public static void m1(List<String>... l){
        for (List<String> ll1: l){
            System.out.println(ll1);
        }
    }
}
