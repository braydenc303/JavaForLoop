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

        System.out.println(sum3and5());
 
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

    public static int sum3and5() {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
            }
            if(count==5){
                break;
            }
        }
        return sum;
    }
}