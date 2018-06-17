/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import SistemaSolar.Planeta;
import SistemaSolar.Sistema;
import Util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fran
 */
public class ServiciosBo {
    
    
    public void Guardar(Sistema a)
    {
         Session session = Util.HibernateUtil.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
        
           
            
            session.save(a);
            transaction.commit();
            
            
        
          session.close();      
          
            
        
        }
    }
    

