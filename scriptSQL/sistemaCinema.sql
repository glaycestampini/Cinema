create database sistemaCinemaV2;
use sistemaCinemaV2;

CREATE TABLE `funcionario` (
  `id_funcionario` int NOT NULL AUTO_INCREMENT,
  `login_funcionario` varchar(25),
  `nome` varchar(50),
  `senha_funcionario` varchar(25),
  `telefone_funcionario` varchar(50),
  `endereço_funcionario` varchar(50),
  `cargo_funcionario` varchar(25) ,
  PRIMARY KEY (`id_funcionario`)
);

CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `login_usuario` varchar(25),
  `nome_usuario` varchar(50),
  `senha_usuario` varchar(25),
  `cargo_usuario` varchar(25),
  PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `filme` (
  `id_filme` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50),
  `categoria` varchar(50),
  `classificacao` varchar(20),
  `duracao` int,
  `data_cadastro` date,
  `valor_ingresso` double,
  PRIMARY KEY (`id_filme`)
);

CREATE TABLE `sala` (
	`id_sala`int NOT NULL AUTO_INCREMENT, 
    `sala` int,
    PRIMARY KEY (`id_sala`)
    );
    
CREATE TABLE `dataHorario` (
	`id_dataHorario`int NOT NULL AUTO_INCREMENT, 
    `data` date,
    `horario` varchar(10),
    PRIMARY KEY (`id_dataHorario`)
    );
    
CREATE TABLE `assento` (
	`id_assento`int NOT NULL AUTO_INCREMENT, 
    `ocupado` boolean,
    `id_sala`int,
    PRIMARY KEY (`id_assento`),
    constraint id_sala foreign key (id_sala) references sala(id_sala)
    );
    
CREATE TABLE `sessao` (
	`id_sessao`int NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY (`id_sessao`),
    `id_assento`int ,
    `fk_sala`int ,
    `id_dataHorario`int ,
    `fk_filme`int ,
    constraint fk_sala foreign key (fk_sala) references sala(id_sala),
    constraint id_assento foreign key (id_assento) references assento(id_assento),
    constraint id_dataHorario foreign key (id_dataHorario) references dataHorario(id_dataHorario),
    constraint fk_filme foreign key (fk_filme) references filme(id_filme)
    );
    
CREATE TABLE `venda` (
  `id_venda` int NOT NULL AUTO_INCREMENT,
  `id_sessao` int ,
  `ingresso` int,
  `preco` double,
  `total` double,
  `data_venda` date,
  PRIMARY KEY (`id_venda`),
  constraint id_sessao foreign key (id_sessao) references sessao(id_sessao)
);

    insert into filme values
(default, 'Batman', 'Ação', '+14', 170, '2022-05-15',20),
(default, 'Procurando Dory', 'Animação', 'Livre', 120, '2022-05-16',20),
(default, 'Doutor Estranho', 'Ação, Aventura', '+12', 170, '2022-05-20',200),
(default, 'Minha Mãe é uma Peça 3', 'Comédia', '+12', 110, '2022-05-25',20),
(default, 'Jujutsu Kaisen', 'Animação Japonesa', '+14', 100, '2022-05-21',23);

select * from funcionario;

INSERT INTO `funcionario` VALUES (5,'funcionario','ana maria','123456','11-93786282','av brasil','vendedora');
INSERT INTO `usuario` VALUES (11,'gerente','maria','123','gerente');
    