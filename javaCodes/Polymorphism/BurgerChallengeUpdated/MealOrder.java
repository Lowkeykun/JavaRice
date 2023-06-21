package Polymorphism.BurgerChallengeUpdated;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("Regular","Coke", "Fries");
    }

    public MealOrder (String burgerName, String drinkName, String sideName){
        if (burgerName.equalsIgnoreCase("deluxe")){
            this.burger = new BurgerDeluxe(burgerName,8.5);
        }else {
            this.burger = new Burger(burgerName, 4);
        }
        this.drink = new Item("Drink",drinkName,2);
        this.side = new Item("Side",sideName,3);
    }

    public double getTotalPrice(){
        if (burger instanceof BurgerDeluxe) {
            return burger.adjustedPrice();
        }
        return burger.adjustedPrice() + drink.adjustedPrice() + side.adjustedPrice();

    }

    public void printItemList(){
        burger.printItem();
        if (burger instanceof BurgerDeluxe){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("=".repeat(30));
        Item.printItem("Total price: ",getTotalPrice());
    }

    public void addBurgerToppings (String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2,extra3);
    }

    public void addBurgerToppings (String extra1, String extra2, String extra3, String extra4, String extra5){
        if (burger instanceof BurgerDeluxe){
            ((BurgerDeluxe) burger).addToppings(extra1,extra2,extra3,extra4,extra5);
        } else {
            burger.addToppings(extra1,extra2,extra3);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }







}
