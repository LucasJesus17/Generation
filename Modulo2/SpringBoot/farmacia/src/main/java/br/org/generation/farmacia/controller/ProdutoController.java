package br.org.generation.farmacia.controller;

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

import br.org.generation.farmacia.model.Categoria;
import br.org.generation.farmacia.model.Produto;
import br.org.generation.farmacia.repository.CategoriaRepository;
import br.org.generation.farmacia.repository.ProdutoRepository;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll()); 
		}

	@GetMapping("/{id}") 
	public ResponseEntity<Produto> getById(@PathVariable Long id) {
		return produtoRepository.findById(id) 
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Produto>> getAll(@PathVariable String titulo) {
		return ResponseEntity.ok(produtoRepository.findAllByTituloContainingIgnoreCase(titulo)); 
																									
	}

	@GetMapping("/titulo/{titulo}/{categoria}")
	public ResponseEntity<List<Produto>> getAll(@PathVariable String Titulo, @PathVariable String categoria) {
		return ResponseEntity.ok(produtoRepository.findAllByTituloAndCategoriaContaining(Titulo, categoria));																					// das postagens
	}

	@PostMapping
	public ResponseEntity<Produto> postPostagem(@Valid @RequestBody Produto produto) { 
		return produtoRepository.findById(produto.getCategoria().getId())
				.map(resp -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build()); 
	}

	@PutMapping()
	public ResponseEntity<Produto> putPostagem(@Valid @RequestBody Produto produto, Long id) {
		return produtoRepository.findById(produto.getId())
				.map(resp -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build()); 
		}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
		return produtoRepository.findById(id).map(resposta -> {
			produtoRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());
	}
}
