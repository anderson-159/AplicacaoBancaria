package br.com.ada.first.appbanco.entity;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private LocalDate dataNascimento;
    private String cpf;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
