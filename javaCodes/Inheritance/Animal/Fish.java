package Inheritance.Animal;

public class Fish extends Animal{

    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills){
        super(type,"small",weight);
        this.fins = fins;
        this.gills = gills;
    }

    public void moveMuscles(){
        System.out.println("moving muscles");
    }

    public void movingBackFin(){
        System.out.println("moving back fin");
    }

    @Override
    public void move (String speed){
        super.move(speed);
        moveMuscles();
        if (speed.equals("fast")){
            movingBackFin();
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
