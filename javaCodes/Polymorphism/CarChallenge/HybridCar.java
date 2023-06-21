package Polymorphism.CarChallenge;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar (String name, double avgKmPerLitre, int cylinders, int batterySize){
        super(name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre(){
        return avgKmPerLitre;
    }

    public int getCylinders(){
        return cylinders;
    }

    public int getBatterySize(){
        return batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        if(super.description.equals("BMW")){
            System.out.println("Hybrid -> Has a inline-six");
        }
    }

    @Override
    protected void runEngine(){
        super.runEngine();
        System.out.printf("Hybrid -> Has consumed an average of %.2f gas ",avgKmPerLitre);
    }
}
