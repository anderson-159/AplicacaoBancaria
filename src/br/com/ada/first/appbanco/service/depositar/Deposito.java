package br.com.ada.first.appbanco.service.depositar;

import br.com.ada.first.appbanco.entity.Conta;

import java.math.BigDecimal;

public interface Deposito {

    void depositar(Conta conta, BigDecimal valorDeposito);

}