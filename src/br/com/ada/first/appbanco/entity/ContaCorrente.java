package br.com.ada.first.appbanco.entity;

public class ContaCorrente extends Conta {

    /**
     * cliente pessoa fisica ou juridica
     */
    private Pessoa cliente;

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }


}
