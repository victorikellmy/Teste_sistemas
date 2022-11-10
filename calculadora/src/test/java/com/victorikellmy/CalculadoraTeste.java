package com.victorikellmy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    /*
     * @Test
     * void executar() {
     * Calculadora calculadora = new Calculadora(true);
     * assertTrue(calculadora.calculadora);}
     */
    @Test
    @DisplayName("Soma de dois inteiros")
    void deveriaSomarInteiros() {
        Calculadora calculadora = new Calculadora(true);
        assertEquals(2, calculadora.soma(1, 1));
    }

    @Test
    @DisplayName("Subtraçao de dois inteiros")
    void deveriaSubtrairInteiros() {
        Calculadora calculadora = new Calculadora(true);
        assertEquals(0, calculadora.subtraçao(1, 1));
    }

    @Test
    @DisplayName("divisao de dois inteiros")
    void deveriaDivisaoInteiros() {
        Calculadora calculadora = new Calculadora(true);
        assertEquals(0, calculadora.divisao(1, 0));
    }
}
