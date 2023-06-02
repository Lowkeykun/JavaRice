package Strings;

public class manipulationString {
    public static void main(String[] args) {
        String birthDate = "03/05/2001";

        int index = birthDate.indexOf("2001");

        System.out.printf("The index of year is at %d %n" ,index);
        System.out.println("The value of the index is " + birthDate.substring(index));

        System.out.println("Month = " +birthDate.substring(3,5));    // lastIndex should add 1

        String newDate = String.join("/","03","04","2001");
        System.out.println(newDate);

        newDate = "03";
        newDate = newDate.concat("/");
        newDate = newDate.concat("05");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2001");
        System.out.println(newDate);

        newDate = "03" + "/" + "06" + "/" + "2001";
        System.out.println(newDate);

        newDate = "03".concat("/").concat("07").concat("/").concat("2001");
        System.out.println(newDate);

        System.out.println("<----------R E P L A C E ---------->");

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace('0','A'));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","-"));

        System.out.println("<----------R E P E A T ---------->");

        System.out.println("ABC\n".repeat(3).indent(4));
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("#".repeat(20));
    }
}
