package Polymorphism.CarChallenge;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar (String name, double avgKmPerCharge, int batterySize){
        super(name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge(){
        return avgKmPerCharge;
    }

    public int getBatterySize(){
        return batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        if (super.description.equals("Tesla")){
            System.out.println("Electric -> Has a AWD");
        }
    }

    @Override
    protected void runEngine(){
        super.runEngine();
        System.out.printf("Electric -> Has consumed an average of %.2f gas %n",avgKmPerCharge);
    }
}
