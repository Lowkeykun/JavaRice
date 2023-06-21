package Polymorphism.BurgerChallengeUpdated;

public class Main {
    public static void main(String[] args) {
//        Item order1 = new Item("drink","coke",1.50);
//        order1.allMenu();
//        order1.setSize("large");
//        order1.allMenu();
//
//        Item order2 = new Item("meal","Chicken",80.00);
//        order2.allMenu();

//        Burger burger1 = new Burger("Aloha",4);
//        burger1.addToppings("cheese","avocado","mayo");
//        burger1.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.addBurgerToppings("Cheese","Mayo","Lettuce");
//        mealOrder.setDrinkSize("Small");
//        mealOrder.printItemList();

//        MealOrder mealOrder2 = new MealOrder("Cheese","Sprite","Nachos");
//        mealOrder2.printItemList();

        MealOrder mealOrder3 = new MealOrder("deluxe","Royal","Pasta");
        mealOrder3.printItemList();
        mealOrder3.addBurgerToppings("Lettuce", "Cheese", "Ham","Egg","Mayo");
        mealOrder3.printItemList();

    }
}
