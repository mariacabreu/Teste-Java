package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test  // T01 - Soma
    void testSoma() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test  // T02 - Subtração
    void testSubtracao() {
        assertEquals(3, calc.subtrair(5, 2));
    }

    @Test  // T03 - Multiplicação
    void testMultiplicacao() {
        assertEquals(12, calc.multiplicar(4, 3));
    }

    @Test  // T04 - Divisão
    void testDivisao() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test  // T05 - Divisão por zero
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test  // T06 - Números negativos
    void testNumerosNegativos() {
        assertEquals(1, calc.somar(-2, 3));
    }

    @Test  // T07 - Números decimais
    void testNumerosDecimais() {
        assertEquals(5.0, calc.multiplicar(2.5, 2), 0.001);
    }
}