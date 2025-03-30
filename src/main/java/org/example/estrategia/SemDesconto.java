package org.example.estrategia;

public class SemDesconto implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal;
    }
}
