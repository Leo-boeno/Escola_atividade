package escolaSpring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer cargahoraria;

    public Materia(){}

    public Materia(Long id, String nome, Integer cargahoraria) {
        this.id = id;
        this.nome = nome;
        this.cargahoraria = cargahoraria;
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

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
}
