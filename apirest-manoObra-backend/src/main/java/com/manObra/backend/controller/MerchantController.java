package com.manObra.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.manObra.backend.models.entity.Merchant;
import com.manObra.backend.services.interfaces.IMerchantService;

@RestController
@RequestMapping("/api/merchant")
public class MerchantController {
	
	@Autowired
	private IMerchantService service;
	
	@GetMapping("/{id}")
	
	public Merchant retrieve(@PathVariable(value = "id")Long id) {
		
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Merchant> list(){
		
		return service.findAll();
		
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Merchant creat(@RequestBody Merchant merchant) {
		
		service.save(merchant);
		return merchant;
		
	}
	
	@PutMapping("")
	@ResponseStatus(HttpStatus.OK)
	public Merchant update(@RequestBody Merchant merchant, @PathVariable Long id) {
		service.save(merchant);
		return merchant;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {		
		service.delete(id);
		
	}
	

	public MerchantController() {
		// TODO Auto-generated constructor stub
	}

}
