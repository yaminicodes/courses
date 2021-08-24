package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if (hourOfDay <0 || hourOfDay >23){
            return false;
        }

        else if (barking == true && hourOfDay <8 || hourOfDay >22){
            return true;
        }else{
            return false;
        }
    }
}
class Result{
    public static void main(String[] args) {
        BarkingDog bark = new BarkingDog();
        boolean ret =  bark.shouldWakeUp(true,25);
        boolean ret1 =  bark.shouldWakeUp(true,7);
        boolean ret2 =  bark.shouldWakeUp(false,7);
        System.out.println(ret);
        System.out.println(ret1);
        System.out.println(ret2);
    }
}