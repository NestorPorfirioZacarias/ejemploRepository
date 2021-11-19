package org.modelo.fc;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerarModelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.addAnnotatedClass(Factura.class);
			cfg.addAnnotatedClass(Clientex.class);
			cfg.configure("hibernate.cfg.xml");
			new SchemaExport(cfg).create(true, true);
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}
	}

}
