package br.com.gabriel.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private final DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal salarioReajustado) {
		this.dadosPessoais.setSalario(salarioReajustado);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
}
