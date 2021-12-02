package br.org.generation.blogpessoal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/postagens")
public class PostagemController {

	@Autowired
	private PostagemRepository postagemRepository; //Inverte a obrigação de Criar um objeto
	
	@GetMapping
	public ResponseEntity <List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll()); // Retorna todos as informações encontradas
	}
	
	@GetMapping("/{id}") // Um GetMapping não pode ser igual a outro
	public ResponseEntity <Postagem> getById(@PathVariable Long id){ // Passa Apenas <Postagem> pois só queremos trazer 1 objeto
		return postagemRepository.findById(id) //Procura por id
				.map(resp -> ResponseEntity.ok(resp)) // Mapeia a resposta e Retorna oque achou
				.orElse(ResponseEntity.notFound().build()); // Fala que não achou e retorna o erro 404 -- .buld é obrigatorio para funcionar
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <List<Postagem>> getAll(@PathVariable String titulo){
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo)); // Retorna os titulos das postagens
	}
	
	
	@PostMapping
	public ResponseEntity <Postagem> postPostagem(@Valid @RequestBody Postagem postagem){ // Valid Valida o Objeto, RequestBody Pega o Objeto do corpo da requisição
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem)); //.body corpo da resposta || .status para criar a requisição created
	}
	
	@PutMapping()
	public ResponseEntity <Postagem> putPostagem(@Valid @RequestBody Postagem postagem, Long id){ // Valid Valida o Objeto, RequestBody Pega o Objeto do corpo da requisição

		return postagemRepository.findById(postagem.getId())
			   .map(resp -> ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem)))
			   .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build()); //.body corpo da resposta || .status para criar a requisição created		
	}
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable Long id) {
		return postagemRepository.findById(id) //Retorna o ID
				.map(record ->{ // Verifica se existe o ID
					postagemRepository.deleteAllById(null); //Deleta por ID
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); //Retorna o Status NoContent
				}).orElse(ResponseEntity.notFound().build()); //Caso não encontre o ID retorne Not Found
	}
}