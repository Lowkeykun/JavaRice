package Inheritance.Animal;


public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Chippo","medium",20);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky","Curled");
    }

    public Dog (String type, double weight, String earShape, String tailShape){
        super (type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + "'" +
                "} " + super.toString();
    }


    public void makeNoise() {
        if (type.equals("wolf")){
            System.out.println("Aaa woooh!");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println( getType()+ " walk and wag their tail");
        if (speed.equals("slow")){
            walk();
            wagTail();
        }else {
            bark();
            run();
        }
        System.out.println();
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public void run(){
        System.out.println(getType() + " is running");
    }

    public void walk(){
        System.out.println(getType() + " is walking");
    }

    public void wagTail(){
        System.out.println(getType() + " is wagging its tail");
    }
}
