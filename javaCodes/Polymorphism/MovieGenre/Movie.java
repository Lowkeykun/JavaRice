package Polymorphism.MovieGenre;

public class Movie {
    protected String title;

    public Movie (String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+ " is a type of " +instanceType+ " film");
    }

    public static Movie movieType (String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public void pauseMovie(){
        System.out.println(title + "is pause");
    }

}

class Adventure extends Movie{

    public Adventure (String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s %n".repeat(3),
                          "Pleasant Scene",
                          "Scary Music",
                          "Something bad happens");
    }

    @Override
    public void pauseMovie(){
        super.pauseMovie();
        System.out.println(title + "adventure is pause");

    }
}

class Comedy extends Movie{

    public Comedy (String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s %n".repeat(3),
                         "Something funny happened",
                         "Funny Music",
                         "Enjoy things");
    }

    @Override
    public void pauseMovie(){

        System.out.println(title + "comedy is pause");

    }
}

class ScienceFiction extends Movie {
    public ScienceFiction (String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("... %s %n".repeat(3),
                         "Do bad aliens do bad things",
                         "Do earth revolve on sun",
                         "Who is the father of evolution");
    }

    @Override
    public void pauseMovie(){

        System.out.println(title + "ScienceFicton is pause");

    }

}
