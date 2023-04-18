package br.com.ada.first.appbanco.factory;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.service.ContaServiceUtils;
import br.com.ada.first.appbanco.service.depositar.Deposito;
import br.com.ada.first.appbanco.service.depositar.DepositoContaInvestimento;
import br.com.ada.first.appbanco.service.depositar.DepositoContaPadrao;

public class DepositoContaFactory {

    public static Deposito getDepositoConta(TipoConta tipo) {

        Deposito deposito = null;

        if (TipoConta.CI.equals(tipo)) {
            deposito = new DepositoContaInvestimento();
        } else {
            deposito = new DepositoContaPadrao();
        }

        return deposito;

    }

    public static Deposito getDepositoConta(Conta conta) {

        ContaServiceUtils contaServiceUtils = new ContaServiceUtils();
        TipoConta tipoConta = contaServiceUtils.getTipoConta(conta);
        return getDepositoConta(tipoConta);

    }

}