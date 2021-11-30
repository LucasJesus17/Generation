package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {

	@GetMapping
	public String obj() {
		return "Criar Banco de Dados <br/> Criar meu primeiro programa Spring <br/> Inciar o Blog Pessoal e mais ...";
	}
}
