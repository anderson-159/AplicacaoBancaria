package br.com.ada.first.appbanco.service.abrirconta;

import br.com.ada.first.appbanco.entity.*;

import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaCorrente implements AberturaConta {

    @Override
    public ContaCorrente abrirConta(Pessoa cliente, String agencia) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(BigDecimal.ZERO);
        contaCorrente.setAgencia(agencia);
        contaCorrente.setNumero(String.valueOf(new Random().nextInt(1, 1000)));
        ((ContaCorrente) contaCorrente).setCliente(cliente);
        return (ContaCorrente) contaCorrente;
    }

}
