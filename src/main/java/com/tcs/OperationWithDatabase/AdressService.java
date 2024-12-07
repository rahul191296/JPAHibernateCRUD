package com.tcs.OperationWithDatabase;

import java.util.Optional;

public interface AdressService {

	Optional<Adresses> getAdminAdressById(Long id);
}
