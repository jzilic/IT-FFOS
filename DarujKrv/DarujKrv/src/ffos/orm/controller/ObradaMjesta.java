/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.model.Darivanje;
import ffos.orm.model.Mjesto;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaMjesta extends Obrada{
    
       private Session session; 
public ObradaMjesta() {

    session = HibernateUtil.getSession(); 

}

public Mjesto dodajMjesto (Mjesto mj){
session.beginTransaction(); 
session.saveOrUpdate(mj);
session.getTransaction().commit();
return mj; 

}

public Mjesto brisanjeMjesta(Mjesto mj){
session.beginTransaction();
session.delete(mj);
session.getTransaction().commit();
return mj; 
}

public List<Mjesto> getMjesto() {
    Query q= session.createQuery("From Mjesto"); 
    return q.list();
    
}
    
    
}
