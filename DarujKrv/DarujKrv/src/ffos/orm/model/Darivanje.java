/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
@Entity
@Table
public class Darivanje {
      @Id
    @GeneratedValue 
      private Long id; 
      private Date datum; 
      @ManyToOne
      private Mjesto mjesto; 
      @ManyToMany 
      private Set<Osoba> osobe; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }

    public Set<Osoba> getOsobe() {
        return osobe;
    }

    public void setOsobe(Set<Osoba> osobe) {
        this.osobe = osobe;
    }
      
    
    
    
}
