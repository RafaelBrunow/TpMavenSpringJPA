package com.infotel.TpMavenSpringJPA.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

@Transactional
@Repository ("dao")
public class daoImpl implements Idao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p.getIdpersonne();
	}

	@Override
	public Personne affichagePersonne(int idpersonne) {
		// TODO Auto-generated method stub
		Personne p = em.find(Personne.class, idpersonne);
		return p;
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.merge(p);
		return p.getIdpersonne();
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.remove(p);
		return p.getIdpersonne();
	}

	@Override
	public List<Personne> listerPersonne() {
		// TODO Auto-generated method stub
		Query q = null;
		q = em.createQuery("SELECT p FROM Personne p");
		List<Personne> l = q.getResultList();
		return l;
	}

	@Override
	public Personne getPersonne(int idpersonne) {
		// TODO Auto-generated method stub
		Personne p = em.getReference(Personne.class, idpersonne);
		return p;
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
				em.persist(a);
				return a.getIdadresse();
			}

	@Override
	public Adresse affichageAdresse(int idadresse) {
		// TODO Auto-generated method stub
				Adresse a = em.find(Adresse.class, idadresse);
				return a;
	}

	@Override
	public Adresse getAdresse(int idadresse) {
		// TODO Auto-generated method stub
		Adresse a = em.getReference(Adresse.class, idadresse);
		return a;
	}

	@Override
	public int modifierAdresse(Adresse a) {
		em.merge(a);
		return a.getIdadresse();
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		em.remove(a);
		return a.getIdadresse();
	}

	@Override
	public List<Adresse> listerAdresse() {
		Query q = null;
		q = em.createQuery("SELECT a FROM Adresse a");
		List<Adresse> l = q.getResultList();
		return l;
	}
	
	
	

}
