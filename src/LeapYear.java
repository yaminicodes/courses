public class LeapYear{
    public void leapYearCal(int year){
        if(year%4 == 0){
            System.out.println("This " + year +" Year is a leap year");
        }
        else{
            System.out.println("This " + year + " is not a leap year");
        }
    }
}
class Calculate{
    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        ly.leapYearCal(2016);
        ly.leapYearCal(2005);
        ly.leapYearCal(2020);
    }
}
