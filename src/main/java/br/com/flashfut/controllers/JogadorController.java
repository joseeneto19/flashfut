package br.com.flashfut.controllers;

import br.com.flashfut.dto.JogadorDTO;
import br.com.flashfut.services.JogadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService service;

    @GetMapping
    public List<JogadorDTO> listarJogadores() {
        return service.listarJogadores();
    }

    @PostMapping
    public JogadorDTO criarJogador(@RequestBody JogadorDTO jogador) {
        return service.criarJogador(jogador);
    }

    @GetMapping("/{id}")
    public JogadorDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public JogadorDTO editar(@PathVariable Long id, @RequestBody JogadorDTO jogador) {
        return service.editar(id, jogador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }



}
