package Encapsulation.BankAccountChallenge;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);


        Account bankAccount = new Account();

        //System.out.println(bankAccount.getAccountBal());
        bankAccount.displayInfo();

        //boolean check;
        int check = 1;

        System.out.print("Enter an amount you want to withdraw: ");
        BigDecimal withdrawAmount = input.nextBigDecimal();

        bankAccount.withdrawFunds(withdrawAmount);

        bankAccount.displayInfo();

//        String cho;


//        do {
//
//            System.out.print("Do you want to make another withdraw? (y/n): ");
//            cho = input.nextLine();

//            if (cho.equals("n")) {
//                check = 2;
//            } else if (cho.equals("y")){
//                check = 1;
//                //break;
//            }

//            System.out.print("Enter an amount you want to withdraw: ");
//            withdrawAmount = input.nextBigDecimal();
//
//            bankAccount.withdrawFunds(withdrawAmount);
//
//            bankAccount.displayInfo();

//        }while(cho.equals("y"));
//
//        System.out.println("Thank you");
//
//        bankAccount.setWithdrawBal(withdrawAmount);
//        bankAccount.withdrawMoney(bankAccount.getAccountBal(),withdrawAmount);
//        BigDecimal input1 = new BigDecimal("1");
//        BigDecimal input2 = new BigDecimal("5");
//        BigDecimal input3 = new BigDecimal("13");


//        bankAccount.depositFunds(input2);
//        bankAccount.displayInfo();
//        bankAccount.depositFunds(input3);
//        bankAccount.displayInfo();
    }
}
