package Inheritance.ConstructorChallenge;

public class Customer {

    public Customer(String customerName, String customerEmail, int creditLimit){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }

    public Customer(){
        this("Geordan Almonte","geordan@gmail.com");
        System.out.println("Empty Constructor called (no parameters)");;
    }

    public Customer(String customerName, String customerEmail){
        this(customerName,customerEmail,5_000);

    }


    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public double getCreditLimit(){
        return creditLimit;
    }
}
