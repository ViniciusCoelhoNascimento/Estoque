package org.example.observer;

import org.example.Pedido;
import org.example.nullObject.ProgramaFidelidade;

public class Cliente implements ObservadorPedido{
    private String nome;
    private ProgramaFidelidade programaFidelidade;

    public Cliente(String nome, ProgramaFidelidade programaFidelidade) {
        this.nome = nome;
        this.programaFidelidade = programaFidelidade;
    }

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("[Cliente " + nome + "] Status do pedido atualizado: " + pedido.getEstado());
    }

}
