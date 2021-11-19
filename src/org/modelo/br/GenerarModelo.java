package org.modelo.br;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class GenerarModelo {
	
	public static void main(String[] args) {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.addAnnotatedClass(Bus.class);
			cfg.addAnnotatedClass(Ruta.class);
			cfg.configure("hibernate.cfg.xml");
			new SchemaExport(cfg).create(true, true);
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}
	}

}
