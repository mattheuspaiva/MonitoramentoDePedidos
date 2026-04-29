package service;

import model.Pedido;
import observer.PedidoObserver;

public class EstoqueService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        if ("PAGO".equals(pedido.getStatus())) {
            System.out.println("ESTOQUE: Reservando itens do pedido" + pedido.getId());
        }
        else if ("CANCELADO".equals(pedido.getStatus())) {
            System.out.println("ESTOQUE: Devolvendo itens ao estoque do pedido " + pedido.getId());
        }
    }
}
