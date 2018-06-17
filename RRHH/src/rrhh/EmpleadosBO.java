/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fran
 */
public class EmpleadosBO {
    
    public void insertarDatos(Empleado e)
    {
        List<Nomina> nominas = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
            //Paciente objPaciente = new Paciente(nombre,apellido,fecha_alta,peligrosidad);
            int contador = 1;
            double bruto = 0;
            Empleado empleado = e;
            
            for(int i = 0 ; i < 12 ; i++)
            {
              Nomina nom = new Nomina(empleado,empleado.getCategoria(),empleado.getCargo(),contador);
            
              nom.setBruto(nom.getBruto());
              nom.setNeto(nom.getBruto());
                
              System.out.println(nom.getNeto());
              nominas.add(nom);
              
             
              empleado.setNomina(nominas);
              System.out.println(empleado.getNombre());
             
            }
         
        session.save(e);
        transaction.commit();        
        session.close();
             
       
    }
    public void consultarDatos(String c)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        org.hibernate.query.Query hqlQuery = session.createQuery("FROM  Empleado where cargo = '"+c+"' ");
        List result = hqlQuery.list();
        Iterator <Empleado> it = result.iterator();
        int contador = 0;
        while(it.hasNext())
        {
            Empleado empl = it.next();
            System.out.println(""+empl.getNombre()+" "+empl.getApellidos()+" "+empl.getCargo()+"\n");
            contador++;
            
        }
       System.out.println(contador+" "+c);
        
    }
    
}
