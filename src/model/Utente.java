package model;

public class Utente {
	
	private String nome; 
	private String cognome;
	private Integer dataNascita;
	
	
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
	public void setNumTessera(Long numTessera) {
		this.numTessera = numTessera;
	}
	
	
}
