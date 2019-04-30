package com.infotel.TpMavenSpringJPA.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;
import com.infotel.TpMavenSpringJPA.service.Iservice;
import com.infotel.TpMavenSpringJPA.service.serviceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Iservice service = context.getBean("service", serviceImpl.class);
    	
    	// Ajouter 1
    	Adresse a1 = context.getBean("a1", Adresse.class);
    	
    	System.out.println(a1);
    	service.ajouterAdresse(a1);
    	
    	// Ajouter 2
    	Adresse a2 = context.getBean("a2", Adresse.class);
    	
    	System.out.println(a2);
    	service.ajouterAdresse(a2);
    	
    	// Ajouter 1
    	Adresse a3 = context.getBean("a3", Adresse.class);
    	
    	System.out.println(a3);
    	service.ajouterAdresse(a3);
    	
    	// Afficher
    	System.out.println(service.affichageAdresse(2));
    	
    	// Supprimer
    	a3 = service.getAdresse(3);
    	service.supprimerAdresse(a3);
    	
    	// Modifier
    	a2 = service.affichageAdresse(2);
    	a2.setNomRue("Rue du Youpi");
    	a2.setCp("62498");
    	service.modifierAdresse(a2);
    	
    	// Lister
    	System.out.println(service.listerAdresse());
    	
    	
    	// Ajouter 1
    	Personne p1 = context.getBean("p1", Personne.class);
    	p1.setAdresse(a1);
    	System.out.println(p1);
    	service.ajouterPersonne(p1);
    	
    	// Ajouter 2
    	Personne p2 = context.getBean("p2", Personne.class);
    	p2.setAdresse(a2);
    	System.out.println(p2);
    	service.ajouterPersonne(p2);
    	
    	// Ajouter 1
    	Personne p3 = context.getBean("p3", Personne.class);
    	System.out.println(p3);
    	service.ajouterPersonne(p3);
    	
    	// Afficher
    	System.out.println(service.affichagePersonne(2));
    	
    	// Supprimer
    	p3 = service.getPersonne(3);
    	service.supprimerPersonne(p3);
    	
    	// Modifier
    	p2 = service.affichagePersonne(2);
    	p2.setNom("Balgin");
    	p2.setAge(24);
    	service.modifierPersonne(p2);
    	
    	// Lister
    	System.out.println(service.listerPersonne());
    	
    	
    	context.close();
    }
}
