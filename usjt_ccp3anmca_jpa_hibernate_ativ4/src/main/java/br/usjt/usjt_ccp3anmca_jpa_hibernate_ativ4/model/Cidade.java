package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_cidade")
public class Cidade {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List <Previsao> previsoes;
	public List<Previsao> getPrevisoes() {
		return previsoes;
	}
	public void setPrevisoes(List<Previsao> previsoes) {
		this.previsoes = previsoes;
	}
	
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
	
}