package org.example;

import org.example.estado.EstadoPedido;
import org.example.estado.PedidoNovoEstado;
import org.example.estrategia.EstrategiaDesconto;
import org.example.observer.ObservadorPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private EstadoPedido estado;
    private List<ObservadorPedido> observadores = new ArrayList<>();
    private double valor;
    private EstrategiaDesconto estrategiaDesconto;

    public Pedido(double valor) {
        this.estado = new PedidoNovoEstado();
        this.valor = valor;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto){
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double getValor(){
        return this.valor;
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

    public double calcularValorFinal(){
        double desconto = (estrategiaDesconto != null) ? estrategiaDesconto.calcularDesconto(this.valor) : 0;
        return this.valor - desconto;
    }

}
