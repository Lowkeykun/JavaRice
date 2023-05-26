package Expressions.CodingExer;

public class Exer6 {
    public static void main(String[] args) {
        printYearsAndDays(500003);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            int hours = (int)minutes / 60;
            int days = hours / 24;
            int years = days / 365;
            int rny = days % 365;

            System.out.print(minutes+" min = "+years+ " y and "+rny+ " d");
        }
    }
}
