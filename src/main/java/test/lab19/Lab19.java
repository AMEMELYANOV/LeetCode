package test.lab19;

public class Lab19 {

    public static void main(String[] args) {
        double[] b = {-4., -12., 11.};
        double[] m = new double[3];
        double[] x = new double[3];
        double s = 0;
        int n = 3, i, j, k;
//	cout << "n" << endl;
//	cin >> n;
//	cout << "a";
//	cout << "\n";
//	for (i = 0;i < n;i++) {
//		for (j = 0;j < n;j++) {
//			cout << "a[" << i << "][" << j << "]="; cin >> a[i][j];
//		}
//	}
//	cout << "b";
//	cout << "\n";
//	for (i = 0;i < n;i++) {
//		cout << "b[" << i << "]="; cin >> b[i];
//	}
//	cout << "\n";
        double[][] a = {{1., -1., 1.}, {5., -4., 3.}, {2.,  1., 1.}};

// цикл по уравнениям, которые вычитаются из остальных
        for (k = 0; k < n - 1; k++) {
// цикл по уравнениям, из которых в данный момент исключается неизвестное
            for (i = k + 1; i < n; i++) {
                m[i] = a[i][k] / a[k][k];
                a[i][k] = 0;
                for (j = k + 1; j < n; j++) {
                    a[i][j] = a[i][j] - m[i] * a[k][j];
                }
                b[i] = b[i] - m[i] * b[k];
            }
        }

        // Обратная подстановка
        /* индексация в массивах начинается с нуля, поэтому у последнего уравнения системы индекс равен n-1 */
        x[n - 1] = b[n - 1] / a[n - 1][n - 1];
        // цикл от предпоследнего уравнения к первому
        for (i = n - 2; i > -1; i--) {
            s = 0;
            for (j = i + 1; j < n; j++) {
                s = s + a[i][j] * x[j];
            }
            x[i] = (b[i] - s) / a[i][i];
        }

        // вывод вектора решений
        for (i = 0;i < n;i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
