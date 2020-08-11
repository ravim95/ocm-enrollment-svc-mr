package com.ibm.registration.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RegistrationRepository extends MongoRepository<Registration, String> {

}
