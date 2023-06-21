package Polymorphism.BurgerChallenge;

import Polymorphism.BurgerChallengeUpdated.BurgerDeluxe;

import java.util.Scanner;


public class Burger extends MealOrder{
    static double total = 0;


    public Burger (String name){
        super(name);
    }

    @Override
    public void allOrder() {
        super.allOrder();
        burgerOrder();
    }

    public void burgerOrder(){
        Scanner input = new Scanner(System.in);
        int counterRegBurger = 0;
        int counterCheBurger = 0;
        int counterQuartBurger = 0;

        while(true) {
            System.out.print("""
                    Choose your burger:
                    [1] - Regular Burger (Php 75.00)
                    [2] - Cheese Burger (Php 150.00)
                    [3] - Quarter Pounder Burger (Php 200.00)
                    [4] - Main menu
                    I choose:
                    """);

            int pick = input.nextInt();


            if (pick == 1) {
                counterRegBurger++;
            } else if (pick == 2) {
                counterCheBurger++;
            } else if (pick == 3) {
                counterQuartBurger++;
            } else if (pick == 4) {
                break;
            }

            total = (double) (counterRegBurger * 75) + (counterCheBurger * 150) + (counterQuartBurger * 200);


        }
        System.out.printf("The total amount you order is Php%.2f", total);
    }

    public double getTotal(){
        return total;
    }

}
