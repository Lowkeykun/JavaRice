package Inheritance.Challenge1;

public class Main {
    public static void main(String[] args) {
        Worker jerome = new Worker("Jerome","03/05/2001");
        System.out.println(jerome);
        System.out.println("Age = " +jerome.getAge());
        System.out.println("Pay = " +jerome.collectPay());

        Employee kath = new Employee("Kathrina", "09/08/2001", "05/30/2023");
        System.out.println(kath);
        System.out.println("Age = " +kath.getAge());
        System.out.println("Pay = " +kath.collectPay());

        SalariedEmployee cj = new SalariedEmployee("Chris Jhon","05/03/2003","05/30/2023",35_000);
        System.out.println(cj);
        System.out.println(("Age = " +cj.getAge()));
        System.out.println("Pay = " +cj.collectPay());

        cj.retire();
        System.out.println("Pension of " +cj.collectPay());
        System.out.println(cj);

        HourEmployee geordan = new HourEmployee("Geordan","02/12/2001","02/28/2021",300);
        System.out.println(geordan);
        System.out.println("Pay = " +geordan.collectPay());
        System.out.println("Bonus = " +geordan.getDoublePay());




    }
}
