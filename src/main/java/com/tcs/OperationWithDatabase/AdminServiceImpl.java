package com.tcs.OperationWithDatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepo adminRepo;

	@Autowired
	AdminModel adminModel;
		
	@Override
	public AdminEntity registerAdminService(AdminModel adminModel) {
		AdminEntity adminEntity = new AdminEntity();
		
		adminEntity.setAdminName(adminModel.getAdminName());
		adminEntity.setAdminGender(adminModel.getAdminGender());
		
		           System.out.println("zzzzzzzzzqqqqqqqqqqqaaaaaaaaa");
	     
	     return  adminRepo.save(adminEntity);
	}
	
	 @Override
	    public List<AdminEntity> fetchAdminList() {
	        return (List<AdminEntity>) adminRepo.findAll();
	    }
	 
	 @Override
	    public void deleteAdminById(Long adminId) {
		 adminRepo.deleteById(adminId);
	    }
}
