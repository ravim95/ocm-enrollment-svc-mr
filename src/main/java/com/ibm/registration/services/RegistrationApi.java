package com.ibm.registration.services;

import java.util.List;

import com.ibm.registration.models.Registration;

public interface RegistrationApi {
    Registration register(Registration registration);
}