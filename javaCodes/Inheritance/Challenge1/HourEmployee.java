package Inheritance.Challenge1;

public class HourEmployee extends Employee{
    private double hourlyPayRate;

    public HourEmployee(String name, String birthDate, String hireDate,
                        double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return hourlyPayRate * 40;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }
}
