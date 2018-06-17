/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiquiatrico;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fran
 */

public class PacienteBO {
     
    public boolean AltaPaciente(String nombre,String apellido,Date fecha_alta,int peligrosidad,String enfermedad,String medicacion )
    {
           List <Enfermedades> enfermedades = new ArrayList<Enfermedades>();
           boolean ok = true;
           Paciente objPac = new Paciente(nombre,apellido,fecha_alta,peligrosidad);
         
           enfermedades.add(new Enfermedades (enfermedad,medicacion,objPac));
           objPac.setEnfermedades(enfermedades);
     
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            //Paciente objPaciente = new Paciente(nombre,apellido,fecha_alta,peligrosidad);
            session.save(objPac);
            transaction.commit();
            session.close();
          
        
        return ok;
    }

   public boolean darDeBaja(int id)
   {
        
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
      
       String queryString = "delete from Enfermedades where paciente_id=?";
       String queryString2 = "delete from Paciente where id=?";
       Query hqlQuery = session.createQuery(queryString);
       Query hqlQuery2 = session.createQuery(queryString2);
       hqlQuery.setParameter(0, id);
       hqlQuery2.setParameter(0, id);
      
       hqlQuery.executeUpdate();
       hqlQuery2.executeUpdate();
       transaction.commit();
       session.close();
       return true;
       
   }
  
   public void consultaDatos()
   {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.query.Query hqlQuery = session.createQuery("FROM  Paciente ");
        String queryString2 = " select  new psiquiatrico.PacienteEnfermedades(p, e.medicacion,e.nombreEnfermedad) from Paciente p join p.enfermedades e where p.peligrosidad = 4";
        org.hibernate.query.Query hqlQuery2 = session.createQuery(queryString2);  
      
        List result = hqlQuery.list();
        List result2 = hqlQuery2.list();
        List<PacienteEnfermedades>arrayPaci = (List <PacienteEnfermedades >) result2;
        
        
        Iterator <Paciente> it = result.iterator();
        Paciente paci = null;
        PacienteEnfermedades paciEnfer = null;
        while(it.hasNext())
        {
             paci = it.next();
            
            
        }
        Iterator <PacienteEnfermedades> it2 = arrayPaci.iterator();
      
        while(it2.hasNext())
        {
               paciEnfer = it2.next();
               System.out.println("\n"+paciEnfer.getPaci().getNombre()+" "+paciEnfer.getPaci().getApellido()+" "+paciEnfer.getMedicacion()+" "+paciEnfer.getEnfermedad());
        }
        
   }
   public void modificarDatos(int id,String nombre)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       org.hibernate.query.Query hqlQuery = session.createQuery("FROM  Paciente where id = '"+id+"'");
      
       Paciente objPaci = new Paciente();
       objPaci.setId(id);
       objPaci.setApellido("Modificacion consultar");
       
       objPaci.setPeligrosidad(4);
       objPaci.setNombre(nombre);
       session.update(objPaci);
       transaction.commit();
       session.close();
       
   }
    
}
