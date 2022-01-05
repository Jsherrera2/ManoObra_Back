package com.manObra.backend.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Merchant")
@Entity
public class Merchant  implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional =false)
	@Column(name = "id_mer")
	private Long idMerchant;
	
	//Administrativo por dias
	//Obrero por horas
	//Working hours

	@Column(name = "hours")
	private int hours;
	
	//Working days
	//@Column(name = "days")
	//private int days;
	
	//Labor cosst
	@Column(name = "cost")
	private float cost;
	
	
	public Merchant() {
		super();
	}


	public Merchant(Long idMerchant) {
		super();
		this.idMerchant = idMerchant;
	}


	public Long getIdMerchant() {
		return idMerchant;
	}


	public void setIdMerchant(Long idMerchant) {
		this.idMerchant = idMerchant;
	}



	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	/*public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}*/
	
	

	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	


}
