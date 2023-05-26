package ControlFlow.complex;

public class isPerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(78));
    }
    public static boolean isPerfectNumber (int number){
        int sum = 0;
        if (number < 1){
            return false;
        }

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                System.out.print(i + " ");
                sum += i;
            }

        }
        System.out.println("");
        System.out.print(sum + " = " + number+ " is ");

        if (number == sum){
            return true;
        }

        return false;
    }
}
