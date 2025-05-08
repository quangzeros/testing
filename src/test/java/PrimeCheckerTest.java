

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.PrimeChecker;


public class PrimeCheckerTest {

    PrimeChecker checker = new PrimeChecker();

    @Test
    void testNegativeNumber() {
        assertFalse(checker.isPrime(-5)); // covers: number <= 1
    }

    @Test
    void testTwo() {
        assertTrue(checker.isPrime(2)); // covers: for loop skipped
    }

    @Test
    void testNonPrime() {
        assertFalse(checker.isPrime(9)); // covers: enters for loop and returns false
    }

    @Test
    void testPrimeNumber() {
        assertTrue(checker.isPrime(7)); // covers: full path to return true after loop
    }
}