package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	 // Containing == Like do mysql e o IgnoreCase == ignora a diferença entre maiusculo e minusculo
	public List<Postagem> findAllByTituloContainingIgnoreCase(String Titulo);
}

