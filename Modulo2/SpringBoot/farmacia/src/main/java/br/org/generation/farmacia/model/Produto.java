package br.org.generation.farmacia.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Descrição é obrigatorio e não pode conter espaço em branco")
	@Size(min = 3, max = 255, message = "O atributo texto deve ter no minímo 10 e no maximo 1000 caracteres!")
	private String titulo;
	
	private BigDecimal preco;
	
	@Size(min = 3, max = 255, message = "O atributo texto deve ter no minímo 10 e no maximo 1000 caracteres!")
	private String laboratorio;
	
	@NotBlank(message = "O atributo Descrição é obrigatorio e não pode conter espaço em branco")
	@Size(min = 5, max = 255, message = "O atributo modo deve ter no minímo 10 e no maximo 1000 caracteres!")
	private String modoUso;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getModoUso() {
		return modoUso;
	}
	public void setModoUso(String modoUso) {
		this.modoUso = modoUso;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
		
}
