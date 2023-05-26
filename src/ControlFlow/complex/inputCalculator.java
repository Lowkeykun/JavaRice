package ControlFlow.complex;

import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage (){
        int counter = 0;
        int sum = 0;
        long avg = 0;

        Scanner input = new Scanner (System.in);

        while (true){
            String num = input.nextLine();
            try{
                int convertedNum = Integer.parseInt(num);
                sum += convertedNum;
                counter++;

                avg = Math.round((double)sum / counter);

            } catch (NumberFormatException e){
                break;
            }
        }
        if (counter > 0){
            System.out.println("SUM = " +sum+ " AVG = " +avg);
        } else{
            System.out.println("SUM = " +sum+ " AVG = " +avg);
        }
    }
}
