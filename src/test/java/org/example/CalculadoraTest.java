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

    // ==================== SOMA ====================

    @Test // Soma de positivos
    void testSomaPositivos() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test // Soma com zero
    void testSomaComZero() {
        assertEquals(3.0, calc.somar(3, 0));
    }

    @Test // Soma de negativos
    void testSomaNegativos() {
        assertEquals(-5.0, calc.somar(-2, -3));
    }

    @Test // Soma de negativo com positivo
    void testSomaNegativoPositivo() {
        assertEquals(1.0, calc.somar(-2, 3));
    }

    @Test // Soma de decimais
    void testSomaDecimais() {
        assertEquals(5.5, calc.somar(2.5, 3.0), 0.001);
    }

    @Test // Soma de números grandes
    void testSomaGrandes() {
        assertEquals(2000000000.0, calc.somar(1000000000, 1000000000), 0.001);
    }

    // ==================== SUBTRAÇÃO ====================

    @Test // Subtração de positivos
    void testSubtracaoPositivos() {
        assertEquals(3.0, calc.subtrair(5, 2));
    }

    @Test // Subtração com zero
    void testSubtracaoComZero() {
        assertEquals(5.0, calc.subtrair(5, 0));
    }

    @Test // Subtração com resultado negativo
    void testSubtracaoResultadoNegativo() {
        assertEquals(-3.0, calc.subtrair(2, 5));
    }

    @Test // Subtração de negativos
    void testSubtracaoNegativos() {
        assertEquals(-1.0, calc.subtrair(-3, -2));
    }

    @Test // Subtração de decimais
    void testSubtracaoDecimais() {
        assertEquals(0.5, calc.subtrair(2.5, 2.0), 0.001);
    }

    @Test // Subtração de números grandes
    void testSubtracaoGrandes() {
        assertEquals(0.0, calc.subtrair(1000000000, 1000000000), 0.001);
    }

    // ==================== MULTIPLICAÇÃO ====================

    @Test // Multiplicação de positivos
    void testMultiplicacaoPositivos() {
        assertEquals(12.0, calc.multiplicar(4, 3));
    }

    @Test // Multiplicação por zero
    void testMultiplicacaoPorZero() {
        assertEquals(0.0, calc.multiplicar(5, 0));
    }

    @Test // Multiplicação por um
    void testMultiplicacaoPorUm() {
        assertEquals(7.0, calc.multiplicar(7, 1));
    }

    @Test // T16 - Multiplicação de negativos
    void testMultiplicacaoNegativos() {
        assertEquals(6.0, calc.multiplicar(-2, -3));
    }

    @Test // Multiplicação de negativo com positivo
    void testMultiplicacaoNegativoPositivo() {
        assertEquals(-6.0, calc.multiplicar(-2, 3));
    }

    @Test // Multiplicação de decimais
    void testMultiplicacaoDecimais() {
        assertEquals(5.0, calc.multiplicar(2.5, 2), 0.001);
    }

    @Test // Multiplicação de números grandes
    void testMultiplicacaoGrandes() {
        assertEquals(999998000001.0, calc.multiplicar(999999, 999999), 0.001);
    }

    // ==================== DIVISÃO ====================

    @Test // Divisão de positivos
    void testDivisaoPositivos() {
        assertEquals(5.0, calc.dividir(10, 2));
    }

    @Test // Divisão por zero
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test // Divisão com resultado decimal
    void testDivisaoResultadoDecimal() {
        assertEquals(2.5, calc.dividir(5, 2), 0.001);
    }

    @Test // Divisão de negativos
    void testDivisaoNegativos() {
        assertEquals(2.0, calc.dividir(-6, -3));
    }

    @Test // Divisão de negativo por positivo
    void testDivisaoNegativoPorPositivo() {
        assertEquals(-3.0, calc.dividir(-6, 2));
    }

    @Test // Divisão de zero por número
    void testDivisaoZeroPorNumero() {
        assertEquals(0.0, calc.dividir(0, 5));
    }

    @Test // Divisão por um
    void testDivisaoPorUm() {
        assertEquals(8.0, calc.dividir(8, 1));
    }

    @Test // Divisão de números grandes
    void testDivisaoGrandes() {
        assertEquals(1.0, calc.dividir(1000000000, 1000000000), 0.001);
    }
}