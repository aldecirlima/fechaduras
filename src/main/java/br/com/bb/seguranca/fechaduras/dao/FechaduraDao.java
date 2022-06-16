package br.com.bb.seguranca.fechaduras.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bb.seguranca.fechaduras.modelo.Fechadura;

public class FechaduraDao {

	private EntityManager em;

	public FechaduraDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(Fechadura fechadura) {
		this.em.persist(fechadura);
	}

	public void atualizar(Fechadura fechadura) {
		this.em.merge(fechadura);
	}

	public void remover(Fechadura fechadura) {
		fechadura = em.merge(fechadura);
		this.em.remove(fechadura);
	}

	@SuppressWarnings("unchecked")
	public List<Fechadura> findNativeAll() {
		Query query = em.createNativeQuery("SELECT * FROM fechadura", Fechadura.class);
		return query.getResultList();

	}

}
