package Expressions;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(SnM(65,45));
        System.out.println(SnM(3945));
        System.out.println(SnM(-65, 45));
        System.out.println(SnM(65,145));
    }
    public static String SnM(int sec){
        if (sec < 0) {
            return "Invalid syntax";
        }
//        } else{
//            int totalM = sec / 60;
//            //int remainSec = sec % 60;
//           String msg = SnM( totalM,sec);
           return SnM(sec /60, sec % 60);
        }



    public static String SnM(int min, int sec) {
        //int totalMin = min + (sec / 60 );
        int remainMin = min % 60;
        //int remainSec = sec % 60;
        int hours = min / 60;

        if (min < 0) {
            return "invalid syntax for min " + min+ " it must be positive";
        }
        if (sec <= 0 || sec >= 59) {
            return "invalid syntax for sec "+sec+ " it must between 0 to 59";
        }

        return hours + "h " + remainMin + "m " + sec + "s";

    }
}

