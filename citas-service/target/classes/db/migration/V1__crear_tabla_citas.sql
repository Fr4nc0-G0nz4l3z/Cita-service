CREATE TABLE citas(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pacientes_id BIGINT NOT NULL,
    especialidad VARCHAR(100) NOT NULL,
    fecha_Hora VARCHAR(50) NOT NULL
);