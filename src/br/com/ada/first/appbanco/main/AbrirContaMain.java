package br.com.ada.first.appbanco.main;

import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.entity.ContaCorrente;
import br.com.ada.first.appbanco.entity.PessoaFisica;
import br.com.ada.first.appbanco.enums.TipoConta;
import br.com.ada.first.appbanco.factory.AberturaContaFactory;
import br.com.ada.first.appbanco.service.abrirconta.AberturaConta;

import java.util.Scanner;

public class AbrirContaMain {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Rodrigo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual conta voce quer abrir?");

        TipoConta tipoConta = TipoConta.valueOf(scanner.nextLine());

        AberturaConta aberturaConta = AberturaContaFactory.getAberturaConta(tipoConta);

        Conta conta = aberturaConta.abrirConta(pessoaFisica, "0002");

        System.out.println(conta);

    }
}