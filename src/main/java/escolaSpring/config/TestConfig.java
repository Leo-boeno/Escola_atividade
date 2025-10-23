package escolaSpring.config;

import escolaSpring.entities.Aluno;
import escolaSpring.entities.Professor;
import escolaSpring.repositories.AlunoRepository;
import escolaSpring.repositories.PessoaRepository;
import escolaSpring.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void run(String... args) throws Exception {
        Aluno a1 = new Aluno(null, "leonardo", "124355657", "30122001", "123456");
        Aluno a2 = new Aluno(null, "Artur", "124355657", "30122001", "21564");
        alunoRepository.saveAll(Arrays.asList(a1, a2));

        Professor p1 = new Professor(null,"Fulano", "1321651", "05061986", "sodfkdk@gmail.com");
        professorRepository.saveAll(Arrays.asList(p1));


    }
}
