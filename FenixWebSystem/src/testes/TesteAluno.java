package testes;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import basicas.Aluno;

import dados_old.IRepositorioAluno;
import dados_old.RepositorioAluno;

public class TesteAluno {

	private IRepositorioAluno rep;

	@Before
	public void init() {
		rep = new RepositorioAluno();
	}

//	@Test
	public void testInserirAluno() {
		Aluno aluno = new Aluno("Maria Carolina", new GregorianCalendar(2000,
				10, 10).getTime());
		aluno.setBolsista(true);
		aluno.setMatricula("201201100");
		rep.inserirAluno(aluno);
	}

	@Test
	public void testConsultarPorId() {
		Aluno aluno = rep.consultarPorId(1);
		System.out.println(aluno);
	}

	@Test
	public void testRemoverAluno() {
		
	}

	@Test
	public void testAlterarAluno() {
		Aluno aluno = rep.consultarPorId(1);
		System.out.println(aluno);
		aluno.setBolsista(false);
		aluno.setNome("Ana Maria");
		rep.alterarAluno(aluno);
	}

}
