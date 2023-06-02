package Encapsulation.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {

        //calling the main constructor
        Customer cust = new Customer("Jerome Felicilda", "felicilda980@gmail.com",10_000);

        // calling the default constructor (no parameters)
        Customer cust1 = new Customer();

        //calling the chaining constructor
        Customer cust3 = new Customer("Kathrina Moises","kathrina@gmail.com");

        System.out.println("Name - " +cust1.getCustomerName());
        System.out.println("Account email - " +cust1.getCustomerEmail());
        System.out.println("Credit limit - " +cust1.getCreditLimit());

        System.out.println();

        System.out.println("Name - " +cust.getCustomerName());
        System.out.println("Account email - " +cust.getCustomerEmail());
        System.out.println("Credit Limit - " +cust.getCreditLimit());

        System.out.println();

        System.out.println("Name - " +cust3.getCustomerName());
        System.out.println("Account email - " +cust3.getCustomerEmail());
        System.out.println("Credit Limit - " +cust3.getCreditLimit());
    }
}
