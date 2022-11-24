package org.example;

import java.util.Objects;

public class Calculadora {




    public int sum(int arg1, int arg2){
        return arg1 + arg2;
    }

    public int mul(int arg1, int arg2){
        return arg1 * arg2;
    }

    public double div(double arg1,double arg2){
        Objects.requireNonNull(arg1);
        Objects.requireNonNull(arg2);
        return arg1 / arg2;
    }

    public int rest(int arg1, int arg2){
        return arg1 - arg2;
    }

    public String comp (int arg1){
        if (arg1>= 0){
            return "Positivo";
        } else {
            return "Negativo";
        }
    }

    public String trian (int arg1, int arg2, int arg3) {
        if (arg1 == arg2 && arg2 == arg3)
            return "Equilatero";
        else if (arg1 == arg2 || arg2 == arg3 || arg1 == arg3)
            return "Isosceles";
        else
            return "Escaleno";
    }
}

