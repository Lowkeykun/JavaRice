package Encapsulation.POJO;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            Interns stud = new Interns("201900001" + i,
                    switch(i){
                        case 1 -> "Jerome Felicilda";
                        case 2 -> "Kathrina Moises";
                        case 3 -> "Geordan Almonte";
                        case 4 -> "James De Guzman";
                        case 5 -> "Charles Zabanal";
                        default -> "Anonymous person";
                    },
                    "03/05/1994",
                    "JavaRice Practice");
            System.out.println(stud);
        }

        Student stud = new Student("202000001",
                "Rasty Ferrer",
                "06/25/1995",
                "JavaRice Class");

        System.out.println("Name: "+stud.getName()+
                           "\nClass: " +stud.getSubjectClass());

    }
}
