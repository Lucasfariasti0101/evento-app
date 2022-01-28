package com.eventoapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_EVENTO")
public class Evento implements Serializable {

    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

  
    @NotEmpty
    private String nome;

   
    @NotEmpty
    private String local;

 
    @NotEmpty
    private String data;

    
    @NotEmpty
    private String horario;

    @OneToMany
    private List<Convidado> convidados;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
