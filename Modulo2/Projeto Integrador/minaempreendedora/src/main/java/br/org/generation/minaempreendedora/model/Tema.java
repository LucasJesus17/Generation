package br.org.generation.minaempreendedora.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name = "tb_temas")
public class Tema{
	    
	    @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	    
	    @NotBlank(message = "O atributo Descrição é obrigatório e não pode conter espaços em branco")
	    @Size(min = 5, max = 255, message = "O tema deve ter no minimo 5 e no maximo 255 caracteres")
	    private String tema;
		
		
		private String descricao;
		
		
		private String palavrachave;
		
		@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("tema")
		private List<Postagem> postagem;

		public String getTema() {
			return tema;
		}

		public void setTema(String tema) {
			this.tema = tema;
		}

		public String getPalavrachave() {
			return palavrachave;
		}

		public void setPalavrachave(String palavrachave) {
			this.palavrachave = palavrachave;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public List<Postagem> getPostagem() {
			return postagem;
		}

		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}
		
}