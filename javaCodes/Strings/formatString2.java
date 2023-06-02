package Strings;

public class formatString2 {
    public static void main(String[] args) {
        printInfo("Hello World");

        String helloWorld = "Hello World";
        System.out.printf("Index of r is located at %d %n",helloWorld.indexOf('r'));
        System.out.printf("Index of l is located at %d %n", helloWorld.lastIndexOf('l',8));   // <-----
        System.out.printf("Index of l is located at %d %n", helloWorld.indexOf('l',3));       // ----->


        String helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Value match");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value ignoring case");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Value match");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with world");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains world");
        }


    }

    public static void printInfo(String info){
        int length = info.length();
        System.out.printf("The length of the string is %d %n" ,length);
        System.out.printf("First character is %c %n" ,info.charAt(0));
        System.out.printf("Last character is %c %n" ,info.charAt(length - 1));
    }
}
