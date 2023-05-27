package Expressions.CodingExer;

public class exer4 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));

    }
            
    public static boolean shouldWakeUp(boolean barks, int hourOfDay){
        if (barks == true){
            if ((hourOfDay < 0) || (hourOfDay > 23) || ((hourOfDay > 7) && (hourOfDay <23))) {
                return false;
            }else {
                return true;
            }
        } 
        return false;
    }
}