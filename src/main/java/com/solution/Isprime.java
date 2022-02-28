package com.solution;

public class Isprime {

    public static void main(String[] args) {
        System.out.println("is 5 Prime: "+isPrime(5));
        System.out.println("is 15 Prime: "+isPrime(15));
        System.out.println("is 32 Prime: "+isPrime(32));
        System.out.println("is 67 Prime: "+isPrime(67));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
