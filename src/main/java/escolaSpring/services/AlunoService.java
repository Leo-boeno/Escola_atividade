package escolaSpring.services;

import escolaSpring.entities.Aluno;
import escolaSpring.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll(){

        return alunoRepository.findAll();
    }
}
