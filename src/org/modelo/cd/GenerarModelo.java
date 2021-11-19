package org.modelo.cd;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerarModelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AnnotationConfiguration cfg= new AnnotationConfiguration();
			cfg.addAnnotatedClass(DetalleCiuda.class);
			cfg.addAnnotatedClass(ciudadano.class);
			cfg.configure("hibernate.cfg.xml");
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("execion"+e.getMessage());
		}

	}

}
