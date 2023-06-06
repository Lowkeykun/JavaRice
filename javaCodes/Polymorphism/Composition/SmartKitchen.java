package Polymorphism.Composition;

public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen(){
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
//        this.iceBox = iceBox;
//        this.dishWasher = dishWasher;
//        this.brewMaster = brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster(){
        return brewMaster;
    }

    public void setKitchenState (boolean fridgeFlag, boolean dishFlag, boolean coffeeFlag){
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishFlag);
        brewMaster.setHasWorkToDo(coffeeFlag);
    }

    public void doKitchenWork (){
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }


}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food");
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Washing Dishes");
        }
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee");
        }
    }
}
