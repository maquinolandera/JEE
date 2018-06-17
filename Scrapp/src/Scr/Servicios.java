package Scr;


import Util.HibernateUtil;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**sdf
 *
 * @author Fran
 */
public class Servicios {
          public WebDriver conexionSelenium()
    {
         System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
         WebDriver web = new  FirefoxDriver();
         
         return web;
    }
    
        public java.sql.Connection getConnection(){
        java.sql.Connection databaseConnection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
                        // Define the data source for the driver
            String sourceURL = "jdbc:mysql://localhost/url";
// Create a connection through the DriverManager
            
            try {
                databaseConnection = DriverManager.getConnection(sourceURL, "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);

        }

        
        
        return databaseConnection;
		//Aquí viene el código que falta
	}
    
    public void altaUrl(Urls url)
    {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
      
       
      
       session.save(url);
       transaction.commit();
       session.close();
       
       
    }
       public void altaUrl(UrlsFiltro url)
    {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(url);
       transaction.commit();
       session.close();
       
       
    }
    public List<Urls> consultaDatos()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
       
        List<Urls> lista =  session.createQuery(" from urls").list();
        session.close();
        
        
      
        return lista;
    }
    public void borrarDatos()
    {
        java.sql.Connection databaseConnection = getConnection();
        PreparedStatement pstmt = null;
        try {
        pstmt = databaseConnection.prepareStatement("DELETE FROM urls ");
       
        pstmt.execute();
        pstmt.close();
        databaseConnection.close();
        
      } catch (SQLException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
