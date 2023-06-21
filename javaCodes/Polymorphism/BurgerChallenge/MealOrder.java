package Polymorphism.BurgerChallenge;

public class MealOrder {

    protected String name;

    public MealOrder (String name){
        this.name = name;
    }

    public void allOrder(){
//        System.out.println(counterBurger);
//        System.out.println(counterDrink);
//        System.out.println(counterSides);
        System.out.println("Hello " +this.name+ " you order " +this.getClass().getSimpleName());
    }


    
    public String invalidOrder(){
        return "Sorry invalid order";
    }



    public static MealOrder order(String type, String name) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'B' -> new Burger(name);
            case 'D' -> new Drinks(name);
            case 'S' -> new Sides(name);
            default -> new MealOrder(name);
        };
    }
}
