package com.company;

public class PrimitiveType {
    public static void main(String[] args) {
        byte a= 10;
        short s= 20;
        int i= 100;

        long longAnswer = 50000 + 10 * (a+s+i);
        System.out.println("long type answer:" +longAnswer);
        short shortAnswer= (short) (10000 + 10 * (a+s+i));
        System.out.println("short type answer:" +shortAnswer);
    }
}
