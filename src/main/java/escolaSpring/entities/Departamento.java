package escolaSpring.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    public Departamento(){}

    public Departamento(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor client) {
        this.professor = client;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departamento departamento = (Departamento) o;
        return Objects.equals(id, departamento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
