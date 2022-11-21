package com.mcoc.marvel.domain.enums;

public enum Grupo {

    GRUPO1(0, "ROLE_GRUPO1"),
    GRUPO2(1, "ROLE_GRUPO2"),
    GRUPO3(2, "ROLE_GRUPO3");

    private Integer codigo;
    private String descricao;

    Grupo(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Grupo toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }
        for(Grupo x: Grupo.values()) {
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Grupo inválido");
    }
}
