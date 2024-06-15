package org.dsalgo.teest;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // program to find given number is prime or not
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // program to find the feburonic series
    public int feburonicSeries(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return feburonicSeries(n - 1) + feburonicSeries(n - 2);
    }

    // program to find the factorial of a number
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // program to reverse a string
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    //program to find the sum of digits of a number
    public int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

}
