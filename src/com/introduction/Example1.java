package com.introduction;

public class Example1 {
    public static void main(String arg[]) {
        System.out.println("current process id:" + ProcessHandle.current().pid());
    }
}
