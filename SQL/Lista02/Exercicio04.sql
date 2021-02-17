create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(255),
    descricao varchar(255),
    primary key(id)
);

create table tb_produto(
	id bigint auto_increment,
    nome varchar(255),
    valor float,
    peso float,
    categoria_id bigint,
    primary key(id),
    constraint tb_categoria foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (nome, descricao) values 
("Bovina", "Bois, vitelo"), 
("Suina", "porco, leitão"),
("frango", "aves"),
("Embutidos", "mistura"),
("Outros", "Tudo que não está descrito nas outras opções");

insert into tb_produto (nome, valor, peso, categoria_id) values 
("picanha", 80, 1, 1),
("costela", 30, 1, 2),
("peito", 8, 1, 3),
("mortadela", 5, 1, 4),
("fosforo", 3, 1, 5),
("alcool", 15, 1, 5),
("fraldinha", 60, 1, 1),
("lombo", 50, 1, 2);

select * from tb_produto where valor > 50;
select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where categoria_id = 3;