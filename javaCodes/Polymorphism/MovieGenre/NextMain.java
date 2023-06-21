package Polymorphism.MovieGenre;

public class NextMain {
    public static void main(String[] args) {
        Movie infoMovie = Comedy.movieType("A", "Wolverine");
        infoMovie.watchMovie();

        //Different runtime types

        //{Adventure infoAdv = Adventure.movieType("A","Narnia");} //if you want to use a specific runtime it must be cast specific
        Adventure infoAdv = (Adventure)Movie.movieType("A", "Narnia");
        infoAdv.watchMovie();

        Object info = Comedy.movieType("C", "White Chicks");
        Comedy infoComedy = (Comedy) info;
        infoComedy.pauseMovie();

        var infoSciFi = Adventure.movieType("C","Transformers");     // var (type) helps us to identify the compile time type for us
        infoSciFi.watchMovie();

        //=============================================================================

        var comedMov = new Comedy("Grown Ups");
        comedMov.pauseMovie();

        Movie test = new ScienceFiction("Star Wars ");
        test.pauseMovie();

        Object test2 = new ScienceFiction("Avengers");
        ScienceFiction testSciFi = (ScienceFiction) test2;
        testSciFi.pauseMovie();


        Object test3 = Movie.movieType("C","Harry Potter");
        if(test3.getClass().getSimpleName().equals( "ScienceFiction")){
            ScienceFiction testScifi = (ScienceFiction) test3;
            testScifi.watchMovie();
        } else if (test3 instanceof Comedy){
            ((Comedy) test3).watchMovie();
        } else if (test3 instanceof Adventure testSyfy){
            testSyfy.watchMovie();
        }





    }
}
