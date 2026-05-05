package cl.franco.citas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Table(name ="citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacientes_id;

    @NotBlank(message = "No debe estar en blanco o vacio.")
    private String especialidad;
    private String fechaHora;

}
