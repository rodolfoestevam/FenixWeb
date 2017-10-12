package basicas;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Pessoa extends ObjetoSistema {

	@Column(length = 50)
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	private String telefone;

	private String email;

	@Embedded
	private Endereco endereco;

	public Pessoa() {
	}

	public Pessoa(Integer codigo, Date dataUltimaAtualizacao, String nome,
			Date dataNascimento, String telefone, String email,
			Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Pessoa(String nome, Date dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

}
