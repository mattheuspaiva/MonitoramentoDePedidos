package service;

import model.Pedido;
import observer.PedidoObserver;

public class EmailService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("EMAIL: model.Cliente " + pedido.getCliente().getNome() + " avisado sobre status " + pedido.getStatus());
    }
}
