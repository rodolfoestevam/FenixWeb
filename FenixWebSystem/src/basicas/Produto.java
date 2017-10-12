package basicas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	private Integer id;
	private String nome;
	private String model_auto;
	private String ano_auto;
	private String tamanho;
	private Integer quantidade;
	private String marca;
	private Double preco_und;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModel_auto() {
		return model_auto;
	}
	public void setModel_auto(String model_auto) {
		this.model_auto = model_auto;
	}
	public String getAno_auto() {
		return ano_auto;
	}
	public void setAno_auto(String ano_auto) {
		this.ano_auto = ano_auto;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPreco_und() {
		return preco_und;
	}
	public void setPreco_und(Double preco_und) {
		this.preco_und = preco_und;
	}

}
