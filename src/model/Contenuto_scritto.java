package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="contenuto_db")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="TipoContenutoScritto", discriminatorType = DiscriminatorType.STRING)
public abstract class Contenuto_scritto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ISBN_Id;
	
	private String titolo;
	private Integer anno_pubb;
	private Integer numero_pag;
	
	
	
	
	public Long getISBN_Id() {
		return ISBN_Id;
	}
	public void setISBN_Id(Long iSBN_Id) {
		ISBN_Id = iSBN_Id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Integer getAnno_pubb() {
		return anno_pubb;
	}
	public void setAnno_pubb(Integer anno_pubb) {
		this.anno_pubb = anno_pubb;
	}
	public Integer getNumero_pag() {
		return numero_pag;
	}
	public void setNumero_pag(Integer numero_pag) {
		this.numero_pag = numero_pag;
	}

	
}
