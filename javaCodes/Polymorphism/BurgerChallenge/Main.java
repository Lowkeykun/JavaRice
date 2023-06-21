package Polymorphism.BurgerChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Choose your order:
                [B] - Burgers
                [D] - Drinks
                [S] - Sides
                """);

        String choose = input.nextLine();

        MealOrder order1 = MealOrder.order(choose,"Jerome");
        order1.allOrder();

//        public static void totalCost(MealOrder lahat){
//
//        }
        System.out.println(Burger.total);
        order1.allOrder();
        System.out.println(Burger.total);


    }
}
