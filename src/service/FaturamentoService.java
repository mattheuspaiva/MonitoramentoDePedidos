package service;

import model.Pedido;
import observer.PedidoObserver;

public class FaturamentoService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        if ("PAGO".equals(pedido.getStatus())) {
            System.out.println("FATURAMENTO: Gerando lançamento financeiro do pedido " + pedido.getId());
        }
        else if ("CANCELADO".equals(pedido.getStatus())) {
            System.out.println("FATURAMENTO: Estornando valores do pedido " + pedido.getId());
        }
    }
}
