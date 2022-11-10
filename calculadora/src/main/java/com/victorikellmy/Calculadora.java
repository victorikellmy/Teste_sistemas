package com.victorikellmy;

import java.lang.reflect.Constructor;

import javax.management.openmbean.InvalidOpenTypeException;

public class Calculadora {
    boolean calculadora;

    public Calculadora(boolean calculadora) {
        this.calculadora = calculadora;

    }

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtraçao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int divisao(int numero1, int numero2) {
        if (numero1 == 0 | numero2 == 0) {
            return 0;
        } else {
            return numero1 / numero2;
        }

    }

}
