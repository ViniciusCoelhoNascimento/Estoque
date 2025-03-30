package org.example.estado;

import org.example.Pedido;

public class PedidoEnviadoEstado  implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado!");
        pedido.setEstado(new PedidoPagoEstado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Erro: Pedido não foi pago!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Erro: Pedido não foi enviado!");
    }
}
