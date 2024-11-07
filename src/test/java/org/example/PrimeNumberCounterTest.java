package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCounterTest {

    @DisplayName("Test if a number is prime")
    @Test
    void testIsPrime() {
        assertAll(
                () -> assertTrue(PrimeNumberCounter.isPrime(2), "2 should be prime"),
                () -> assertTrue(PrimeNumberCounter.isPrime(3), "3 should be prime"),
                () -> assertFalse(PrimeNumberCounter.isPrime(4), "4 should not be prime"),
                () -> assertTrue(PrimeNumberCounter.isPrime(5), "5 should be prime"),
                () -> assertFalse(PrimeNumberCounter.isPrime(0), "0 should not be prime"),
                () -> assertFalse(PrimeNumberCounter.isPrime(1), "1 should not be prime"),
                () -> assertFalse(PrimeNumberCounter.isPrime(-5), "-5 should not be prime")
        );
    }

    @DisplayName("Test countPrimes for valid inputs")
    @Test
    void testCountPrimes() {
        assertAll(
                () -> assertEquals(0, PrimeNumberCounter.countPrimes(0), "Count of primes up to 0 should be 0"),
                () -> assertEquals(1, PrimeNumberCounter.countPrimes(2), "Count of primes up to 2 should be 1"),
                () -> assertEquals(2, PrimeNumberCounter.countPrimes(3), "Count of primes up to 3 should be 2"),
                () -> assertEquals(4, PrimeNumberCounter.countPrimes(10), "Count of primes up to 10 should be 4"),
                () -> assertEquals(8, PrimeNumberCounter.countPrimes(20), "Count of primes up to 20 should be 8"),
                () -> assertEquals(168, PrimeNumberCounter.countPrimes(1000), "Count of primes up to 1000 should be 168")
        );
    }

    @DisplayName("Test sumPrimes for valid inputs")
    @Test
    void testSumPrimes() {
        assertAll(
                () -> assertEquals(0, PrimeNumberCounter.sumPrimes(0), "Sum of primes up to 0 should be 0"),
                () -> assertEquals(2, PrimeNumberCounter.sumPrimes(2), "Sum of primes up to 2 should be 2"),
                () -> assertEquals(5, PrimeNumberCounter.sumPrimes(3), "Sum of primes up to 3 should be 5"),
                () -> assertEquals(17, PrimeNumberCounter.sumPrimes(10), "Sum of primes up to 10 should be 17"),
                () -> assertEquals(129, PrimeNumberCounter.sumPrimes(30), "Sum of primes up to 30 should be 129"),
                () -> assertEquals(76127, PrimeNumberCounter.sumPrimes(1000), "Sum of primes up to 1000 should be 76127")
        );
    }

    @DisplayName("Test printCount method output")
    @Test
    void testPrintCount() {
        assertAll(
                () -> assertEquals("Hej, det finns 4 primtal mellan 0 och 10!", PrimeNumberCounter.printCount(10)),
                () -> assertEquals("Hej, det finns 25 primtal mellan 0 och 100!", PrimeNumberCounter.printCount(100)),
                () -> assertEquals("Hej, det finns 0 primtal mellan 0 och -1!", PrimeNumberCounter.printCount(-1))
        );
    }

    @DisplayName("Test printSum method output")
    @Test
    void testPrintSum() {
        assertAll(
                () -> assertEquals("Och den totala summan av dessa primtal är 17.", PrimeNumberCounter.printSum(10)),
                () -> assertEquals("Och den totala summan av dessa primtal är 1060.", PrimeNumberCounter.printSum(100)),
                () -> assertEquals("Och den totala summan av dessa primtal är 0.", PrimeNumberCounter.printSum(-1))
        );
    }

    @DisplayName("Test input validation")
    @Test
    void testIsValidInput() {
        assertAll(
                () -> assertTrue(PrimeNumberCounter.isValidInput(0), "0 should be a valid input"),
                () -> assertTrue(PrimeNumberCounter.isValidInput(500), "500 should be a valid input"),
                () -> assertTrue(PrimeNumberCounter.isValidInput(1000), "1000 should be a valid input"),
                () -> assertFalse(PrimeNumberCounter.isValidInput(-1), "-1 should be invalid"),
                () -> assertFalse(PrimeNumberCounter.isValidInput(1001), "1001 should be invalid")
        );
    }

    @DisplayName("Test invalid input handling in countPrimes and sumPrimes")
    @Test
    void testInvalidInputs() {
        assertAll(
                () -> assertEquals(0, PrimeNumberCounter.countPrimes(-1), "countPrimes should return 0 for invalid input"),
                () -> assertEquals(0, PrimeNumberCounter.countPrimes(1001), "countPrimes should return 0 for invalid input"),
                () -> assertEquals(0, PrimeNumberCounter.sumPrimes(-1), "sumPrimes should return 0 for invalid input"),
                () -> assertEquals(0, PrimeNumberCounter.sumPrimes(1001), "sumPrimes should return 0 for invalid input")
        );
    }
}
