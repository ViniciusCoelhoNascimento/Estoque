package org.example;

import org.example.estrategia.DescontoNatal;
import org.example.estrategia.EstrategiaDesconto;
import org.example.nullObject.SemProgramaFidelidade;
import org.example.observer.Cliente;

public class Main {
    public static void main(String[] args) {
            // Configuração do cliente com Null Object
            Cliente cliente = new Cliente("João", new SemProgramaFidelidade());

            // Criação do pedido
            Pedido pedido = new Pedido();
            pedido.adicionarObservador(cliente); // Registra o observador

            // Aplica estratégia de desconto
            EstrategiaDesconto desconto = new DescontoNatal();
            double precoFinal = desconto.calcularDesconto(100.0);
            System.out.println("Preço com desconto: R$" + precoFinal);

            // Processamento do pedido
            pedido.pagar();
            pedido.enviar();
    }
}