package org.example;

import org.example.estado.EstadoPedido;
import org.example.estado.PedidoNovoEstado;
import org.example.observer.ObservadorPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private EstadoPedido estado;
    private List<ObservadorPedido> observadores = new ArrayList<>();

    public Pedido() {
        this.estado = new PedidoNovoEstado();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public void adicionarObservador(ObservadorPedido observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (ObservadorPedido observador : observadores) {
            observador.atualizar(this);
        }
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public String getEstado() {
        return estado.getClass().getSimpleName();
    }

}
