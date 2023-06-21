package Polymorphism.CarChallenge;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, double avgKmPerLitre, int cylinders){
        super(name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre(){
        return avgKmPerLitre;
    }

    public int getCylinders(){
        return cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        if (super.description.equals("Bugatti")){
            System.out.println("Gas -> Has a V8 engine");
        }
    }
    @Override
    protected void runEngine(){
        super.runEngine();
        System.out.printf("Gas -> Has consumed an average of %.2f gas %n",avgKmPerLitre);
    }
}
