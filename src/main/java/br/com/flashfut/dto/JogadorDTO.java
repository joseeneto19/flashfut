package br.com.flashfut.dto;

import br.com.flashfut.entities.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JogadorDTO {

    private Long id;
    private String nome;
    private LocalDate dataDeNascimento;
    private Double altura;
    private Double peso;
    private String paisDeNascimento;
    private Integer numeroDaCamisa;
    private Time time;
}
