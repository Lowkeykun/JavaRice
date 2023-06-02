package Strings;

public class stringBuilder {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloBuilder = new StringBuilder("Hello" + " World");
        helloBuilder.append(" and Goodbye");

        printInfo(helloWorld);
        printInfo(helloBuilder);

        StringBuilder testBuilder = new StringBuilder();
        testBuilder.append("A".repeat(17));
        StringBuilder testBuilder2 = new StringBuilder(32);
        testBuilder2.append("B".repeat(35));

        printInfo(testBuilder);
        printInfo(testBuilder2);


    }

    public static void printInfo (String string){
        System.out.println("String = " +string);
        System.out.println("Length = " +string.length());
    }

    public static void printInfo (StringBuilder builder){
        System.out.println("StringBuilder = " +builder);
        System.out.println("Length = " +builder.length());
        System.out.println("Capacity = " +builder.capacity());
    }
}
