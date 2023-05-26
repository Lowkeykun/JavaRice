package ControlFlow.complex;

public class primeChallenge {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 9;i <= 1000; i++){
            if(isPrime(i)){
                System.out.println("Number "+i+ " is a prime");
                counter++;
                }
//            if (counter >= 3){
//                break;
//            }

        }

        System.out.println("There are "+counter+ " primes");
    }

    public static boolean isPrime (int num){
        if (num <= 1 || num % 2 == 0){
            return false;
        }
        if (num == 2){
            return true;
        }

        int bound = (int)Math.floor(Math.sqrt(num));
        for (int i = 3; i <= bound; i+=2){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
