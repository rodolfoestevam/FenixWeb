package dados_old;

import basicas.Aluno;

public interface IRepositorioAluno {

	public void inserirAluno(Aluno aluno);
	
	public Aluno consultarPorId(Integer id);
	
	public void removerAluno(Aluno aluno);
	
	public void alterarAluno(Aluno aluno);
}
