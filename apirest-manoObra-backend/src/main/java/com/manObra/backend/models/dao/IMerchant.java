package com.manObra.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.manObra.backend.models.entity.Merchant;

public interface IMerchant extends CrudRepository <Merchant, Long>  {

}
