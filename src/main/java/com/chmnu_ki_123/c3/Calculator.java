package com.chmnu_ki_123.k3;

import static java.lang.Math.*;

public class Calculator {
    public double calculate(double x, double a, double b, double c) {
        double expAx = exp(a * x);
        double tanBxC = tan(b * x + c);

        if ((a * x) - c <= 0) {
            throw new ArithmeticException("Logarithm argument must be positive!");
        }

        double log2AxC = log((a * x) - c) / log(2);
        double expBx2_1 = exp(b * pow(x, 2) - 1);

        return expAx * tanBxC + log2AxC / expBx2_1;
    }
}
