package test.lab18;

public class Lab18 {
    static double f1(double x) {
        return x * x * x - 1.473 * x * x - 5.738 * x + 6.763;
    }

    static double f11(double x) {
        return 3.0 * x * x - 1.473 * 2.0 * x - 5.738;
    }

    static double f2(double x) {
        return x * x * x - 0.39 * x * x - 10.5 * x + 11.0;
    }

    static double nuton(double x, double eps) {
        double x0;
        do {
            x0 = x;
            //этот код ничего не делает, значения возвращаемые функциями f1 и f11, нигде не используются, можно удалить
            //по алгоритму вычисление этих функций имело бы смысл, если возвращаемые ими значения пристваивать переменным
            //и использовать их далее для вычислений
            //f1(x);
            //f11(x);
            //По алгоритму f1 и f11 вызываются от x0, а не от х, да х=х0 на этом шаге, но тем не менее
            x = x0 - f1(x0) / f11(x0);
            //х находится при интервале fabs(x-x0)<=eps, поэтому здесь должно быть строго >
            //while (fabs(x-x0)>=eps);
        } while (Math.abs(x - x0) > eps);
        return x;
    }

    static double hord(double a, double b, double eps1, double eps2) {
        double xk;
        do {
            //этот код ничего не делает, значения возвращаемые функцией f1, нигде не используются, можно удалить
            //и тут и далее должны быть вызовы f2, а не f1
            //f1(a);
            //f1(b);
            xk = a - f2(a) * (b - a) / (f2(b) - f2(a));
//            if (f2(xk) == 0) {
//                return xk;
//            }
            //удалить по аналогии выше
            //f1(xk);
            System.out.println("-----------------------");
            System.out.println("xk = " + xk);
            System.out.println("f2(a) = " + f2(a));
            System.out.println("f2(xk) = " + f2(xk));
            System.out.println("f2(a) * f2(xk) = " + f2(a) * f2(xk));
            if (f2(a) * f2(xk) < 0) {
                b = xk;
                //простое else тут не подходит, потому что в провеке не учитывается 0,а в алгоритме строгие неравенства < >
            } else if (f2(a) * f2(xk) > 0) {
                a = xk;
            }
            System.out.println("a = " + a + "; b = " + b);
            System.out.println("a - b = " + Math.abs(a - b) + "; " + "f2(xk) = " + Math.abs(f2(xk)));
            System.out.println(xk);
            //не развернула неравенства
            //} while (fabs(a-b)<=eps1&&fabs(f2(xk)<=eps2));
//        } while (Math.abs(f2(xk)) > eps2);
        } while (Math.abs(a - b) > eps1);
//        } while (Math.abs(a - b) > eps1 && Math.abs(f2(xk))>eps2);
//        } while (Math.abs(a - b) > eps1 || Math.abs(f2(xk))>eps2);
        return xk;
    }

    public static void main(String[] args) {
        double a = 0.0, b = 3.0, x = 0.0, eps1 = 0.01, eps2 = 0.000000000001, eps = 0.001;
        System.out.println("============================");
        System.out.println("Result #1 = " + nuton(x, eps));

        System.out.println("Result #2 = " + hord(a, b, eps1, eps2));
    }
}
