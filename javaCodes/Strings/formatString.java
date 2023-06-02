package Strings;

public class formatString {
    public static void main(String[] args) {
        String bulletList = "Sample Bullet List \n" +
                            "\tFirst bullet: \n" +
                            "\t\tSecond bullet:";

        System.out.println(bulletList+"\n");

        String textBlock = """
                Sample Bullet List
                    First bullet:
                        Second bullet:
                """;

        System.out.println(textBlock);


        int age = 22;
        System.out.printf("Age is %d %n",age);

        int yearBirth = 2023 - age;
        System.out.printf("Your age is %d, Your year birth is %d %n",age, yearBirth);

        System.out.printf("Your age is %.2f %n",(float)age);

        String formatAge = String.format("Your age is %d",age);
        System.out.println(formatAge);

        String formattedAge = "Your age is %d".formatted(age);
        System.out.println(formattedAge);

        for (int i = 1; i <= 100_000; i *= 10){
            System.out.printf("The value is %6d %n",i);
        }


    }
}
