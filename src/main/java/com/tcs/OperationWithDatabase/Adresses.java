package com.tcs.OperationWithDatabase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adresses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adressId;
	
	@Column(name = "Description")
	private String desc;
	
	public Long getAdressId() {
		return adressId;
	}

	public void setAdressId(Long adressId) {
		this.adressId = adressId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
