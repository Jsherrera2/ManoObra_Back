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
	
	
	//Base salary year 2022
	private int salary = 425; 
	
	private int total_hours = 240;
	
	private float valorH;
	//Labor cosst
	@Column(name = "cost")
	private float cost;
	
	
	//Working hours
	@Column(name = "hours")
	private int hours;
	
	//Working days
	@Column(name = "days")
	private int days;
	
	
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}
	
	
	
	
	public int getTotal_hours() {
		return total_hours;
	}


	public void setTotal_hours(int total_hours) {
		this.total_hours = total_hours;
	}


	public float getValorH() {
		return valorH;
	}


	public void setValorH(float valorH) {
		this.valorH = valorH;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public float HourlyValue(int salary, int hoursT) {
		this.valorH = this.salary/this.total_hours;
		System.out.println(valorH);
		return this.valorH;		
	}
	
	
	

}
