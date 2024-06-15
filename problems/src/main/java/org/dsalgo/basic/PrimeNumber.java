package org.dsalgo.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 2;
        printPrimeNumbersBrutForce(n);
        printPrimeNumbersOptimizedMedium(n);
        printPrimeNumbersOptimized(n);
    }

    private static void printPrimeNumbersOptimizedMedium(final int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    private static void printPrimeNumbersOptimized(final int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    private static void printPrimeNumbersBrutForce(final int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
