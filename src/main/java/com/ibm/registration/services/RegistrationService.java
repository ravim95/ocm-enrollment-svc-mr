package com.ibm.registration.services;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.ibm.registration.models.Registration;

@Service
public class RegistrationService implements RegistrationApi {
    @Override
    public Registration register(Registration registration) {
    	int appnbr = new Random().nextInt();
    	System.out.println("RegistrationService appnbr: "+appnbr);
    	registration.setAppnbr(new Integer(appnbr).toString());
        return registration;
    }
}