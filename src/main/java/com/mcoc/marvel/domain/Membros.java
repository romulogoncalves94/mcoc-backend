package com.mcoc.marvel.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mcoc.marvel.domain.enums.Grupo;
import com.mcoc.marvel.domain.enums.Perfil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_membros")
public class Membros implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(unique = true)
    private String nickname;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "GRUPO")
    private Set<Integer> grupos = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERFIS")
    private Set<Integer> perfis = new HashSet<>();

    @OneToMany(mappedBy = "membros")
    private List<Herois> herois = new ArrayList<>();

    public Membros() {
        super();
        addPerfil(Perfil.MEMBRO);
    }

    public Membros(Integer id, String nome, String nickname) {
        super();
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
        addPerfil(Perfil.MEMBRO);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Perfil> getGrupo() {
        return grupos.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addGrupo(Grupo grupo) {
        this.grupos.add(grupo.getCodigo());
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil.getCodigo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membros membros = (Membros) o;
        return id.equals(membros.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
