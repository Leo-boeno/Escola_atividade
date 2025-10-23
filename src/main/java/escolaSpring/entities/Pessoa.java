package escolaSpring.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@MappedSuperclass
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String cpf;
    private String datanasimento;


    public Pessoa(){}

    public Pessoa(Long id, String nome, String cpf, String datanasimento) {
        Id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.datanasimento = datanasimento;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasimento() {
        return datanasimento;
    }

    public void setDatanasimento(String datanasimento) {
        this.datanasimento = datanasimento;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Pessoa pessoa = (Pessoa) o;
//        return Objects.equals(Id, pessoa.Id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(Id);
//    }

}
