package Polymorphism.BurgerChallengeUpdated;

public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super("Burger",name,price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double adjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.adjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.adjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.adjustedPrice());
    }

    public double getExtraPrice (String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.00;
            case "BACON", "HAM" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings (String extra1, String extra2, String extra3){
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("Topping", extra3, getExtraPrice(extra3));
    }

    public void listItem (){
        printItem("Base Burger", getBasePrice());
        if (extra1 != null){
            extra1.printItem();
        }
        if (extra2 != null){
            extra2.printItem();
        }
        if (extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        listItem();
        System.out.println("=".repeat(30));
        super.printItem();

    }


}
