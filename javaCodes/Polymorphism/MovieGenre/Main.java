package Polymorphism.MovieGenre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie myMovie = new Adventure("Spiderman");
//        myMovie.pauseMovie();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    ======================================================
                    List of Genre:
                    [A] - Adventure Film
                    [C] - Comedy Film
                    [S] - Science Fiction film
                    [E] - Exit
                    ======================================================
                    I choose: """);


            String type = input.nextLine();

            if ("Ee".contains(type)){
                break;
            }

            System.out.print("What is the title of the movie: ");
            String title = input.nextLine();

            Movie info = Movie.movieType(type, title);
            info.watchMovie();
        }

        System.out.println("Thank you!");


    }
}
