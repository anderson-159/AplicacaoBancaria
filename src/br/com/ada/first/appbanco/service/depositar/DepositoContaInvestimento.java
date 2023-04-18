package br.com.ada.first.appbanco.service.depositar;

import br.com.ada.first.appbanco.entity.*;
import br.com.ada.first.appbanco.service.ContaServiceUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DepositoContaInvestimento implements Deposito {

    private static BigDecimal RENDIMENTO = new BigDecimal(0.01);
    private static BigDecimal RENDIMENTO_PJ = new BigDecimal(0.02);

    @Override
    public void depositar(Conta conta, BigDecimal valorDeposito) {

        if (!(conta instanceof ContaInvestimento)) {
            throw new RuntimeException("Erro - Conta nao é de tipo investimento");
        }

        ContaServiceUtils contaServiceUtils = new ContaServiceUtils();
        Pessoa cliente = contaServiceUtils.getClienteConta(conta);

        BigDecimal rendimento = valorDeposito.multiply(RENDIMENTO);
        valorDeposito = valorDeposito.add(rendimento);

        if (cliente instanceof PessoaJuridica) {
            BigDecimal rendimentoPJ = valorDeposito.multiply(RENDIMENTO_PJ);
            valorDeposito = valorDeposito.add(rendimentoPJ);
        }

        BigDecimal novoSaldo = conta.getSaldo().add(valorDeposito).setScale(2, RoundingMode.HALF_UP);
        conta.setSaldo(novoSaldo);

    }

}