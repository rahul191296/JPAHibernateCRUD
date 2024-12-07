package com.tcs.OperationWithDatabase;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<AdminEntity,Long> {


}
