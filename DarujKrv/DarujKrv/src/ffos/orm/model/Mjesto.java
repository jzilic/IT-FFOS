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
public class Mjesto {
     @Id
    @GeneratedValue
     private Long id;
     private String naziv; 
     private String postanski_broj; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getPostanski_broj() {
        return postanski_broj;
    }

    public void setPostanski_broj(String postanski_broj) {
        this.postanski_broj = postanski_broj;
    }
     @Override
    public String toString() {
        return naziv;
    }
}
