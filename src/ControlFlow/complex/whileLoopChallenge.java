package ControlFlow.complex;

public class whileLoopChallenge {
    public static void main (String[] args){
        int num = 4;
        int totalEven = 0;
        int totalOdd = 0;
        // if the condition is false the loop stops (while loop)
        // continue skips the statement
        while (num < 20){
            num++;
//            if (isEvenNumber(num)) {
//                System.out.println(num);
//                totalEven++;
//            }else
//                totalOdd++;

            if (!isEvenNumber(num)){
                totalOdd++;
                continue;
            }

            System.out.println(num);
            totalEven++;

            if (totalEven == 5) {
                break;
            }

        }


        System.out.println("There are "+totalEven+ " even numbers");
        System.out.println(("There are "+totalOdd+ " odd numbers"));
    }

    public static boolean isEvenNumber(int num){

        return num % 2 == 0 ? true : false;
    }
}
