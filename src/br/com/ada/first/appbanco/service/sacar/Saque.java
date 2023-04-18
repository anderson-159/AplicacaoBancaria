package br.com.ada.first.appbanco.service.sacar;

import br.com.ada.first.appbanco.entity.*;
import br.com.ada.first.appbanco.service.ContaServiceUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Sacar {

    BigDecimal TAXA_SAQUE_PJ = new BigDecimal(0.005);

    default void sacar(Conta conta, BigDecimal valorSaque) {

        //recuperar o tipo da pessoa (PF/PJ)
        ContaServiceUtils contaServiceUtils = new ContaServiceUtils();
        Pessoa pessoa = contaServiceUtils.getClienteConta(conta);

        if (pessoa instanceof PessoaJuridica) {
            BigDecimal taxa = valorSaque.multiply(TAXA_SAQUE_PJ);
            valorSaque = valorSaque.add(taxa);
        }

        if (valorSaque.compareTo(conta.getSaldo()) == 1) {
            throw new RuntimeException("Valor do saque maior que o saldo disponivel");
        }

        BigDecimal saldoRestante = conta.getSaldo()
                .subtract(valorSaque)
                .setScale(2, RoundingMode.HALF_UP);

        conta.setSaldo(saldoRestante);

    }

}