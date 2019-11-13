package com.digitalhealth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhealth.domain.Receita;
import com.digitalhealth.repository.TodasReceitas;

@RestController
public class ReceitasController {
	
	
	private TodasReceitas todasReceitas;

	
	@Autowired
	public ReceitasController(TodasReceitas todasReceitas) {
		super();
		this.todasReceitas = todasReceitas;
	}
	
	@PostMapping("/cadastroReceita")
	public ResponseEntity<Receita> cadastro(@RequestBody Receita receitas){
	
		Receita receitaCadastrada = todasReceitas.save(receitas);

		return ResponseEntity.ok(receitaCadastrada);	
	}
	
	
	@GetMapping("/obterReceita/{id}")
	public ResponseEntity<Receita> cadastro(@PathVariable("id") Long id){
		
		Optional<Receita> receitaCadastrada = todasReceitas.findById(id);
		if(receitaCadastrada.isPresent()) {
			
			return ResponseEntity.ok(receitaCadastrada.get());	
		}
		
			return ResponseEntity.noContent().build();
		
		
	}
	
	
	

}
