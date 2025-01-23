package com.telusko;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("Laptop obj created");
    }
    @Override
    public void compile(){
        System.out.println("compiling using Laptop...");
    }
}
