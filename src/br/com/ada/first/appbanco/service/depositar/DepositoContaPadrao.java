package br.com.ada.first.appbanco.service.depositar;

import br.com.ada.first.appbanco.entity.Conta;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DepositoContaPadrao implements Deposito {

    @Override
    public void depositar(Conta conta, BigDecimal valorDeposito) {

        BigDecimal novoSaldo = conta.getSaldo().add(valorDeposito).setScale(2, RoundingMode.HALF_UP);

        conta.setSaldo(novoSaldo);

    }

}
