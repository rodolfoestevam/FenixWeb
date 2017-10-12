package basicas;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class ObjetoSistema {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codigo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaAtualizacao;
	
	@PreUpdate
	public void onUpdate(){
		dataUltimaAtualizacao = new Date();
	}
	
	@PrePersist
	public void onPersist(){
		dataUltimaAtualizacao = new Date();
	}
	
	public ObjetoSistema(Integer codigo, Date dataUltimaAtualizacao) {
		super();
		this.codigo = codigo;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	public ObjetoSistema() {
		super();
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Date getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
}
