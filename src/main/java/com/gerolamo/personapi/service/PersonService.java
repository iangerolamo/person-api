package com.gerolamo.personapi.service;

import com.gerolamo.personapi.dto.response.MessageResponseDTO;
import com.gerolamo.personapi.entities.Person;
import com.gerolamo.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        MessageResponseDTO messageResponseDTO = new MessageResponseDTO();
        messageResponseDTO.setMessage("Created person with ID " + savedPerson.getId());
        return messageResponseDTO;
    }
}
