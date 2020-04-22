package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.teste;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.model.Cidade;

public class TesteBuscaOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidade f = manager.find(Cidade.class, 1L);
		System.out.println(f.getPrevisoes());
		manager.close();
		JPAUtil.close();
	}
}