package dados.geral;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dados.AlunoDAO;

public abstract class DAOFactory {

	
	private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("testePSC");		
	}
	
	public static AlunoDAO getAlunoDAO(){
		AlunoDAO dao = new AlunoDAO(factory);
		return dao;
	}

}
