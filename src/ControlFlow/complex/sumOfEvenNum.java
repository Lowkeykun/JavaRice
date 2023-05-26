package ControlFlow.complex;

public class sumOfEvenNum {
    public static void main(String[] args) {
        int num = 12345678;
        int sum = 0;
        while (num > 0) {
            int show = (num % 10);
            num = num / 10;

            if (show % 2 == 0){
                sum += show;
            }

        }
        System.out.println(sum);
    }
}
