package escolaSpring.services;


import escolaSpring.entities.Aluno;
import escolaSpring.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll(){

        return alunoRepository.findAll();
    }
}
