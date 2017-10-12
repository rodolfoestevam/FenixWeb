package basicas;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="TBALUNO")
public class Aluno extends Pessoa {

	@Column(length=10)
	private String matricula;
	@Type(type="yes_no")
	@Column(length=1)
	private boolean bolsista;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer codigo, Date dataUltimaAtualizacao, String nome,
			Date dataNascimento) {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, Date dataNascimento) {
		super(nome, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", bolsista=" + bolsista
				+ ", getMatricula()=" + getMatricula() + ", isBolsista()="
				+ isBolsista() + ", getNome()=" + getNome()
				+ ", getDataNascimento()=" + getDataNascimento()
				+ ", getCodigo()=" + getCodigo() + "]";
	}

}
