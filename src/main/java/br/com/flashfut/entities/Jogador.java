package br.com.flashfut.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;
    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;
    private Double altura;
    private Double peso;
    @Column(name = "pais_de_nascimento")
    private String paisDeNascimento;
    @Column(name = "numero_da_camisa")
    private Integer numeroDaCamisa;
}
