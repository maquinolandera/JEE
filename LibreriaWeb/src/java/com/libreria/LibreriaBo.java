/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fran
 */
public class LibreriaBo {
    
    public void altaLibro(String titulo,String precio)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Libro libro = new Libro(titulo,precio);
        session.save(libro);
        transaction.commit();
        session.close();
        
    }
    public List<Libro>consultaLibro()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        org.hibernate.query.Query hqlQuery = session.createQuery("FROM  Libro ");
        List<Libro>result = hqlQuery.list();
        
        
        return result;
    }
    public void ModificaDAtos(String id, String titulo, String precio)
    {
        try
        {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Libro liv = new Libro();
        
        System.out.println(id);
        liv.setId(Integer.parseInt(id));
        liv.setPrecio(precio);
        liv.setTitulo(titulo);
        session.update(liv);
        transaction.commit();
        session.close();
        }catch(NumberFormatException ex)
        {
            ex.printStackTrace();
        }
    
}
    public void borrarRegistro(String id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Libro liv = new Libro();
        liv.setId(Integer.parseInt(id));
        session.delete(liv);
        transaction.commit();
        session.close();
        
    }
}
