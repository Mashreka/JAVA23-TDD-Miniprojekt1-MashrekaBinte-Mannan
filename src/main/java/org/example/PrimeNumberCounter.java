package org.example;

public class PrimeNumberCounter {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Count primes range (0 to max)
    public static int countPrimes(int max) {
        if (!isValidInput(max)) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Sum primes range (0 to max)
    public static int sumPrimes(int max) {
        if (!isValidInput(max)) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Return the prime count
    public static String printCount(int max) {
        if (max < 0) {
            return "Hej, det finns 0 primtal mellan 0 och " + max + "!";
        }

        int count = countPrimes(max);
        return "Hej, det finns " + count + " primtal mellan 0 och " + max + "!";
    }

    // Return the sum of primes
    public static String printSum(int max) {
        if (max < 0) {
            return "Och den totala summan av dessa primtal är 0.";
        }

        int sum = sumPrimes(max);
        return "Och den totala summan av dessa primtal är " + sum + ".";
    }

    // Validate input range (0-1000)
    public static boolean isValidInput(int max) {
        if (max < 0 || max > 1000) {
            System.out.println("Hoppsan, fel intervall angivet!");
            return false;
        }
        return true;
    }

}
