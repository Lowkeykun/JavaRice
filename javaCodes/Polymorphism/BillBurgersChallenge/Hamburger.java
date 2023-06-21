package Polymorphism.BillBurgersChallenge;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(){
        this("dsad","dasd",23,"weq");
    }

    public Hamburger (String name, String meat, double price, String breadRollType){
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double getBasePrice(){
        return price;
    }

    public void addHamburgerAddition1(String name, double price){
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3 (String name, double price){
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4 (String name, double price){
        addition4Name = name;
        addition4Price = price;
    }

    public double totalPrice(){

        return getBasePrice() + addition1Price + addition2Price + addition3Price + addition4Price;
    }

    public void itemizeHamburger(String name, String meat, String breadRollType, double price){
        System.out.printf("%s hamburger on a %s roll with %s , price is %.2f%n",name,meat,breadRollType,price);

    }

    public void printToppings(String name, double price){
        if(name != null && price != 0.00){
            System.out.println("Added "+name+ " for price "+price);
        }

    }

    public void allToppings(){
        printToppings(addition1Name, addition1Price);
        printToppings(addition2Name, addition2Price);
        printToppings(addition3Name, addition3Price);
        printToppings(addition4Name, addition4Price);
    }

    public double displayOrder(){
        itemizeHamburger(name,breadRollType,meat,price);
        allToppings();
        return totalPrice();
    }



}
