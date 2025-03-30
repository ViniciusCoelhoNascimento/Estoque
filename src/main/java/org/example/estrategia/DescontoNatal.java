package org.example.estrategia;

public class DescontoNatal implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal * 0.9;
    }
}
