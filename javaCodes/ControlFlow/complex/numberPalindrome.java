package ControlFlow.complex;

public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-12321));
        System.out.println(isPalindrome(43234));
    }
    public static boolean isPalindrome(int number){

        if (number < 0)
        {
            number *= -1;
        }

        int reverse = 0;
        int store = number;
        while (store > 0){
            int lastDigit = store % 10;
            reverse = lastDigit + (reverse*10);
            store /= 10;
        }

        if (number == reverse){
            return true;
        }else
            return false;
    }
}
