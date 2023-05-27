package ControlFlow.complex;

import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean flag = false;
        int counter = 0;
        int min = 0;
        int max = 0;

        while (!flag){

            System.out.print("Enter a number: ");
            String num = input.nextLine();

            try{
                int convertedNum = Integer.parseInt(num);
                if (counter == 0 || convertedNum < min){
                    min = convertedNum;
                }
                if (counter == 0 || convertedNum > max){
                    max = convertedNum;
                }
                counter++;
            }catch (NumberFormatException e){
                System.out.println("Thank you for playing");
                flag = true;
                //break
            }

        }
        if (counter > 0) {
            System.out.println("Max value is " + max + " and Min value is " + min);
        } else {
            System.out.println("No data");
        }
    }
}
