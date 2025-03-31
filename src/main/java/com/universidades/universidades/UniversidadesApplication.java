package com.universidades.universidades;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.universidades.universidades.persistence.entities.Universidad;
import com.universidades.universidades.persistence.repositories.UniversidadRepository;
import java.util.List;

@SpringBootApplication
public class UniversidadesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversidadesApplication.class, args);
    }

    @Bean
        CommandLineRunner init(UniversidadRepository universidadRepository) {
        return args -> {
            Universidad universidad1 = new Universidad();
            universidad1.setNombre("Universidad Nacional");
            universidad1.setDireccion("Av. Siempre Viva 123");
            universidad1.setEmail("contacto@unacional.edu");
            universidad1.setTelefono("555-1234");

            Universidad universidad2 = new Universidad();
            universidad2.setNombre("Universidad Tecnológica");
            universidad2.setDireccion("Calle Innovación 45");
            universidad2.setEmail("info@utec.edu");
            universidad2.setTelefono("555-5678");

            Universidad universidad3 = new Universidad();
            universidad3.setNombre("Universidad del Futuro");
            universidad3.setDireccion("Boulevard del Saber 789");
            universidad3.setEmail("admisiones@ufuturo.edu");
            universidad3.setTelefono("555-9101");

            universidadRepository.saveAll(List.of(universidad1, universidad2, universidad3));
        };
    }

}
