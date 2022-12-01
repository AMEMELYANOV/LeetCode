package test.lab20;

import static java.lang.Math.*;

public class Lab20 {

    public static void main(String[] args) {
        double sum, big, t, E = 0.01;
        int n = 3, i, j, iter = 0, MAX = 50;
        double[][] a = {{1., 4., 2.}, {2., 7., 3.}, {0., 8., 1.}};
        double[] b = {3., 4., -5.};
        double[] x = {0., 0., 0.};

        do {
            iter += 1;// цикл по итерациям
            big = 0;
            for (i = 0; i < n; i++) { // цикл по уравнениям
                sum = 0.;
                if (i == 0) {
                    for (j = i + 1; j < n; j++) {
                        sum = sum + a[i][j] * x[j];
                    }
                } else {
                    for (j = 0; j < i; j++) {
                        sum = sum + a[i][j] * x[j];
                    }
                    if (j != n - 1) {
                        for (j = i + 1; j < n; j++) {
                            sum = sum + a[i][j] * x[j];
                        }
                    }
                }
                t = (1 / a[i][i]) * (b[i] - sum);
                if (abs(t - x[i]) > big) {
                    big = abs(t - x[i]);
                }
                x[i] = t;
            }
            if (big < E) {
                //заменить на goto: M
               break;
            }
        } while (iter < MAX);
        M:
        for (i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
