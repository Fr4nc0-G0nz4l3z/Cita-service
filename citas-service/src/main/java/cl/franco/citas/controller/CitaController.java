package cl.franco.citas.controller;

import cl.franco.citas.model.Citas;
import cl.franco.citas.service.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/citas")
@RequiredArgsConstructor
public class CitaController {
    private final CitaService citaService;
    
    //EndPoint para crear una nueva cita
    @PostMapping
    public ResponseEntity<Citas> crearCita(@RequestBody Citas citas) {
        //1. Llamamos al servicio (que a su vez usara feign para verificar el paciente)
        Citas nuevaCita = citaService.crearCita(citas);

        //Devolvemos la cita creada con un codigo HTTP 201 created
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaCita);
    }
    
}
