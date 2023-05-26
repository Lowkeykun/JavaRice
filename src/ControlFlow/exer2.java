package ControlFlow;

public class exer2 {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printWeekDay(3);
        printNumberInWord(5);
        printNum(6);

    }

    public static void printDayOfWeek (int day){
        String dayOfWeek = switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 3 -> {yield "Tuesday";}
            case 4 -> {yield "Wednesday";}
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid";
        };
        System.out.println(dayOfWeek);
    }

    public static void printWeekDay (int day){
        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("No message");
        }
    }

    public static void printNumberInWord (int number){
        String ans = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(ans);
    }

    public static void printNum (int numbe){
        switch (numbe){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;




        }
    }
}
