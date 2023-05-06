package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroControler {
	
	CarroRepository repository;
	
	@GetMapping("/carro")
	public List<Carro>getAllCarros(){
		return repository.findAll();
	}
	
    @PostMapping("/carro")
    public Carro SaveCarro(@RequestBody Carro carro) {
    	return repository.save(carro);
    }
    	
    @GetMapping("/carro/{id}")
    public Carro GetById(@PathVariable Long id){
    		return repository.findById(id).get();
    		}
    	
    			
    @DeleteMapping("/carro/{id}")
    public void deleteCarro(@PathVariable Long id) {
    	repository.deleteById(id);
    }
}

    