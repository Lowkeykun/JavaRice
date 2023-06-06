package Polymorphism.Computer;

public class Main {
    public static void main(String[] args) {

        Monitor theMonitor = new Monitor("27 inch XDR","Apple", 27, "2540 x 1440");
        ComputerCase theCase = new ComputerCase("Mac Studio", "Apple","500");
        Motherboard theMotherboard = new Motherboard("M2 Ultra", "Apple", 96,6, "MacOS Ventura");
        PersonalComputer thePC = new PersonalComputer(theMonitor, theMotherboard, theCase,"Mac Studio","Apple");

//        thePC.getMotherboard().loadProgram("MacOS Ventura ");
//        thePC.getMonitor().drawPixelAt(5,2,"Deep purple");

        //composition

        thePC.powerUp();
    }
}
