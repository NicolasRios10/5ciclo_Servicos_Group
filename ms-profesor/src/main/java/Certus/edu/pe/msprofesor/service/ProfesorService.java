package Certus.edu.pe.msprofesor.service;

import Certus.edu.pe.msprofesor.dto.CrearActualizarProfesorDto;
import Certus.edu.pe.msprofesor.dto.ResponseDto;

public interface ProfesorService {

    public ResponseDto getAllProfesor();
    public ResponseDto getProfesor(Long id);
    public ResponseDto createProfesor(CrearActualizarProfesorDto profesor);
    public ResponseDto updateProfesor(CrearActualizarProfesorDto profesor);
    public ResponseDto deteleProfesor(Long id);
}
