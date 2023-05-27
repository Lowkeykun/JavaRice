package Expressions;

public class challenge1 {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is "+ finalScore);
        }
    }
}
