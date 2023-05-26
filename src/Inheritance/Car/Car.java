package Inheritance.Car;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private int doors = 2;
    private String color = "Black";
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setDoors (int doors){
        this.doors = doors;
    }

    public void setConvertible (boolean convertible){
        this.convertible = convertible;
    }

    public void displayCar(){
        System.out.println(doors+ " - Doors "
                           +make+ " "
                           +model+ " "
                           +color+ " "
                           +(convertible ? "Is convertible" :" "));
    }
}
