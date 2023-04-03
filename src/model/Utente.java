package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="utente_db")
@NamedQuery(name="Utente.findAll", query = "SELECT ut FROM Utente ut")
@SequenceGenerator(name = "card_seq", sequenceName = "card_seq", allocationSize = 123)
public class Utente {
	
	private String nome; 
	private String cognome;
	private Integer dataNascita;
	
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "card_seq")
	private Long numTessera;
	
    
    
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Integer getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Integer dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Long getNumTessera() {
		return numTessera;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", numTessera="
				+ numTessera + "]";
	}
	
	
}
