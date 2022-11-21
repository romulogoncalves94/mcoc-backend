package com.mcoc.marvel.services;

import com.mcoc.marvel.domain.Herois;
import com.mcoc.marvel.domain.HeroisGame;
import com.mcoc.marvel.domain.Membros;
import com.mcoc.marvel.domain.enums.Grupo;
import com.mcoc.marvel.domain.enums.Perfil;
import com.mcoc.marvel.repositories.HeroisGameRepository;
import com.mcoc.marvel.repositories.HeroisRepository;
import com.mcoc.marvel.repositories.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private MembrosRepository membrosRepository;

    @Autowired
    private HeroisRepository heroisRepository;

    @Autowired
    private HeroisGameRepository heroisGameRepository;

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

        Herois he1 = new Herois(null, "Homem de Ferro", "Tecnológico", "5 R5", mem2);
        Herois he2 = new Herois(null, "Homem de Ferro", "Tecnológico", "6 R3", mem1);

        HeroisGame hega1 = new HeroisGame(null, "Abominavel", "Cientifico");

        membrosRepository.saveAll(Arrays.asList(mem1, mem2, mem3));
        heroisRepository.saveAll(Arrays.asList(he1, he2));
        heroisGameRepository.saveAll(Arrays.asList(hega1));

    }
}
