package com.mcoc.marvel.domain.enums;

public enum Perfil {

    OFICIAL(0, "ROLE_OFICIAL"),
    MEMBRO(1, "ROLE_MEMBRO");

    private Integer codigo;
    private String descricao;

    Perfil(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Object cod) {
        if(cod == null) {
            return null;
        }
        for(Perfil x: Perfil.values()){
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
