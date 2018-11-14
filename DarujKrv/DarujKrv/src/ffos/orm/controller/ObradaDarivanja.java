/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.model.Darivanje;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaDarivanja extends Obrada{
   private Session session; 
public ObradaDarivanja() {

    session = HibernateUtil.getSession(); 

}

public Darivanje dodajDarivanje (Darivanje d){
session.beginTransaction(); 
session.saveOrUpdate(d);
session.getTransaction().commit();
return d; 

}

public Darivanje brisanjeDarivanja(Darivanje d){
session.beginTransaction();
session.delete(d);
session.getTransaction().commit();
return d; 
}

public List<Darivanje> getDarivanje() {
    Query q= session.createQuery("From Opcina"); 
    return q.list();
    
}

}


