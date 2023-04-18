package br.com.ada.first.appbanco.factory;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.service.ContaServiceUtils;
import br.com.ada.first.appbanco.service.sacar.RealizarSaque;
import br.com.ada.first.appbanco.service.sacar.Saque;

public class SaqueContaFactory {

    public static Saque getSaqueConta(TipoConta tipo) {

        Saque saque = new RealizarSaque();

        return saque;

    }

    public static Saque getSaqueConta(Conta conta) {

        ContaServiceUtils contaServiceUtils = new ContaServiceUtils();
        TipoConta tipoConta = contaServiceUtils.getTipoConta(conta);
        return getSaqueConta(tipoConta);

    }

}