package Expressions;

public class methodChallenge {
    public static void main (String[] args){
        
        int highScore = calculateHighScorePosition(1500);
        displayHighScore("Jerome", highScore); 

        highScore = calculateHighScorePosition(1000);
        displayHighScore("Kathrina", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScore("Charles", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScore("Geordan", highScore);

        highScore = calculateHighScorePosition(25);
        displayHighScore("Cedrick", highScore);
    

    }

    public static void displayHighScore(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the highscore list");
    }

    public static int calculateHighScorePosition (int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if ((playerScore >= 500) && (playerScore < 1000)){
            return 2;
        }
        else if ((playerScore >= 100) && (playerScore < 500)){
            return 3;
        }
        else{
            return 4;
        }

    }
}
