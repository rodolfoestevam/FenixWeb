package basicas;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_pedido;
	private String descricao;
	private Pessoa Cliente;
	private Funcionario Vendedor;
	@Type(type="yes_no")
	@Column(length=1)
	private boolean Status;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData_pedido() {
		return data_pedido;
	}
	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public Pessoa getCliente() {
		return Cliente;
	}
	public void setCliente(Pessoa cliente) {
		Cliente = cliente;
	}
	public Funcionario getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Funcionario vendedor) {
		Vendedor = vendedor;
	}
	
}
