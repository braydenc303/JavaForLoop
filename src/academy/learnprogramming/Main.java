package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        for(int i = 8; i > 1; i--) {
            System.out.println("10000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }        
        System.out.println("------------------------");
        for(int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        int count = 0;
        
        for(int i = 2; i < 15; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count ==3) {
                    break;
                }
            }
        }
 
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }
}