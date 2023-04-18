package br.com.ada.first.appbanco.main;


import br.com.ada.first.appbanco.entity.ContaCorrente;
import br.com.ada.first.appbanco.entity.ContaPoupanca;
import br.com.ada.first.appbanco.entity.PessoaFisica;
import br.com.ada.first.appbanco.entity.PessoaJuridica;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setCliente(pessoaFisica);
        contaCorrente.setCliente(pessoaJuridica);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setCliente(pessoaFisica);
        //contaPoupanca.setCliente(pessoaJuridica);

    }
}
