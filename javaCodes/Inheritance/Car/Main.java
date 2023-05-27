package Inheritance.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Hilux");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertible(false);

        car.displayCar();

        System.out.println("Make = "+car.getMake());
        System.out.println("Model = "+car.getModel());
        System.out.println("Color = "+car.getColor());
        System.out.println("Doors = "+car.getDoors());
        System.out.println("Convertible? "+car.isConvertible());
    }
}
