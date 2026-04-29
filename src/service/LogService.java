package service;

import model.Pedido;
import observer.PedidoObserver;

public class LogService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Log: model.Pedido " + pedido.getId() + " alterado para " + pedido.getStatus());
    }
}
