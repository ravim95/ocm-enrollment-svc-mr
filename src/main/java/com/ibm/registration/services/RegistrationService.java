package com.ibm.registration.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.registration.models.Registration;
import com.ibm.registration.models.RegistrationRepository;

@Service
public class RegistrationService implements RegistrationApi {
	
	@Autowired
	RegistrationRepository registrationRepository;
	
    @Override
    public Registration register(Registration registration) {
    	int appnbr = new Random().nextInt();
    	System.out.println("RegistrationService appnbr: "+appnbr);
    	registration.setAppnbr(new Integer(appnbr).toString());
        return registrationRepository.save(registration);
    }
}