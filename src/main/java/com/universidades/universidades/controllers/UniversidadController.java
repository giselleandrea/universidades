package com.universidades.universidades.controllers;

import com.universidades.universidades.dto.UniversidadDto;
import com.universidades.universidades.persistence.entities.Universidad;
import com.universidades.universidades.services.UniversidadService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/universidades")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class UniversidadController {

    private final UniversidadService universidadService;

    @PostMapping("/")
    public Universidad crear(@RequestBody UniversidadDto universidadDto) {
        return universidadService.crearUniversidad(universidadDto);
    }

    @GetMapping("/")
    public List<Universidad> listarTodas() {
        return universidadService.listarTodas();
    }
}
