package org.example.estado;

import org.example.Pedido;

public class PedidoPagoEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Erro: Pedido já está pago!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado para transporte!");
        pedido.setEstado(new PedidoEnviadoEstado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Erro: Pedido precisa ser enviado primeiro!");
    }

}
