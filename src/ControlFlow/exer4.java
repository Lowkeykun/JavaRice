package ControlFlow;

public class exer4 {
    public static void main(String[] args) {
        for (double i = 7; i <= 10; i += 0.25){
            double amount = 100;

            System.out.println("The amount of " +amount+ "php with an interest of " +i+ "% is "+calculateInterestRate(amount, i));
        }

    }

    public static double calculateInterestRate (double amount, double interest){

        return amount * (interest / 100);
    }
}
