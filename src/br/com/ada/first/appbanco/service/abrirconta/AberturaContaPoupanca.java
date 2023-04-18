package br.com.ada.first.appbanco.service.abrirconta;

import br.com.ada.first.appbanco.entity.*;

import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaPoupanca implements AberturaConta {

    @Override
    public ContaPoupanca abrirConta(Pessoa cliente, String agencia) {

        if (cliente instanceof PessoaJuridica) {
            throw new RuntimeException("Tipo de pessoa nao permitido");
        }

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(BigDecimal.ZERO);
        contaPoupanca.setAgencia(agencia);
        contaPoupanca.setNumero(String.valueOf(new Random().nextInt(1, 1000)));
        if (cliente instanceof PessoaFisica) {
            contaPoupanca.setCliente((PessoaFisica) cliente);
        }
        return contaPoupanca;
    }

}