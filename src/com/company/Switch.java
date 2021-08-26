package com.company;

public class Switch {
    public static void main(String[] args) {
        numberToWord(0);
        numberToWord(1);
        numberToWord(2);
        numberToWord(3);
        numberToWord(4);
        numberToWord(5);
        numberToWord(6);
        numberToWord(7);
        numberToWord(8);
        numberToWord(9);
        numberToWord(10);

    }

    public static void numberToWord(int no) {
        switch (no) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Value");
                break;

               /* if(no == 0){
                    System.out.println("Zero");
                }else if(no == 1){
                    System.out.println("One");
                }else if(no == 2){
                    System.out.println("Two");
                }else if(no == 3){
                    System.out.println("Three");
                }else if(no == 4){
                    System.out.println("Four");
                }else if(no == 5){
                    System.out.println("Five");
                }else if(no == 6){
                    System.out.println("Six");
                }else if(no == 7){
                    System.out.println("Seven");
                }else if(no == 8){
                    System.out.println("Eight");
                }else if (no == 9){
                    System.out.println("Nine");
                }*/
        }
    }
}

