package Polymorphism.Composition;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getIceBox().orderFood();

        SmartKitchen kitchen2 = new SmartKitchen();

        kitchen2.setKitchenState(true,true,true);
        kitchen2.doKitchenWork();

    }
}
