package Polymorphism.BurgerChallengeUpdated;

public class BurgerDeluxe extends Burger{

    Item deluxe1;
    Item deluxe2;

    public BurgerDeluxe(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        this.deluxe1 = new Item("Topping", extra4,0);

        this.deluxe2 = new Item("Topping", extra5, 0);

    }

    @Override
    public void listItem() {
        super.listItem();
        if (deluxe1 != null){
            deluxe1.printItem();
        }
        if (deluxe2 != null){
            deluxe2.printItem();
        }

    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
