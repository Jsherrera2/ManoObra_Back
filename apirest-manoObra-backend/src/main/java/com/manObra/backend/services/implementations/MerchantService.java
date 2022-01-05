package com.manObra.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manObra.backend.models.dao.IMerchant;
import com.manObra.backend.models.entity.Merchant;
import com.manObra.backend.services.interfaces.IMerchantService;

@Service
public class MerchantService implements IMerchantService {
	
		//Base salary year 2022
		private int salary = 425; 
		
		//Basic working hours 
		private int total_hours = 240;
		
		//Basic working days
		private int total_days = 30;
		
		//
		private float cost;
	@Autowired
	private IMerchant dao;

	public MerchantService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Merchant merchant) {
		try {
			
			dao.save(merchant);
			
		}catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Merchant findById(Long id) {
		
		return dao.findById(id).get();


	}

	@Override
	public void delete(Long id) {
		
		try {
			
			dao.deleteById(id);
			
		}catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public List<Merchant> findAll() {
		
		return (List<Merchant>) dao.findAll();
	}

	
	@Override
	public float HourlyValue(int hoursT) {
		Merchant m = new Merchant();
		this.cost = (this.salary/this.total_hours)*hoursT;
		m.setCost(cost);
		return m.getCost();
	}

	

}
