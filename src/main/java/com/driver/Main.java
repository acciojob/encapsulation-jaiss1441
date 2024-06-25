package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly rw = new RWOnly();
//        rw.name = "vikas";
//        System.out.print(rw.name);
        //java: name has private access in RWOnly
        System.out.println(rw.getName());
        rw.setName("Jaiswal");
        System.out.println(rw.getName());

    }
  
}