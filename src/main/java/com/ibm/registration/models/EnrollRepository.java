package com.ibm.registration.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EnrollRepository extends CrudRepository<Enroll, Long> {

}
