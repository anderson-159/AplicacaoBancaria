package br.com.ada.first.appbanco.service.sacar;

import br.com.ada.first.appbanco.entity.Conta;

import java.math.BigDecimal;

public class RealizarSaque implements Saque {

    @Override
    public void sacar(Conta conta, BigDecimal valorSaque) {
        Saque.super.sacar(conta, valorSaque);
    }

}

