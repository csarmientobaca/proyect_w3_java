package model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Getione_biblo {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_w3");
	static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libri libro1 = new Libri ();
		
		libro1.setTitolo("my book title");
		libro1.setAnno_pubb(1992);
		libro1.setAutore("Carlos S.");
		libro1.setNumero_pag(128);
		libro1.setGenere("horror");
		
//		addLibro(libro1);
		
		Riviste riviste2 = new Riviste();
		riviste2.setTitolo("my Riviste");
		riviste2.setAnno_pubb(1993);
		riviste2.setNumero_pag(24);
		riviste2.setPeriodicita(Periodicita.MENSILE);

//		addRiviste(riviste2);

		Utente usuario2 = new Utente();
		usuario2.setNome("doas");
		usuario2.setCognome("dosa cog");
		usuario2.setDataNascita(1991);
		
//		addUtente(usuario2);
		
		Prestito prestito2 = new Prestito(new Date(1220227200000L),new Date(1221091200000L) );
		// 1 settembre 2008, 1220227200000L sono i milisecondi dopo 1970
		
		//added 30 days automatico 30*24*60*60*1000 
		
		//e 10 giorni in milisecondi sono 10*24*60*60*1000 = 867.000.000
		
//		prestito1.setPrestito_date(1220227200000L);
		addPrestito(prestito2);

		
		
		
//		Prestito prestito_something = new Prestito();
//		
//		prestito_something.getPrestito_date();
		
	}
	
	
	public static void addLibro(Libri l) {
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
	}
	
	
	public static void addRiviste(Riviste r) {
		try {
			em.getTransaction().begin();
			em.persist(r);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
		
	}
	public static void addUtente(Utente u) {
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
	}
	
	public static void addPrestito(Prestito p) {
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
		
	}
	
	
}
