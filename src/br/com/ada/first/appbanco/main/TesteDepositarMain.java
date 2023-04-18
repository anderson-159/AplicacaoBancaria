package br.com.ada.first.appbanco.main;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.entity.Pessoa;
import br.com.ada.first.appbanco.entity.PessoaFisica;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.factory.AberturaContaFactory;
import br.com.ada.first.appbanco.factory.DepositoContaFactory;
import br.com.ada.first.appbanco.service.abrirconta.AberturaConta;
import br.com.ada.first.appbanco.service.depositar.Deposito;

import java.math.BigDecimal;

public class TesteDepositarMain {

    public static void main(String[] args) {

        Pessoa cliente = new PessoaFisica();
        cliente.setNome("Rodrigo");

        AberturaConta aberturaConta = AberturaContaFactory.getAberturaConta(TipoConta.CI);

        Conta conta = aberturaConta.abrirConta(cliente, "0002");

        Deposito deposito = DepositoContaFactory.getDepositoConta(conta);

        deposito.depositar(conta, new BigDecimal(100));

        System.out.println(conta);
    }

}