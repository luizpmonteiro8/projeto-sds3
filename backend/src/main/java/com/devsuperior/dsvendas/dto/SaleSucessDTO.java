package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String sellerNameString;
	private Long visited;
	private Long deals;
	
	public SaleSucessDTO() {
		
	}

	public SaleSucessDTO(Seller seller, Long visited,Long deals) {
		this.sellerNameString = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerNameString() {
		return sellerNameString;
	}

	public void setSellerNameString(String sellerNameString) {
		this.sellerNameString = sellerNameString;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	


	
	

	
}
