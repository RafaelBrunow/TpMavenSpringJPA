package com.infotel.TpMavenSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringJPA.dao.Idao;
import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

@Service ("service")
public class serviceImpl implements Iservice {
	
	@Autowired
	private Idao dao;

	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public Personne affichagePersonne(int idpersonne) {
		// TODO Auto-generated method stub
		return dao.affichagePersonne(idpersonne);
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}

	@Override
	public List<Personne> listerPersonne() {
		// TODO Auto-generated method stub
		return dao.listerPersonne();
	}

	@Override
	public Personne getPersonne(int idpersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idpersonne);
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdresse(a);
	}

	@Override
	public Adresse affichageAdresse(int idadresse) {
		// TODO Auto-generated method stub
		return dao.affichageAdresse(idadresse);
	}

	@Override
	public Adresse getAdresse(int idadresse) {
		// TODO Auto-generated method stub
		return dao.getAdresse(idadresse);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.modifierAdresse(a);
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.supprimerAdresse(a);
	}

	@Override
	public List<Adresse> listerAdresse() {
		// TODO Auto-generated method stub
		return dao.listerAdresse();
	}

}
