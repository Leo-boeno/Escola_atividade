package escolaSpring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_professor")
public class Professor extends Pessoa{

    private  String email;

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
