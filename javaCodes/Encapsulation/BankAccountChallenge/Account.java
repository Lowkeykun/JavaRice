package Encapsulation.BankAccountChallenge;

import java.math.BigDecimal;

public class Account {
    private String customerName = "Jerome Felicilda";
    private String customerEmail = "felicilda980@gmail.com";
    private String accountNum = "098765475465";
    private BigDecimal accountBal = BigDecimal.valueOf(1_000_000);
    private BigDecimal withdrawBal = BigDecimal.ZERO;
    private String accountContactNum = "0902223123";


    public BigDecimal getAccountBal(){
        return accountBal;
    }

    public void setAccountBal(BigDecimal accountBal){
        this.accountBal = accountBal;
    }

    public BigDecimal getWithdrawBal(){
        return withdrawBal;
    }

    public void setWithdrawBal(BigDecimal withdrawBal){
        this.withdrawBal = withdrawBal;
    }

    public void displayInfo(){

        System.out.println("ACCOUNT INFORMATION \nAccount Name - " +customerName+
                           "\nAccount Number - " +accountNum+
                           "\nAccount Email - " +customerEmail+
                           "\nAccount Contact number - " +accountContactNum+
                           "\nRemaining Balance - " +accountBal+
                           "\n=================================================================================");
    }

    public void withdrawMoney(BigDecimal accountBal, BigDecimal withdrawBal){
        BigDecimal zero = BigDecimal.ZERO;

        if (accountBal.compareTo(withdrawBal) >= 0 && accountBal.compareTo(zero) > 0) {
            accountBal = accountBal.subtract(withdrawBal);
            //setWithdrawBal(ans);
            //displayInfo();

            System.out.println("Remaining balance: "+accountBal);
        }else {
            System.out.println("Invalid amount ");
        }
        System.out.println("=================================================================================");    }

    public void withdrawFunds (BigDecimal withdrawFund){
        BigDecimal zero = BigDecimal.ZERO;
        if ( accountBal.compareTo(withdrawFund) < 0){
            System.out.println("Insufficient fund! You only have Php" +accountBal+ " in your account");
        } else {
            accountBal = accountBal.subtract(withdrawFund);
            System.out.println("Successfully withdraw the amount of Php" +withdrawFund+ " You only have Php" +accountBal);
        }
        System.out.println("=================================================================================");
    }

    public void depositFunds (BigDecimal depositFund){
        BigDecimal zero = BigDecimal.ZERO;
        if (depositFund.compareTo(zero) < 0){
            System.out.println("Invalid Amount!");
        } else {
            accountBal = accountBal.add(depositFund);
            System.out.println("Successfully deposited amount of Php" +depositFund+ " You now have Php" +accountBal);
        }
        System.out.println("=================================================================================");
    }
}
