package dados;


import javax.persistence.EntityManagerFactory;

import dados.geral.DAOGenerico;

import basicas.Aluno;

public class AlunoDAO extends DAOGenerico<Aluno> {

	public AlunoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
