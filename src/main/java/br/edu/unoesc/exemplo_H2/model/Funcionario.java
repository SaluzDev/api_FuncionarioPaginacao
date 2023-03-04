package br.edu.unoesc.exemplo_H2.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@XmlRootElement
public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String nome;
	@Column(name = "num_dep")
	Integer numDep;
	BigDecimal salario;
	LocalDate nascimento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumDep() {
		return numDep;
	}
	public void setNumDep(Integer numDep) {
		this.numDep = numDep;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Funcionario(Long id, String nome, Integer numDep, BigDecimal salario, LocalDate nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.numDep = numDep;
		this.salario = salario;
		this.nascimento = nascimento;
	}
	public Funcionario() {
		super();
	}
	
	
}