package com.ibm.registration.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.registration.models.Enroll;
import com.ibm.registration.models.EnrollRepository;
import com.ibm.registration.models.Registration;
import com.ibm.registration.models.RegistrationRepository;

@Service
public class EnrollService implements EnrollApi {
	
	@Autowired
	EnrollRepository enrollRepository;
	
    @Override
    public Enroll enroll(Enroll enroll) {
    	int rollnbr = new Random().nextInt();
    	System.out.println("EnrollService rollnbr: "+rollnbr);
    	enroll.setRollnbr(new Integer(rollnbr).toString());
        return enrollRepository.save(enroll);
    }
}