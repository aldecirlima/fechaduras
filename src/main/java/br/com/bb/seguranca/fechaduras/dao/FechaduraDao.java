package br.com.bb.seguranca.fechaduras.dao;

import javax.persistence.EntityManager;

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

}
