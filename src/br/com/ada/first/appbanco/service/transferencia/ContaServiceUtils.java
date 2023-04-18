package br.com.ada.first.appbanco.service;

import br.com.ada.first.appbanco.entity.*;
import br.com.ada.first.appbanco.enums.TipoConta;

public class ContaServiceUtils {

    public Pessoa getClienteConta(Conta conta) {

        Pessoa cliente = null;

        if (conta instanceof ContaCorrente) {
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            cliente = contaCorrente.getCliente();
        } else if (conta instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            cliente = contaPoupanca.getCliente();
        } else if (conta instanceof ContaInvestimento) {
            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
            cliente = contaInvestimento.getCliente();
        }

        return cliente;

    }

    public TipoConta getTipoConta(Conta conta) {

        if (conta instanceof ContaCorrente) {
            return TipoConta.CC;
        } else if (conta instanceof ContaPoupanca) {
            return TipoConta.CP;
        } else if (conta instanceof ContaInvestimento) {
            return TipoConta.CI;
        } else {
            throw new RuntimeException("Tipo conta nao encontrado");
        }

    }

}
