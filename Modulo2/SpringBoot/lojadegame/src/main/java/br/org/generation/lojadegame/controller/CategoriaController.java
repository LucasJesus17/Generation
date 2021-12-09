package br.org.generation.lojadegame.controller;

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


import br.org.generation.lojadegame.model.Categoria;
import br.org.generation.lojadegame.repository.CategoriaRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;// Inverte a obrigação de Criar um objeto

	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
		} // Retorna todos as informações encontradas

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable Long id) {
		return categoriaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getAll(@PathVariable String descricao) {
		return ResponseEntity.ok(categoriaRepository.findAllByDescricaoContainingIgnoreCase(descricao)); // Retorna os
																									// titulos das
																									// postagens
	}

	@PostMapping
	public ResponseEntity<Categoria> putTema(@Valid @RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria)); // .body corpo da resposta ||
																							// .status para criar a
																							// requisição created
	}

	@PutMapping()
	public ResponseEntity<Categoria> putTema(@Valid @RequestBody Categoria categoria, Long id) {

		return categoriaRepository.findById(categoria.getId())
				.map(resp -> ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteTema(@PathVariable Long id) {
		return categoriaRepository.findById(id).map(record -> {
			categoriaRepository.deleteById(null);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());

	}
}
