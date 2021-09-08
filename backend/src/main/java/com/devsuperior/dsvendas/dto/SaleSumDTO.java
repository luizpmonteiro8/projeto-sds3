package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String sellerNameString;
	private Double sumDouble;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sumDouble) {
		super();
		this.sellerNameString = seller.getName();
		this.sumDouble = sumDouble;
	}

	public String getSellerNameString() {
		return sellerNameString;
	}

	public void setSellerNameString(String sellerNameString) {
		this.sellerNameString = sellerNameString;
	}

	public Double getSumDouble() {
		return sumDouble;
	}

	public void setSumDouble(Double sumDouble) {
		this.sumDouble = sumDouble;
	}
	
	

	
}
