package model;

import observer.PedidoObserver;
import observer.PedidoSubject;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {
    private String id;
    private String status;
    private Cliente cliente;
    private List<PedidoObserver> observers;

    public Pedido(String id, String status, Cliente cliente) {
        this.id = id;
        this.status = status;
        this.cliente = cliente;
        this.observers = new ArrayList<>();
    }

    public String getId(){
        return this.id;
    }

    public String getStatus(){
        return this.status;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    @Override
    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(PedidoObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObserver() {
        for(PedidoObserver observer : observers){
            observer.atualizar(this);
        }
    }

    public void atualizarStatus(String status){
        if(status == null || status.isEmpty()){
            throw  new IllegalArgumentException("Status inválido");
        }
        this.status = status;
        notificarObserver();
    }
}
