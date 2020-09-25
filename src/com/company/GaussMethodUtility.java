package com.company;

public class GaussMethodUtility {

    private double[][] a;
    private double[] x;
    private int rowsAmount;
    private int columnsAmount;


    public  GaussMethodUtility(double[][] a, double[] x) {
        this.a = a;
        this.x = x;
        rowsAmount = a.length;
        columnsAmount = a[0].length;
    }

    private void forwardMovement() {
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

    private void reverseMovement(double[][] a, double[] x) {
        for (int j = rowsAmount - 1; j > 0; --j) {
            for (int i = j - 1; i >= 0; --i) {
                double temp = a[i][j];
                for (int k = columnsAmount - 1; k >= 0; --k) {
                    a[i][k] -= a[j][k] * temp / a[j][j];
                    x[i] -= x[j] * temp / a[j][j];
                }
            }
        }
    }

    private void calculateAnswer(double [][] a, double[] x) {
        for (int i = 0; i < rowsAmount; ++i) {
            x[i] /= a[i][i];
            a[i][i] /= a[i][i];
        }
    }
}
