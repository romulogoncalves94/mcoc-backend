package com.mcoc.marvel.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_herois")
public class Herois implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeHeroi;
    private String classeHeroi;
    private String position;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "membros_id")
    private Membros membros;

    public Herois() {
        super();
    }

    public Herois(Integer id, String nomeHeroi, String classeHeroi, String position, Membros membros) {
        this.id = id;
        this.nomeHeroi = nomeHeroi;
        this.classeHeroi = classeHeroi;
        this.position = position;
        this.membros = membros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getClasseHeroi() {
        return classeHeroi;
    }

    public void setClasseHeroi(String classeHeroi) {
        this.classeHeroi = classeHeroi;
    }
}
