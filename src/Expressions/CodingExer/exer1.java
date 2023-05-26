package Expressions.CodingExer;

public class exer1 {
    public static void main(String[] args){
        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);

    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
       } else if (number < 0){
            System.out.println("Negative");
       } else{
            System.out.println("Zero");
       }
    }
}
