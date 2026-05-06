package cl.franco.citas.model;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name ="Citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacientes_id;
    private String especialidad;
    private String fechaHora;

}
