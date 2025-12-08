package br.com.flashfut.mapper;

import br.com.flashfut.dto.JogadorDTO;
import br.com.flashfut.entities.Jogador;

public class JogadorMapper {

    public Jogador toEntity(JogadorDTO jogadorDTO) {
        Jogador jogador = new Jogador();
        jogador.setId(jogadorDTO.getId());
        jogador.setNome(jogador.getNome());
        jogador.setDataDeNascimento(jogadorDTO.getDataDeNascimento());
        jogador.setAltura(jogadorDTO.getAltura());
        jogador.setPeso(jogador.getPeso());
        jogador.setPaisDeNascimento(jogadorDTO.getPaisDeNascimento());
        jogador.setNumeroDaCamisa(jogadorDTO.getNumeroDaCamisa());
        jogador.setTime(jogadorDTO.getTime());

        return jogador;
    }

    public JogadorDTO toDto(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setId(jogador.getId());
        dto.setNome(jogador.getNome());
        dto.setDataDeNascimento(jogador.getDataDeNascimento());
        dto.setAltura(jogador.getAltura());
        dto.setPeso(jogador.getPeso());
        dto.setPaisDeNascimento(jogador.getPaisDeNascimento());
        dto.setNumeroDaCamisa(jogador.getNumeroDaCamisa());
        dto.setTime(jogador.getTime());
        return dto;
    }

}
