package com.telusko;

public class Desktop implements Computer{
    Desktop(){
        System.out.println("Desktop obj created");
    }
    @Override
    public void compile(){
        System.out.println("compiling using Desktop...");
    }
}
