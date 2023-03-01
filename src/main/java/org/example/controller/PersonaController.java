package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dao.PersonaDao;
import org.example.dto.PersonaDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/personas")
@RestController
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaDao personaDao;

    @GetMapping
    public List<PersonaDto> getPersonas() {
        return personaDao.findAll();
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public List<PersonaDto> getPersonasAdministradores() {
        return Arrays.asList(
                PersonaDto
                        .builder()
                        .id(2L)
                        .nombre("Jose")
                        .build()
        );
    }
}
