package Certus.edu.pe.msprofesor.service;

import Certus.edu.pe.msprofesor.dto.CrearProfesorDto;
import Certus.edu.pe.msprofesor.dto.ProfesorDto;
import Certus.edu.pe.msprofesor.dto.ResponseDto;

public interface ProfesorService {

    public ResponseDto getAllProfesor();
    public ResponseDto getProfesor(Long id);
    public ResponseDto createProfesor(CrearProfesorDto profesor);
    public ResponseDto updateProfesor(CrearProfesorDto profesor);
    public ResponseDto deteleProfesor(Long id);
}
