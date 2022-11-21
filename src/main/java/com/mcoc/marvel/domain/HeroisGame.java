package com.mcoc.marvel.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_heroisGame")
public class HeroisGame implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String nomeHeroiGame;
    private String classeHeroiGame;

    public HeroisGame() {
        super();
    }

    public HeroisGame(Integer id, String nomeHeroiGame, String classeHeroiGame) {
        this.id = id;
        this.nomeHeroiGame = nomeHeroiGame;
        this.classeHeroiGame = classeHeroiGame;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeHeroiGame() {
        return nomeHeroiGame;
    }

    public void setNomeHeroiGame(String nomeHeroiGame) {
        this.nomeHeroiGame = nomeHeroiGame;
    }

    public String getClasseHeroiGame() {
        return classeHeroiGame;
    }

    public void setClasseHeroiGame(String classeHeroiGame) {
        this.classeHeroiGame = classeHeroiGame;
    }
}
