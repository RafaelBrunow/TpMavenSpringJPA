package com.infotel.TpMavenSpringJPA.dao;

import java.util.List;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

public interface Idao {
	
	public int ajouterPersonne(Personne p);
	public Personne affichagePersonne(int idpersonne);
	public Personne getPersonne(int idpersonne);
	public int modifierPersonne(Personne p);
	public int supprimerPersonne(Personne p);
	public List<Personne> listerPersonne();
	
	public int ajouterAdresse(Adresse a);
	public Adresse affichageAdresse(int idadresse);
	public Adresse getAdresse(int idadresse);
	public int modifierAdresse(Adresse a);
	public int supprimerAdresse(Adresse a);
	public List<Adresse> listerAdresse();


}
