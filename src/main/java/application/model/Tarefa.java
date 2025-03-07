package application.model;

import jakarta.persistence.Entity;

@Entity
@Table (namem = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValues(strategy = GenetionType.IDENTITY)
    private long id;
    private String descricao;

    public void setId(long id) {
        this.id  = id;
    }
    public long getId(){
        return this.id;
    }
    public void setDescricao(String descricao){

    }

    
}
