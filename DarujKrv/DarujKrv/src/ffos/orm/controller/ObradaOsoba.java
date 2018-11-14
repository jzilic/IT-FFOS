/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;


import ffos.orm.model.Osoba;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaOsoba extends Obrada{
    
           private Session session; 
public ObradaOsoba() {

    session = HibernateUtil.getSession(); 

}
public Osoba dodajOsoba (Osoba o){
session.beginTransaction(); 
session.saveOrUpdate(o);
session.getTransaction().commit();
return o; 

}

public Osoba brisanjeOsoba (Osoba o){
session.beginTransaction();
session.delete(o);
session.getTransaction().commit();
return o; 
}

public List<Osoba> getMjesto() {
    Query q= session.createQuery("From Osoba"); 
    return q.list();
    
}
  

    
    
}
