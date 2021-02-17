create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

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
    descricao varchar(255),
    categoria_id bigint,
    primary key(id),
    constraint tb_categoria foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (nome, descricao) values 
("Elétrica", "parte eletrica"),
("Hidraulica", "parte hidraulica"),
("Construção", "parte de construção"),
("tinta", "parte de tinta"),
("decoração", "parte de decoração");

insert into tb_produto (nome, valor, descricao, categoria_id) values 
("tomada", 5, "tomada modelo novo", 1),
("argamassa", 70, "argamassa da boa", 3),
("tinta azul", 40, "azul marinho", 4),
("bocal", 2, "bocal pra lampada", 1),
("tijolo", 5, "tijolo do bom", 3),
("grama", 55, "grama artificial", 5),
("cascalho", 1000, "um caminhão de cascalho", 3),
("tinta vermelha", 30, "vermelho mesmo", 4);


select * from tb_produto where valor > 50;
select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where categoria_id = 3;