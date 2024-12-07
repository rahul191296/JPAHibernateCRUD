package com.tcs.OperationWithDatabase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	
	@Autowired
	AdminService adminService;
	
	
	AdminEntity adminEntity = new AdminEntity();
	
	@Autowired
	AdminModel adminModel;
	
	@Autowired
	AdressService adressService;

	@PostMapping("/register")
	public ResponseEntity<AdminEntity> register(@RequestBody AdminModel adminModel, Error error)
	{		
		ResponseEntity<AdminEntity> response=null;
		
		adminEntity = adminService.registerAdminService(adminModel);
		
		if(adminEntity!=null) {
		
			response=new ResponseEntity<AdminEntity>(adminEntity , HttpStatus.CREATED);
		}
		return response;
	}
	
	@GetMapping("/allAdminList")
	public ResponseEntity<List<AdminEntity>> fetchAllAdmin() {
		ResponseEntity<List<AdminEntity>> response = null;
		
		List<AdminEntity> adminEntity = adminService.fetchAdminList();
		response = new ResponseEntity<List<AdminEntity>> ( adminEntity , HttpStatus.FOUND);
		return response;
	}
	
	@DeleteMapping("/admin/{adminId}")
    public ResponseEntity<Void> deleteAdminById(@PathVariable("adminId") Long adminId) {
		ResponseEntity<Void> response=null;
        adminService.deleteAdminById(adminId);
        
        response = new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    	
        return response;
    }
	
	
	@GetMapping("/adress/{adressId}")
	public ResponseEntity<Adresses> getAdressById(@PathVariable("adressId") Long adressId) {
		ResponseEntity<Adresses> response = null;
		
		Optional<Adresses> adress = adressService.getAdminAdressById(adressId);
		if(adress.isPresent()) {
		response = new ResponseEntity<Adresses> ( adress.get() , HttpStatus.FOUND);
		
		}
		return response;
	}
	
}
	