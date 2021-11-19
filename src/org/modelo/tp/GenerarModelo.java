package org.modelo.tp;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerarModelo {

	public static void main(String[] args) {
		
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.addAnnotatedClass(Ticket.class);
			cfg.addAnnotatedClass(Productox.class);
			cfg.configure("hibernate.cfg.xml");
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
