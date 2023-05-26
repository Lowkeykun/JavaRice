package Expressions;

public class methodChallenge2 {
    public static void main (String[] args){
        System.out.println(convertToCentimeters(68));
        System.out.print(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int hNum){
//        double centi;
//        centi = (hNum * 2.54);
//        return centi;
        return hNum * 2.54;
    }

    public static double convertToCentimeters(int hNum, int iNum){
//        hNum *= 12;
//        double totalHeight;
//        int total = hNum + iNum;
//
//        totalHeight = convertToCentimeters(total);
        return convertToCentimeters((hNum * 12) + iNum);
    }
}
