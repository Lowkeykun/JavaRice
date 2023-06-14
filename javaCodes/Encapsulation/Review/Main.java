package Encapsulation.Review;

public class Main {
    public static void main(String[] args) {
//        Player jerome = new Player();
//        jerome.name = "Lowkey";
//        jerome.health = 100;
//        jerome.weapon = "Sword";
//
//        System.out.println(jerome.playerName());
//
//        jerome.playerStatus();
//        System.out.println("Remaining health = " +jerome.remainingHealth());
//
//
//        jerome.healthDamage(55);
//        System.out.println("Remaining health = " +jerome.remainingHealth());
//
//        jerome.healthDamage(1000);
//        System.out.println("Remaining health = " +jerome.remainingHealth());
//
//        jerome.playerStatus();
//
//        jerome.restoreHealth(1000);
//        System.out.println("Remaining health = " +jerome.remainingHealth());

        EnhancedPlayer lowkey = new EnhancedPlayer("Jerome",10000,"Sword");
        System.out.println(lowkey.remainingHealth());
    }
}
