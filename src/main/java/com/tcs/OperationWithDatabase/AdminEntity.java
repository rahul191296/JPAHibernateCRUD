package com.tcs.OperationWithDatabase;

import java.io.Serializable;
import java.util.*;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMINABLE")
public class AdminEntity implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminEntity() {
		
		// TODO Auto-generated constructor stub
	}

	@Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

     private String adminName;
     
     private String adminGender;
     
    @OneToMany(cascade = CascadeType.ALL)
 	@JoinColumn(name = "ad_id")
     private List<Adresses> adresses;
  

	public AdminEntity(Long adminId, String adminName, String adminGender) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminGender = adminGender;
	}

	    public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	
	public List<Adresses> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresses> adresses) {
		this.adresses = adresses;
	}

}
