/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.pomocno.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author tjakopec
 */
public abstract class Obrada {
    
    protected Session session;
    
    public Obrada(){
        session = HibernateUtil.getSession();
    }
    

    
}
