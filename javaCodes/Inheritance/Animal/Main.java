package Inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mammal","Small",89);
        System.out.println(animal);

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog ej = new Dog("Ej",20);
        doAnimalStuff(ej,"slow");



        Dog brownie = new Dog("brownie",50,"Oblong","Spiky");
        doAnimalStuff(brownie,"fast");

        Dog wolf = new Dog("wolf",10);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("Goldfish",0.5,3,2);
        doAnimalStuff(goldie,"fast");

    }

    public static void doAnimalStuff (Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("===============");
    }
}
