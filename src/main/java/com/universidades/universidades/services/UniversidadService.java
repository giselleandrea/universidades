package com.universidades.universidades.services;

import com.universidades.universidades.dto.UniversidadDto;
import com.universidades.universidades.persistence.entities.Universidad;
import com.universidades.universidades.persistence.repositories.UniversidadRepository;
import org.springframework.stereotype.Service;

@Service
public class UniversidadService {
    UniversidadRepository universidadRepository;

    public UniversidadService(UniversidadRepository universidadRepository) {
        this.universidadRepository = universidadRepository;
    }

    public Universidad crearUniversidad(UniversidadDto universidadDto) {
        Universidad universidad = new Universidad();
        universidad.setNombre(universidadDto.nombre());
        universidad.setDireccion(universidadDto.direccion());
        universidad.setEmail(universidadDto.email());
        universidad.setTelefono(universidadDto.telefono());
        
        return universidadRepository.save(universidad);
    }
}
