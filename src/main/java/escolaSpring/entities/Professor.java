package escolaSpring.entities;


import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_professor")
public class Professor extends Pessoa{

    private  String email;

    @OneToMany(mappedBy = "professor")
    private List<Departamento> departamento = new ArrayList<>();

    public Professor(){
        super();
    }

    public Professor(Long id, String nome, String cpf, String datanasimento, String email) {
        super(id, nome, cpf, datanasimento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
