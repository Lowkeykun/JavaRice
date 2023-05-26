package Expressions.CodingExer;


public class exer2 {
        // write your code here
        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour < 0){
                return -1;
            } else{
                double kps = kilometersPerHour / 1.609;
                return Math.round(kps);
                //return ans;
            }
        }
        
        public static void printConversion (double kilometersPerHour){
            if (kilometersPerHour < 0){
                System.out.print("Invalid Value");
            } else {
               long miles = toMilesPerHour(kilometersPerHour);
                System.out.print(kilometersPerHour + " km/h = " +miles+ " mi/h");
            }
        }
    
}
