package com.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "TB_CONVIDADO")
public class Convidado {

    @Id
    @NotEmpty
    private String rg;

    @NotEmpty
    private String nomeConvidado;

    @NotEmpty
    private String idadeConvidado;

    @ManyToOne
    private Evento evento;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public String getIdadeConvidado() {
        return idadeConvidado;
    }

    public void setIdadeConvidado(String idadeConvidado) {
        this.idadeConvidado = idadeConvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
