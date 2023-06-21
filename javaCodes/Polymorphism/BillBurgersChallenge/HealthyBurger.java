package Polymorphism.BillBurgersChallenge;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy",meat,price,"Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public void allToppings() {
        super.allToppings();
        printToppings(healthyExtra1Name,healthyExtra1Price);
        printToppings(healthyExtra2Name,healthyExtra2Price);
    }

    @Override
    public double displayOrder() {
        return super.displayOrder() + healthyExtra1Price + healthyExtra2Price;
    }
}
