package com.ibm.registration.controllers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.registration.models.Registration;
import com.ibm.registration.services.RegistrationApi;

@DisplayName("RegistrationController")
public class RegistrationControllerTest {
	RegistrationController controller;
	RegistrationApi service;

    MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        service = mock(RegistrationApi.class);

        controller = spy(new RegistrationController(service));

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
    
    @Nested
    @DisplayName("Given [POST] /register")
    public class GivenPostRegister {

        @Test
        @DisplayName("When called then it should return a 200 status")
        public void when_called_should_return_200_status() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.post("/register")
            	      .content(asJsonString(new Registration("firstName4", "lastName4","firstName4", "lastName4","firstName4", "lastName4","firstName4", "lastName4","firstName4")))
            	      .contentType(MediaType.APPLICATION_JSON)
            	      .accept(MediaType.APPLICATION_JSON))
            	      .andExpect(status().isOk());
        }
    }
    
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}