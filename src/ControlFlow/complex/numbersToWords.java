package ControlFlow.complex;

public class numbersToWords {
    public static void main(String[] args) {
        numberToWords(456);
        System.out.println(reverse(456));

    }
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        }
        int ans = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++){
            switch (ans % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            ans /= 10;
        }

    }
    public static int reverse (int number){
        int rnum = 0;
        while (number != 0){
            int lastDigit = number % 10;
            rnum = (rnum * 10) + lastDigit;
            number /= 10;
        }
        return rnum;
    }

    public static int getDigitCount (int number){
        int count = 1;

        if (number < 0){
            return -1;
        }

        while (number >= 10){
            number /= 10;
            count++;
        }
        return count;
    }
}
