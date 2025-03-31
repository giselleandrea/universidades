package com.universidades.universidades.dto;

import jakarta.validation.constraints.NotBlank;

public record UniversidadDto(
    @NotBlank String nombre,
    String direccion,
    String email,
    String telefono
) {}
