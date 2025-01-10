package br.com.dbc.vemser.aula_01_testes;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Não é possível dividir qualquer número por zero");
        }

        return a / b;
    }

    public double potenciacao(double numero, double potencia) {
        return Math.pow(numero, potencia);
    }
}
