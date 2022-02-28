package com.solution;

public class SumRange {

    public static void main(String[] args) {

        int[] ints = { 1, 20, 3, 10, -2, 100 };

        int result = solution.sumRange(ints);
        System.out.println("resultat " + result);
        System.out.println("expected result 130");

    }

    public static class solution {
        static int sumRange(int[] ints) {
            if (ints != null) {
                int sum = 0;
                for (int i = 1; i < ints.length; i++) {
                    int j = ints[i];
                    if (j >= 10 && j <= 100)
                        sum += j;

                }
                return sum;
            }
            return 0;
        }

    }
}
