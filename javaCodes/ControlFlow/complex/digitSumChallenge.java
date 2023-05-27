package ControlFlow.complex;

public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int num){
        int sum = 0;
        if (num < 0){
            return -1;
        }else
            while(num > 9){
                sum += (num % 10);
                num /= 10;
            }

        sum += num;
        return sum;

    }
}
