package com.company;

public class EnumSwitch {

    enum day {
        sunday,monday,tuesday,wednesday,thursday,friday,saturday
    }

    public static void main(String args[]) {
        switching(day.sunday);
        switching(day.thursday);
    }


    private static void switching(day d) {
        switch (d) {
            case sunday:
                System.out.println("Your day is sunday!");
                break;
            case monday:
                System.out.println("Your day is monday!");
                break;
            case tuesday:
                System.out.println("Your day is tuesday!");
                break;
            case wednesday:
                System.out.println("Your day is wednesday!");
                break;
            case thursday:
                System.out.println("Your day is thursday!");
                break;
            case friday:
                System.out.println("Your day is friday!");
                break;
            case saturday:
                System.out.println("Your day is saturday!");
                break;
            default:
                System.out.println("your day doesn't match.....");
                break;
        }
    }
}

