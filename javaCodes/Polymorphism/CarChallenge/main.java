package Polymorphism.CarChallenge;

public class main {
    public static void main(String[] args) {
        Car buggati = new GasPoweredCar("Bugatti",45.00,8);
        runRace(buggati);

        Car bmw = new HybridCar("BMW",59.00,6,4);
        runRace(bmw);
    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();

    }
}
