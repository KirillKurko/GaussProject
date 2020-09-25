package com.company;

public class Main {

    public static void forwardMovement(double[][] a, double[] x) {
        int rowsAmount = a.length;
        int columnsAmount = a[0].length;
        for (int j = 0; j < rowsAmount - 1; ++j) {
            for (int i = j + 1; i < rowsAmount; ++i) {
                double temp = a[i][j];
                for (int k = 0; k < columnsAmount; ++k) {
                    a[i][k] -= a[j][k] * temp / a[j][j];
                    x[i] -= x[j] * temp / a[j][j];
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
