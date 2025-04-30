package com.example.apiencuesta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncuestaController {

    // Clase interna para ejemplo. Lo ideal es ponerla en un archivo aparte
    static class Encuesta {
        private String titulo;
        private String descripcion;
        
        public Encuesta() {}
        
        public Encuesta(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
        }
        
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
        public String getDescripcion() { return descripcion; }
        public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    }

    @GetMapping("/api/encuesta/{id}")
    public Encuesta getEncuesta(@PathVariable int id) {
        // Lógica para devolver un objeto de tipo Encuesta
        // Aquí puedes llamar a BD o crear un objeto estático
        return new Encuesta("Encuesta de prueba " + id, 
                            "Esta es la descripción de la encuesta " + id);
    }
}
