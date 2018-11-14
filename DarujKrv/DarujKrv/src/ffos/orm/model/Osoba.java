/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
@Entity
@Table
public class Osoba {
    @Id
    @GeneratedValue
    
    private Long id; 
    private String ime; 
    private String prezime; 
    private String broj_darivatelja; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBroj_darivatelja() {
        return broj_darivatelja;
    }

    public void setBroj_darivatelja(String broj_darivatelja) {
        this.broj_darivatelja = broj_darivatelja;
    }
        @Override
    public String toString() {
        return ime + " " + prezime;
    }

}
