package org.example;

import org.example.estrategia.DescontoNatal;
import org.example.estrategia.EstrategiaDesconto;
import org.example.nullObject.SemProgramaFidelidade;
import org.example.observer.Cliente;

public class Main {
    public static void main(String[] args) {
            Cliente cliente = new Cliente("João", new SemProgramaFidelidade());

            Pedido pedido = new Pedido();
            pedido.adicionarObservador(cliente);

            EstrategiaDesconto desconto = new DescontoNatal();
            double precoFinal = desconto.calcularDesconto(100.0);
            System.out.println("Preço com desconto: R$" + precoFinal);

            pedido.pagar();
            pedido.enviar();
    }
}