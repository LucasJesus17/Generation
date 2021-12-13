package br.org.generation.blogpessoal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.model.Tema;
import br.org.generation.blogpessoal.repository.TemaRepository;

@RestController
@RequestMapping("/temas")
public class TemaController {
	
	@Autowired
	private TemaRepository temaRepository;
	
	@GetMapping
	public ResponseEntity <List<Tema>> getall(){
		return ResponseEntity.ok(temaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Tema> getById(@PathVariable Long id){
		return temaRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity <List<Tema>> getAll(@PathVariable String descricao){
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao)); // Retorna os titulos das postagens
	}
	
	@PostMapping
	public ResponseEntity <Tema> putTema(@Valid @RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema)); //.body corpo da resposta || .status para criar a requisição created
	}
	
	@PutMapping()
	public ResponseEntity <Tema> putTema(@Valid @RequestBody Tema tema, Long id){

		return temaRepository.findById(tema.getId())
			   .map(resp -> ResponseEntity.status(HttpStatus.OK).body(temaRepository.save(tema)))
			   .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());	
	}
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<?> deleteTema(@PathVariable Long id) {
		return temaRepository.findById(id) 
				.map(record ->{ 
					temaRepository.deleteById(id); 
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				}).orElse(ResponseEntity.notFound().build()); 
	}
}
