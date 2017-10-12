package dados_old;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Aluno;

public class RepositorioAluno implements IRepositorioAluno {

	private EntityManager em;
	
	public RepositorioAluno(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePSC");
		em = emf.createEntityManager();
	}
	
	@Override
	public void inserirAluno(Aluno aluno) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.persist(aluno);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public Aluno consultarPorId(Integer id) {
		return em.find(Aluno.class, id);
	}

	@Override
	public void removerAluno(Aluno aluno) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.remove(aluno);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void alterarAluno(Aluno aluno) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.merge(aluno);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

}
