package ControlFlow.complex;

public class getGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 20));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int gcd = 0;
        if (first < 10 && second < 10) {
            return -1;
        }

        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                System.out.print(i + " ");

            }
        }

        System.out.println(" ");

        for (int j = 1; j <= second; j++) {
             if (second % j == 0) {
                System.out.print(j + " ");
             }
        }

        for (int k = 1; k <= first && k <= second; k++)
            if (first % k == 0 && second % k == 0){
                gcd = k;
            }
        System.out.println();
        System.out.print("GCD is ");
        return gcd;
    }
}
