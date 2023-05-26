package ControlFlow.complex;

public class addLastAndFirstDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }
    public static int sumFirstAndLastDigit (int number){

        if (number < 0){
            return -1;
        }

        //gets the last digit
        int last = number % 10;

        // gets the first number
        while (number >= 10){
           number /= 10;

        }

        return last + number;
    }
}
