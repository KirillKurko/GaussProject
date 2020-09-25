package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[][] a = new double[][] {{-2.86, 1, 0, 0, 0},
                                        {1, -2, 1, 0, 0},
                                        {0, 1, -2, 1, 0},
                                        {0, 0, 1, -2, 1},
                                        {0, 0, 0, 1, -2.86}};
        double[] x = new double[] {0, -7, -7, -7, 0};
        double[] b = new double[] {0, -7, -7, -7, 0};

        GaussMethodUtility gaussMethodUtility = new GaussMethodUtility(a, x);

        double[] answer = gaussMethodUtility.gaussMethod();
        double discrepancy = gaussMethodUtility.calculateDiscrepancy(a, b, answer);

        System.out.println("Answer: " + Arrays.toString(answer));
        System.out.println("Discrepancy: " + discrepancy);
    }
}
