package com.mcoc.marvel.services;

import com.mcoc.marvel.domain.Membros;
import com.mcoc.marvel.domain.enums.Grupo;
import com.mcoc.marvel.domain.enums.Perfil;
import com.mcoc.marvel.repositories.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private MembrosRepository membrosRepository;

    public void instanciaBaseDeDados() {
        Membros mem1 = new Membros(null, "Rômulo", "teste");
        mem1.addPerfil(Perfil.MEMBRO);
        mem1.addGrupo(Grupo.GRUPO1);

        Membros mem2 = new Membros(null, "Ricardo", "Gomes");
        mem2.addPerfil(Perfil.OFICIAL);
        mem2.addGrupo(Grupo.GRUPO2);

        Membros mem3 = new Membros(null, "João", "Rodrigues");
        mem3.addPerfil(Perfil.MEMBRO);
        mem3.addGrupo(Grupo.GRUPO3);

        membrosRepository.saveAll(Arrays.asList(mem1, mem2, mem3));
    }
}
