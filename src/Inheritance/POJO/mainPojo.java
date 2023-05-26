package Inheritance.POJO;

public class mainPojo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            Student stud = new Student("201900001" + i,
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

    }
}
