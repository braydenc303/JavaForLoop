package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        for(int i = 2; i < 5; i++) {
            System.out.println("10000 at " + i +"% interest = " + calculateInterest(10000.0, i));
        }
 
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }
}