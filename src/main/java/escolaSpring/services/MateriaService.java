package escolaSpring.services;

import escolaSpring.entities.Aluno;
import escolaSpring.entities.Materia;
import escolaSpring.repositories.AlunoRepository;
import escolaSpring.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> findAll(){

        return materiaRepository.findAll();
    }
}
