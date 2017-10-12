package util;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class JPAUtil {
	
	private static Ejb3Configuration config = new Ejb3Configuration();
	
	public static void gerarTabelas(){
		config.configure("fenix-pu", null);
		Configuration hbmcfg = config.getHibernateConfiguration();
		SchemaExport schemaExport = new SchemaExport(hbmcfg);
		schemaExport.create(true, true);
		System.out.println("Tabelas criadas");
	}
	
	public static void main(String[] args) {
		
		gerarTabelas();
	}

}
