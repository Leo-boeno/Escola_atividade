package escolaSpring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(){
        super();
    }

    public Aluno(Long Id, String nome, String cpf, String datanasimento, String matricula) {
        super(Id, nome, cpf, datanasimento);
        this.matricula = matricula;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}


