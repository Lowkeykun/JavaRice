package ControlFlow;

public class exer1 {
    public static void main(String[] args) {
        natoTest('A');

    }

    public static void natoTest(char letter) {
        switch(letter){
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("No message");
                break;
        }
    }
}
