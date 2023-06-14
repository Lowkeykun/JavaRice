package Encapsulation.Review;

public class Player {
    public int health;
    public String name;
    public String weapon;

    public String playerName(){
        return name;
    }

    public void healthDamage (int damage){
        health -= damage;
    }

    public void playerStatus (){
        if (health <= 0){
            System.out.println("Player is knock down");
        } else
            System.out.println("Player is still alive");

    }

    public int remainingHealth (){
        if (health <= 0){
            health = 0;
        }
        return health;

    }

    public void restoreHealth (int heal){
        health += heal;

        if (health > 100){
            System.out.println("Player's health is restored at 100%");
            health = 100;
        }
    }




}
