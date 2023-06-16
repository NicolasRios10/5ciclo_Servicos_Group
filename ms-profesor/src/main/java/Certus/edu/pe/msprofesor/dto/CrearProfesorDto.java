package Certus.edu.pe.msprofesor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearProfesorDto {
    private Long id;
    private String nombre;
    private String apellido;
    private char sexo;
    private Boolean estado;
}
