package org.example.dao;

import org.example.dto.PersonaDto;

import java.util.List;

public interface PersonaDao {

    List<PersonaDto> findAll();

}
