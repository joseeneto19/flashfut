CREATE TABLE tb_time (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    estadio VARCHAR(255),
    mascote VARCHAR(255)
);

CREATE TABLE tb_jogador (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_de_nascimento DATE,
    time_id BIGINT,
    altura DOUBLE,
    peso DOUBLE,
    pais_de_nascimento VARCHAR(255),
    numero_da_camisa INT,

    CONSTRAINT fk_jogador_time
    FOREIGN KEY (time_id)
    REFERENCES tb_time(id)
);
