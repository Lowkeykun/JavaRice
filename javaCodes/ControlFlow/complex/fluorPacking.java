package ControlFlow.complex;
// bigcount = 5
// small count = 1

// (2, 1, 11) = True
// (2, 0, 12) = False
public class fluorPacking {
    public static void main(String[] args) {
        System.out.println(canPack(2,2,12));
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        // subtracting goal by 5 until there is no value for bigCount
        while (bigCount > 0 && goal >= 5){
            goal -= 5;
            bigCount--;
        }

        return smallCount >= goal;

    }
}
