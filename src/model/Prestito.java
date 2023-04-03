package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prestito")
public class Prestito {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
//    private User user;
	
	
	
	private Date prestito_date;
	private Date return_date;

	private Date was_returned_in;


    public Prestito() {
    }
	
	public Prestito(Date prestito_date, Date was_returned_in) {
	        this.prestito_date = prestito_date;
	        this.return_date = new Date(prestito_date.getTime() + 30 * 24 * 60 * 60 * 1000L); //aggiunge 30 giorni
	        this.was_returned_in = was_returned_in;
	    }
	    
	    public Date getPrestito_date() {
	        return prestito_date;
	    }
	    
	    public void setPrestito_date(Date prestito_date) {
	        this.prestito_date = prestito_date;
	    }
	    
	    public Date getReturn_date() {
	        return return_date;
	    }
	    
	    public void setReturn_date(Date return_date) {
	        this.return_date = return_date;
	    }
	    
	    public Date getWas_returned_in() {
	        return was_returned_in;
	    }
	    
	    public void setWas_returned_in(Date was_returned_in) {
	        this.was_returned_in = was_returned_in;
	    }
	    
	    public boolean isOverdue() {
	        return was_returned_in == null && return_date.before(new Date());
	    }
}
