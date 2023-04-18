package br.com.ada.first.appbanco.entity;

public class ContaInvestimento extends Conta {

    private Pessoa cliente;

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
}