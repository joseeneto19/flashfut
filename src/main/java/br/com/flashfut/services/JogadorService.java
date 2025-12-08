package br.com.flashfut.services;

import br.com.flashfut.dto.JogadorDTO;
import br.com.flashfut.entities.Jogador;
import br.com.flashfut.mapper.JogadorMapper;
import br.com.flashfut.repositories.JogadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JogadorService {


    private final JogadorRepository repository;
    private final JogadorMapper mapper;

    public List<JogadorDTO> listarJogadores() {
        List<Jogador> jogadores = repository.findAll();
        return jogadores.stream().map(j -> mapper.toDto(j)).toList();
    }

    public JogadorDTO criarJogador(JogadorDTO dto) {
        Jogador jogadorEntity = mapper.toEntity(dto);
        Jogador jogadorSalvo = repository.save(jogadorEntity);
        return mapper.toDto(jogadorSalvo);
    }

    public JogadorDTO buscarPorId(Long id) {
        Optional<Jogador> jogadorEncontrado = repository.findById(id);
        return jogadorEncontrado.map(jogador -> mapper.toDto(jogador)).orElse(null);
    }

    public JogadorDTO editar(Long id, JogadorDTO dto) {
        Optional<Jogador> jogadorExistente = repository.findById(id);
        if (jogadorExistente.isPresent()) {
            dto.setId(id);
            Jogador jogadorSalvo = repository.save(mapper.toEntity(dto));
            return mapper.toDto(jogadorSalvo);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
