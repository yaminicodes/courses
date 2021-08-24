package com.company;
import java.lang.*;
import java.util.*;

public class MegaBytesConverter{

public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
        System.out.println("Invalid Value");
        } else {
        int megabytes = (kiloBytes/1024);
        int kiloRemainder = (kiloBytes%1024);
        System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
        }

        }
}
 class Example{
         public static void main(String[] args) {
                 MegaBytesConverter mobj = new MegaBytesConverter();
                 mobj.printMegaBytesAndKiloBytes(-1024);
                 mobj.printMegaBytesAndKiloBytes(2500);
                 mobj.printMegaBytesAndKiloBytes(100);
         }
}