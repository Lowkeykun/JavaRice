package Inheritance.simpleCalculator;

public class calculatorMain {
    public static void main(String[] args) {
        Calculator calcu = new Calculator();
        calcu.setFirstNumber(5.0);
        calcu.setSecondNumber(4);
        System.out.println("add= " + calcu.getAdditionResult());
        System.out.println("subtract= " + calcu.getSubtractionResult());
        calcu.setFirstNumber(5.25);
        calcu.setSecondNumber(0);
        System.out.println("multiply= " + calcu.getMultiplicationResult());
        System.out.println("divide= " + calcu.getDivisionResult());
    }
}
