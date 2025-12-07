package br.com.flashfut.services;

import br.com.flashfut.entities.Jogador;
import br.com.flashfut.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Jogador buscarPorId(Long id) {
        Optional<Jogador> jogadorEncontrado = repository.findById(id);
        return jogadorEncontrado.orElse(null);
    }

    public Jogador editar(Long id, Jogador jogador) {
        Optional<Jogador> jogadorExistente = repository.findById(id);
        if (jogadorExistente.isPresent()) {
            jogador.setId(id);
            Jogador jogadorSalvo = repository.save(jogador);
            return jogadorSalvo;
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
