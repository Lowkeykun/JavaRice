package Polymorphism.CarChallenge;

public class Car {
    protected String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println(this.description+ " starting engine...");
    }

    public void drive(){
        runEngine();
    }

    protected void runEngine(){
        System.out.println(this.description+ " running engine...");
    }

}
