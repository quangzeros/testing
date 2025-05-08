package testing.src.main.java.com.example;
public class PrimeChecker {

    public boolean isPrime(int number) {
        if (number <= 1) return false; // rẽ nhánh
        for (int i = 2; i <= Math.sqrt(number); i++) { // vòng lặp
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " is prime? " + checker.isPrime(i));
        }
    }
}
