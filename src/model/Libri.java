package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libro_new_name")
public class Libri extends Contenuto_scritto{
	
		private String autore;
		private String genere;
		
		public String getAutore() {
			return autore;
		}
		public void setAutore(String autore) {
			this.autore = autore;
		}
		public String getGenere() {
			return genere;
		}
		public void setGenere(String genere) {
			this.genere = genere;
		}
	
}
