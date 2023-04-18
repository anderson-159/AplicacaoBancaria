package br.com.ada.first.appbanco.main;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.entity.Pessoa;
import br.com.ada.first.appbanco.entity.PessoaJuridica;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.factory.AberturaContaFactory;
import br.com.ada.first.appbanco.service.abrirconta.AberturaConta;
import br.com.ada.first.appbanco.service.sacar.Saque;

import java.math.BigDecimal;
public class TesteSacarMain {

    public static void main(String[] args) {

        Pessoa cliente = new PessoaJuridica();
        cliente.setNome("Anderson");

        AberturaConta aberturaConta = AberturaContaFactory.getAberturaConta(TipoConta.CC);

        Conta conta = aberturaConta.abrirConta(cliente, "0002");
        conta.setSaldo(new BigDecimal(100));

        Saque operacaoSaque = new SacarContaCorrente();

        operacaoSaque.sacar(conta, new BigDecimal(10));

        System.out.println(conta);
    }

}
