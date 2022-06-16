package br.com.bb.seguranca.fechaduras;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.bb.seguranca.fechaduras.dao.FechaduraDao;
import br.com.bb.seguranca.fechaduras.modelo.Fechadura;
import br.com.bb.seguranca.fechaduras.util.JPAUtil;

public class FechaduraService {
	
	EntityManager em = JPAUtil.getEntityManagerMysql();
	
	public void add(Fechadura fechadura) {
		FechaduraDao dao = new FechaduraDao(em);
		em.getTransaction().begin();
		dao.adiciona(fechadura);
		em.getTransaction().commit();
		em.close();
	}
	
	public void addList(List<Fechadura> fechaduras) {
		em.getTransaction().begin();
		for (Fechadura fechadura : fechaduras) {
			FechaduraDao dao = new FechaduraDao(em);
			dao.adiciona(fechadura);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Fechadura> findNativeAll() {
		FechaduraDao dao = new FechaduraDao(em);
		return dao.findNativeAll();
	}
}
