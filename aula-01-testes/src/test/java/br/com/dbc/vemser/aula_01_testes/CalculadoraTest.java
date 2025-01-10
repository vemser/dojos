package br.com.dbc.vemser.aula_01_testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar dois números positivos e retornar a soma matemática esperada")
    void testSomaComAlgarismosPositivos() {
        //AAA - Arrange, Act, Assert

        //Arrange
        double a = 2;
        double b = 6;

        //Act
        double resultado = calculadora.somar(a, b);

        //Assert
        assertEquals(8.0, resultado);
    }

    @Test
    void testSomaComAlgarismoNegativo() {
        double a = 5.0;
        double b = -5.0;

        double resultado = calculadora.somar(a, b);

        // 5 + (-5);
        assertEquals(0, resultado);
        assertNotEquals(10, resultado);
    }

    @Test
    void testSubtracaoDeDoisNumerosPositivos() {
        double a = 10.0;
        double b = 5.0;

        double resultado = calculadora.subtrair(a, b);

        assertEquals(5, resultado);
    }

    @Test
    void testSubtracaoComUmNumeroNegativo() {
        double a = 10.0;
        double b = -5.0;

        double resultado = calculadora.subtrair(a, b);

        assertEquals(15, resultado);
    }

    @Test
    void testMultiplicarComAlgarismosPositivos() {
        double a = 8.0;
        double b = 8.0;
        double resultadoEsperado = 64.0;

        double resultado = calculadora.multiplicar(a, b);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testDivisaoMatematicamenteCorreta() {
        double a = 10.0;
        double b = 2.0;
        double resultadoEsperado = 5.0;

        double resultado = calculadora.dividir(a, b);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testDivisaoMatematicamenteImpossivel() {
        double a = 10.0;
        double b = 0.0;

        assertThrows(ArithmeticException.class, () -> calculadora.dividir(a, b));
    }

    @Test
    void testPotenciacaoCorreta(){
        double numero = 5.0;
        double potencia = 2.0;
        double resultadoEsperado = 25.0;

        double resultado = calculadora.potenciacao(numero, potencia);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testPotenciacaoZeroRetornaUm() {
        double numero = 5.0;
        double potencia = 0.0;
        double resultadoEsperado = 1.0;

        double resultado = calculadora.potenciacao(numero, potencia);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testPotenciacaoNumeroNegativo() {
        double numero = 5.0;
        double potencia = -2.0;
        double resultadoEsperado = 0.04;

        double resultado = calculadora.potenciacao(numero, potencia);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testRadiciacaoNumeroPositivo() {
        double a = 4.0;
        double resultadoEsperado = 2;

        double resultado = calculadora.radiciacao(a);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testRadiciacaoNumeroNegativo() {
        double a = -4.0;

        assertThrows(ArithmeticException.class, () -> calculadora.radiciacao(a));
    }
}