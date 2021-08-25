package com.company;

public class TeenNumberChecker {
    public boolean hasTeen(int r1, int r2, int r3) {
        if ((r1 >= 13 && r1 <= 19) || (r2 >= 13 && r2 <= 19) || (r3 >= 13 && r3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

}
class Checker{

    public static void main(String[] args) {
        TeenNumberChecker Check = new TeenNumberChecker();

        boolean ret = Check.hasTeen(22,12,13);
        boolean ret1 = Check.hasTeen(19,15,17);
        boolean ret2 = Check.hasTeen(22,23,24);
        System.out.println(ret);
        System.out.println(ret1);
        System.out.println(ret2);
    }
}
