package br.com.gabriel.model;

import java.math.BigDecimal;

public class Terceirizado {

    private final DadosPessoais dadosPessoais;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
}
