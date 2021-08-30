package com.company;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("sum of digits in 125 is:" + sumDigits(125));
        System.out.println("sum of digits in 4 is:" + sumDigits(4));
        System.out.println("sum of digits in 12 is:" + sumDigits(12));
        System.out.println("sum of digits in -45 is:" + sumDigits(-45));

    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum +=digit;
             number /=10;

        }
        return sum;
    }
}
