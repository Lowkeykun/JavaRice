package Polymorphism.BurgerChallengeUpdated;


public class Item {
    private String type;
    private String name;
    private String size = "MEDIUM";
    private double price;

    public Item(String type, String name, double price){
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName(){
        if(type.equals("DRINK") || type.equals("SIDES")){
            return size.toUpperCase()+ " " +name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }

    public double adjustedPrice(){
        return switch (size.toUpperCase()){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size){
        this.size = size;
    }

    public static void printItem(String type, double price){
        System.out.printf("%20s: %6.2f%n",type ,price);
    }

    public void printItem(){
        printItem(getName(),adjustedPrice());
    }



}
