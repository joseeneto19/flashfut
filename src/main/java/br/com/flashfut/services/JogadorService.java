package br.com.flashfut.services;

import br.com.flashfut.entities.Jogador;
import br.com.flashfut.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorService {


    private final JogadorRepository repository;

    public List<Jogador> listarJogadores() {
        return repository.findAll();
    }

    public Jogador criarJogador(Jogador jogador) {
        return repository.save(jogador);
    }
}
