package ControlFlow.complex;

public class diagonalStar {
    public static void main(String[] args) {
        printSquareStar(50);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1 || col == 0|| col == number - 1
                        || row == col || row + col == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
