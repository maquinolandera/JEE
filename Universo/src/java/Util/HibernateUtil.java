package Util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import SistemaSolar.Planeta;
import SistemaSolar.Sistema;
import SistemaSolar.Sol;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Fran
 */
public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory =
        new Configuration().configure().buildSessionFactory();

	public static SessionFactory getSessionFactory() {
            
		if (sessionFactory == null) {
			try {
				registry = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(registry);
				sources.addAnnotatedClass(SistemaSolar.Planeta.class);
                                sources.addAnnotatedClass(SistemaSolar.Sol.class);
                                sources.addAnnotatedClass(SistemaSolar.Sistema.class);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}
}



