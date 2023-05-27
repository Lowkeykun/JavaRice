package Expressions.CodingExer;

public class Exer5{
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(15,5));
    }

    public static double area (double radius){ //area for circle
        if(radius < 0){
            return -1;
        }
        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y){ //area for rectangle
        if (x < 0){
            return -1;
        }

        if (y < 0){
            return -1;
        }

        return x * y;
    }
}
