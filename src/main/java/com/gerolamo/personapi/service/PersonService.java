package com.gerolamo.personapi.service;

import com.gerolamo.personapi.dto.mapper.PersonMapper;
import com.gerolamo.personapi.dto.request.PersonDTO;
import com.gerolamo.personapi.dto.response.MessageResponseDTO;
import com.gerolamo.personapi.entities.Person;
import com.gerolamo.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);

        MessageResponseDTO messageResponseDTO = new MessageResponseDTO();
        messageResponseDTO.setMessage("Created person with ID " + savedPerson.getId());
        return messageResponseDTO;
    }
}
