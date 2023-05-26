package ControlFlow.complex;

import java.util.Scanner;

public class readingInputChallenge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counterNum = 1;
        double sum = 0;

        while (counterNum <= 5) {
            System.out.print("Enter number #" + counterNum + ": ");
            String numInput = input.nextLine();
            //int num = input.nextInt();
            try {
                //int num = Integer.parseInt(numInput);
                double num = Double.parseDouble(numInput);
                counterNum++;
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid syntax");
            }
        }
        System.out.println(sum);
        input.close();
    }

}
