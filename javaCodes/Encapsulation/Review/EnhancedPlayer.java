package Encapsulation.Review;

public class EnhancedPlayer {
    private int health;
    private String name;
    private String weapon;

    public EnhancedPlayer (String name){
        this(name, 100 , "Katana");
    }

    public EnhancedPlayer(String name, int health, String weapon){
        this.name = name;
        if (health <= 0){
            this.health = 1;
        } else if (health > 100){
            this.health = 100;
        } else
            this.health = health;
        this.weapon = weapon;
    }

    public int remainingHealth(){
        return health;
    }
}
