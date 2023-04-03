package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Riviste_new_name")
public class Riviste extends Contenuto_scritto {

	private Periodicita periodicita;

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Riviste [periodicita=" + periodicita + "]";
	} 
	
}
