package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_previsao")

public class Previsao {
	@Id
	@GeneratedValue
	private Long id;
	private String Temp;
	
	@ManyToOne
	private Cidade cidade;
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTemp() {
		return Temp;
	}
	public void setTemp(String temp) {
		Temp = temp;
	}
	
}