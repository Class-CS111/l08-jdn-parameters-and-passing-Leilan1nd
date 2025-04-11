// PARTNER NAME: Leilani Piland
// PARTNER NAME: 
// CS111 SECTION #: 111 3033
// DATE: 4/11/2025

public class Main {
    public static void main(String[] args)
    {
        //DECLARATION + INITIALIZATION SECTION
        int month = 0;
        int day = 0;
        int year = 0;
        int jdnDate = 0;
        //INPUT SECTION

        //calculation section
        month = 03;
        day = 03;
        year = 2020;
        jdnDate = Main.calcJulianDate(month, day, year);

        //output section
        System.out.println("The calculated Julian date for today is: " + jdnDate);
      

        month = 07;
        day = 20;
        year = 1969;
        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("the calculated Julian Date for the day the internet was born is: " + jdnDate);

        month = 01;
        day = 01;
        year = 2020;

        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("the calculated Julian Date for the day we landed on the moon is: " + jdnDate);

      ;
        
    }
    //DESCRIPTION: calculate julian date given month day and year 
    //PRECONDITION: valid integers for month day and year, month < 12
    //POSTCONDITION: return an integer, julian date
    public static int calcJulianDate(int month, int day, int year){
       int a = (14 - month) / 12;
       int m = month + 12 * a - 3;
       int y = year + 4800 - a;
       int jdnToday = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
       return (jdnToday);
    }
}