package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario extends DadosPessoais {
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super(nome, cpf, cargo, salario);
	}


	public void atualizarSalario(BigDecimal novoSalario ) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}
}
