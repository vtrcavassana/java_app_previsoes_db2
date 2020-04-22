package br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.model.Cidade;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_ativ4.model.Previsao;

public class TesteInsereDuasPrevisoesUmaCidade {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade f = new Cidade();
		f.setNome("São Paulo");
		List <Previsao> previsoes = new ArrayList <>();
		Previsao c1 = new Previsao();
		c1.setTemp("25.5");
		c1.setCidade(f);
		Previsao c2 = new Previsao ();
		c2.setTemp("20.5");
		c2.setCidade(f);
		previsoes.add(c1);
		previsoes.add(c2);
		f.setPrevisoes(previsoes);
		manager.persist(f);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}
}