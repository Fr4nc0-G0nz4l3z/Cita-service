package cl.franco.citas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import cl.franco.citas.model.Citas;
import cl.franco.citas.repository.CitaRepository;
import cl.franco.citas.client.PacienteClient;
import cl.franco.citas.dto.PacienteDTO;

@Service
@RequiredArgsConstructor
public class CitaService {
    private final CitaRepository citaRepository;
    private final PacienteClient pacienteClient;

    public Citas crearCita(Citas citas){
        //1. Usar feign para ir al microservicio de paciente y traer sus datos
        PacienteDTO paciente = pacienteClient.obtenerPacientePorId(citas.getId());

        if(paciente == null){
            throw new RuntimeException("Paciente no encontrado.");
        }

        System.out.println("Creando cita para: " + paciente.getNombre());

        //2. Guardamos la cita en nuestra base de datos
        return citaRepository.save(citas);
    }



}
