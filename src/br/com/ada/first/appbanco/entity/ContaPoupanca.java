package br.com.ada.first.appbanco.entity;
public class ContaPoupanca extends Conta {

    private PessoaFisica cliente;

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }


}