package br.com.ada.first.appbanco.service.abrirconta;


import br.com.ada.first.appbanco.entity.Conta;
import br.com.ada.first.appbanco.entity.Pessoa;

public interface AberturaConta {

    Conta abrirConta(Pessoa cliente, String agencia);

}
