package br.com.ada.first.appbanco.factory;

import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.service.abrirconta.AberturaConta;
import br.com.ada.first.appbanco.service.abrirconta.AberturaContaCorrente;
import br.com.ada.first.appbanco.service.abrirconta.AberturaContaInvestimento;
import br.com.ada.first.appbanco.service.abrirconta.AberturaContaPoupanca;

public class AberturaContaFactory {

    public static AberturaConta getAberturaConta(TipoConta tipo) {
        AberturaConta aberturaConta = null;

        if (TipoConta.CC.equals(tipo)) {
            aberturaConta = new AberturaContaCorrente();
        } else if (TipoConta.CP.equals(tipo)) {
            aberturaConta = new AberturaContaPoupanca();
        } else if (TipoConta.CI.equals(tipo)) {
            aberturaConta = new AberturaContaInvestimento();
        }

        return aberturaConta;
    }

}
