package com.solution;

import java.util.stream.IntStream;

public class RangeSum {
    public static void main(String[] args) {

        // java 8
        System.out.println(" Valeur avec java 8 : " + IntStream.range(0, 4).sum());

        // java 7
        int sum = 0;
        for (int i = 0; i < 4; i++) {

            sum = sum + i;
        }

        System.out.println(" Valeur avec java 7 : " + sum);





    }



}
