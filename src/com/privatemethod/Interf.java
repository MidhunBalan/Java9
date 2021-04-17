package com.privatemethod;

interface Interf {
    default void m1() {
        System.out.println("hello");
    }
}
