package escolaSpring.config;

import escolaSpring.entities.Aluno;
import escolaSpring.entities.Departamento;
import escolaSpring.entities.Materia;
import escolaSpring.entities.Professor;
import escolaSpring.repositories.AlunoRepository;
import escolaSpring.repositories.DepartamentoRepository;
import escolaSpring.repositories.MateriaRepository;
import escolaSpring.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public void run(String... args) throws Exception {
        Aluno a1 = new Aluno(null, "leonardo", "124355657", "30122001", "123456");
        Aluno a2 = new Aluno(null, "Artur", "659865159", "30122001", "216946");
        Aluno a3 = new Aluno(null, "André", "3216846648", "30122001", "9465486");
        alunoRepository.saveAll(Arrays.asList(a1, a2, a3));

        Departamento d1 = new Departamento(null, "Artes");
        Departamento d2 = new Departamento(null,"Humanas");
        Departamento d3 = new Departamento(null,"Extras");
        departamentoRepository.saveAll(Arrays.asList(d1, d2, d3));

        Professor p1 = new Professor(null,"Mario", "1321651", "05061986", "sodfkdk@gmail.com");
        Professor p2 = new Professor(null,"Luige", "1321651", "05061986", "sodfkdk@gmail.com");
        Professor p3 = new Professor(null,"José", "1321651", "05061986", "sodfkdk@gmail.com");
        professorRepository.saveAll(Arrays.asList(p1, p2, p3));

        Materia m1 = new Materia(null, "Matematica",80 );
        materiaRepository.saveAll(Arrays.asList(m1));


    }
}
