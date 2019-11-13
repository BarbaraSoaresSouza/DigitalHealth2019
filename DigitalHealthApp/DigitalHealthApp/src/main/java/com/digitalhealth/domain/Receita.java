package com.digitalhealth.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Receita {
	
	
	//id receita
	@Id
	@GeneratedValue
	@Column(name = "idReceita")
	private Long id;
	
	//geral
	@Column
	@JsonProperty
	private String dataReceita;
	
	//tirar esse campo
	@Column
	@JsonProperty
	private String dataValidade;
	
	
	//medico
	@Column
	@JsonProperty
	private String nomeMedico;
	@Column
	@JsonProperty
	private String crmMedico;
	@Column
	@JsonProperty
	private String especialidadeMedico;
	
	//clinica
	@Column
	@JsonProperty
	private String enderecoClinica;
	@Column
	@JsonProperty
	private String telefoneClinica;
	
	//Paciente
	@Column
	@JsonProperty
	private String nomePaciente;
	
	//medicamento
	@Column
	@JsonProperty
	private String nomeMedicamento;
	
	//tirar esses campos
	@Column
	@JsonProperty
	private double doseMedicamento;
	@Column
	@JsonProperty
	private String posologiaMedicamento;
	
	@Column
	@JsonProperty
	private String nomeFarmacia;
	@Column
	@JsonProperty
	private String crmFarmaceutico;
	
	@Column
	@JsonProperty
	private String nomeFarmaceutico;
	
	@Column
	@JsonProperty
	private String assinaturaFarmaceutico;
	
	@Column
	@JsonProperty
	private String assinaturaMedico;
	

	
	
	
	public Receita() {
		
	}

//construtor preenchido
	public Receita(String nomeMedico, String crmMedico, String especialidadeMedico, String enderecoClinica,
			String telefoneClinica, String nomePaciente, String nomeMedicamento, double doseMedicamento,
			String posologiaMedicamento, String dataReceita, String dataValidade, String nomeFarmacia,
			String crmFarmaceutico, String nomeFarmaceutico, String assinaturaMedico, String assinaturaFarmaceutico) {
		//super();
		this.nomeMedico = nomeMedico;
		this.crmMedico = crmMedico;
		this.especialidadeMedico = especialidadeMedico;
		this.enderecoClinica = enderecoClinica;
		this.telefoneClinica = telefoneClinica;
		this.nomePaciente = nomePaciente;
		this.nomeMedicamento = nomeMedicamento;
		this.doseMedicamento = doseMedicamento;
		this.posologiaMedicamento = posologiaMedicamento;
		this.dataReceita = dataReceita;
		this.dataValidade = dataValidade;
		this.nomeFarmacia = nomeFarmacia;
		this.crmFarmaceutico = crmFarmaceutico;
		this.nomeFarmaceutico = nomeFarmaceutico;
		this.assinaturaFarmaceutico = assinaturaFarmaceutico;
		this.assinaturaMedico = assinaturaMedico;
	}
	
	//gett and setters

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getEspecialidadeMedico() {
		return especialidadeMedico;
	}

	public void setEspecialidadeMedico(String especialidadeMedico) {
		this.especialidadeMedico = especialidadeMedico;
	}

	public String getEnderecoClinica() {
		return enderecoClinica;
	}

	public void setEnderecoClinica(String enderecoClinica) {
		this.enderecoClinica = enderecoClinica;
	}

	public String getTelefoneClinica() {
		return telefoneClinica;
	}

	public void setTelefoneClinica(String telefoneClinica) {
		this.telefoneClinica = telefoneClinica;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public double getDoseMedicamento() {
		return doseMedicamento;
	}

	public void setDoseMedicamento(double doseMedicamento) {
		this.doseMedicamento = doseMedicamento;
	}

	public String getPosologiaMedicamento() {
		return posologiaMedicamento;
	}

	public void setPosologiaMedicamento(String posologiaMedicamento) {
		this.posologiaMedicamento = posologiaMedicamento;
	}

	public String getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(String dataReceita) {
		this.dataReceita = dataReceita;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getNomeFarmacia() {
		return nomeFarmacia;
	}

	public void setNomeFarmacia(String nomeFarmacia) {
		this.nomeFarmacia = nomeFarmacia;
	}

	public String getCrmFarmaceutico() {
		return crmFarmaceutico;
	}

	public void setCrmFarmaceutico(String crmFarmaceutico) {
		this.crmFarmaceutico = crmFarmaceutico;
	}

	public String getNomeFarmaceutico() {
		return nomeFarmaceutico;
	}

	public void setNomeFarmaceutico(String nomeFarmaceutico) {
		this.nomeFarmaceutico = nomeFarmaceutico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssinaturaFarmaceutico() {
		return assinaturaFarmaceutico;
	}

	

	public String getAssinaturaMedico() {
		return assinaturaMedico;
	}

	
	
	

	
	
	
}