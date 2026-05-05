CREATE TABLE citas(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    paciente_id NIGINT NOT NULL,
    especialidad VARCHAR(100) NOT NULL,
    fecha_Hora VARCHAR(50) NOT NULL
);