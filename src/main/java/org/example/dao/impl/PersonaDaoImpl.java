package org.example.dao.impl;

import org.example.dao.PersonaDao;
import org.example.dto.PersonaDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    private final static List<PersonaDto> personaDtoList = new ArrayList<PersonaDto>();

    static {
        personaDtoList
                .add(
                        PersonaDto
                                .builder()
                                .id(1L)
                                .nombre("Pedro")
                                .build()
                );
    }

    @Override
    public List<PersonaDto> findAll() {
        return personaDtoList;
    }
}
