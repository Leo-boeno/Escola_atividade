package escolaSpring.repositories;

import escolaSpring.entities.Aluno;
import escolaSpring.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
