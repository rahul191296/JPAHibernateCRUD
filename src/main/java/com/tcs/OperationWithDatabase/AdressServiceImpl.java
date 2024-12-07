package com.tcs.OperationWithDatabase;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressServiceImpl implements AdressService{

	@Autowired
	private AdressRepo adressRepo;
	
	@Override
	public Optional<Adresses> getAdminAdressById(Long id) {
		Optional<Adresses> ad = adressRepo.findById(id);
		return ad;
	}

	
	
	
}
