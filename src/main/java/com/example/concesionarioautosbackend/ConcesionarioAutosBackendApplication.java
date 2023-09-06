package com.example.concesionarioautosbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ConcesionarioAutosBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcesionarioAutosBackendApplication.class, args);

    }
    @GetMapping("/holamundo")
    public String holamundo(){
        return "Hola mundo";
    }

}
