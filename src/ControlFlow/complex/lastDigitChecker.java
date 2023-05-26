package ControlFlow.complex;

public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(42,23,15));
        System.out.println(hasSameLastDigit(45,78,35));
        System.out.println(hasSameLastDigit(9,59,100));
        System.out.println(hasSameLastDigit(89,79,69));

        System.out.println(isValid(10));
        System.out.println(isValid(8));
    }
    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num2 >= 10 && num2 <= 1000)){
            num1 %= 10;
            num2 %= 10;
            num3 %= 10;

            if (num1 == num2 || num2 == num3 || num1 == num3){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int num1){
        if (num1 >= 10 && num1 <= 1000){
            return true;
        }

        return false;
    }
}
