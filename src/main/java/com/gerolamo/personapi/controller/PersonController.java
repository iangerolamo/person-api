package com.gerolamo.personapi.controller;

import com.gerolamo.personapi.dto.request.PersonDTO;
import com.gerolamo.personapi.dto.response.MessageResponseDTO;
import com.gerolamo.personapi.entities.Person;

import com.gerolamo.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }
}
