package com.tcs.OperationWithDatabase;

import java.util.List;

public interface AdminService {
	
	AdminEntity registerAdminService(AdminModel adminModel);
	
	List<AdminEntity> fetchAdminList();
	
	void deleteAdminById(Long adminId);
	
	

}
