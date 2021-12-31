package com.manObra.backend.services.interfaces;

import java.util.List;

import com.manObra.backend.models.entity.Merchant;

public interface IMerchantService {
	
	public void save(Merchant merchant);
	
	public Merchant findById(Long id);
	
	public void delete(Long id);
	
	public List<Merchant> findAll();
	

}
