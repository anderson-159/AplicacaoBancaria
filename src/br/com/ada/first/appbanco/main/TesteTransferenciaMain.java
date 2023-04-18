package br.com.ada.first.appbanco.main;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.entity.Pessoa;
import br.com.ada.first.appbanco.entity.PessoaFisica;
import br.com.ada.first.appbanco.entity.PessoaJuridica;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.factory.AberturaContaFactory;
import br.com.ada.first.appbanco.factory.DepositoContaFactory;
import br.com.ada.first.appbanco.factory.TransferenciaContaFactory;
import br.com.ada.first.appbanco.service.abrirconta.AberturaConta;
import br.com.ada.first.appbanco.service.depositar.Deposito;
import br.com.ada.first.appbanco.service.transferencia.TransferenciaContaPadrao;

import java.math.BigDecimal;

public class TesteTransferenciaMain {

    public static void main(String[] args) {

        Pessoa cliente = new PessoaJuridica();
        cliente.setNome("Rodrigo");

        AberturaConta aberturaContaOrigem = AberturaContaFactory.getAberturaConta(TipoConta.CC);
        Conta contaOrigem = aberturaContaOrigem.abrirConta(cliente, "0002");

        AberturaConta aberturaContaDestino = AberturaContaFactory.getAberturaConta(TipoConta.CI);
        Conta contaDestino = aberturaContaDestino.abrirConta(cliente, "0002");

        Deposito deposito = DepositoContaFactory.getDepositoConta(contaOrigem);
        deposito.depositar(contaOrigem, new BigDecimal(50));

        System.out.println("Saldo inicial Conta Origem: " + contaOrigem);
        System.out.println("Saldo inicial Conta Destino: " + contaDestino);

        TransferenciaContaPadrao transferencia = TransferenciaContaFactory.getTransferenciaConta();
        transferencia.transferir(contaOrigem, contaDestino, new BigDecimal(5));

        System.out.println("Saldo final Conta Origem: " + contaOrigem);
        System.out.println("Saldo final Conta Destino: " + contaDestino);
    }

}
