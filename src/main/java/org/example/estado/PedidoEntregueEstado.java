package org.example.estado;

import org.example.Pedido;

public class PedidoEntregueEstado  implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Erro: Pedido já foi pago!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Erro: Pedido já foi enviado!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido já entregue!");
    }
}
