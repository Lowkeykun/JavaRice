package Polymorphism.Computer;

public class PersonalComputer extends Product{
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer (Monitor monitor, Motherboard motherboard,
                             ComputerCase computerCase, String model, String manufacturer){
        super(model,manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    private void displayLogo(){
        monitor.drawPixelAt(1200,50,"Deep purple");
    }

    public void powerUp(){
        motherboard.loadProgram("MacOS Ventura ");
        displayLogo();
    }

//    public Monitor getMonitor(){
//        return monitor;
//    }
//
//    public Motherboard getMotherboard(){
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase(){
//        return computerCase;
//    }

}
