package com.company;

public class casting {
    public static void main(String[] args) {
        byte a= 10;
        byte b= 20;
        byte addition= (byte) (a+b);
        System.out.println("byte addition:" +addition);
        byte newValue = (byte) (addition/2);
        System.out.println("casting example answer:" +newValue);


    }
}
