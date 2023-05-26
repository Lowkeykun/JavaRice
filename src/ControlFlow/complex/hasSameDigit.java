package ControlFlow.complex;

public class hasSameDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(43,74));
    }
    public static boolean hasSharedDigit (int num1 , int num2){
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){
            while (num1 >= 10 && num2 >= 10){
                int a1 = num1 % 10;
                int a2 = num1 / 10;

                int b1 = num2 % 10;
                int b2 = num2 / 10;

                if (a1 == b2 || a1 == b1 || a2 == b2 || a2 == b1){
                    return true;
                }else
                    return false;
            }
        }
        return false;
    }
}
