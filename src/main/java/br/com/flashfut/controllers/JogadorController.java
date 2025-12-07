package br.com.flashfut.controllers;

import br.com.flashfut.entities.Jogador;
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
    public List<Jogador> listarJogadores() {
        return service.listarJogadores();
    }

    @PostMapping
    public Jogador criarJogador(@RequestBody Jogador jogador) {
        return service.criarJogador(jogador);
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Jogador editar(@PathVariable Long id, @RequestBody Jogador jogador) {
        return service.editar(id, jogador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }



}
