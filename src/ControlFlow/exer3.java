package ControlFlow;

public class exer3 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        isLeapYear(2020);
        System.out.println(getDaysInMonth(2,2020));
        getDaysInMonth(2,1998);
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year){
        if (month < 1 || month > 12 ){
            return -1;
        }
        if (year < 1 || year > 9999){
            return -1;
        }

        if (isLeapYear(year) && month == 2){
            return 29;
        }

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }

}
