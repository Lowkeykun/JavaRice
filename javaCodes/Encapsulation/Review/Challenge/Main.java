package Encapsulation.Review.Challenge;

public class Main {
    public static void main(String[] args) {

        Printer canon = new Printer(2,true);
        System.out.println(canon.printPages(5));

        Printer samsung = new Printer(1,false);
        System.out.println(samsung.printPages(5));

        Printer apple = new Printer(-5,true);
        System.out.println("Current printed pages " +apple.getPagesPrinted());
        int pagesPrinted = apple.printPages(7);
        System.out.println("Current print " +pagesPrinted+ " All printed pages are " +apple.getPagesPrinted());
        pagesPrinted = apple.printPages(4);
        System.out.println("Current print " +pagesPrinted+ " All printed pages are " +apple.getPagesPrinted());
    }
}
