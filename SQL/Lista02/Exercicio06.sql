create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
Nome varchar(255) not null,
descricao varchar(255) not null,
PossuiCertificado boolean not null,
primary key(id)
);

create table tb_curso (
id bigint auto_increment,
Nome varchar(255) not null,
Preco float not null,
Duracao varchar(255) not null,
Nivel varchar(255) not null,
Categoria_id bigint,
primary key(id),
foreign key(Categoria_id) references tb_categoria (id)
);

insert into tb_categoria (Nome,descricao, PossuiCertificado) values 
("ingles"," curso de ingles", true),
("Design","curso de design", true),
("computação","curso de computação", false),
("engenharia","curso de engenharia", true),
("quimica","curso de quimica", false);

insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values 
("ingles fluente 2.0", 500, "80 horas", "Avançado", 1),
("ingles empreendedor 1", 50, "40 horas", "Intermediário", 1),
("desenho shoe", 2, "20 horas", "Iniciante", 2),
("web bonito", 100, "16 horas", "Intermediário", 2),
("pacote office", 55, "30 horas", "Avançado", 3),
("engenharia de transporte", 1000, "25 horas", "Intermediário", 4),
("engenharia de automação", 50, "30 horas", "Avançado", 4),
("fundamentos da quimica", 30, "20 horas", "Iniciante", 5);


SELECT Nome, Preco FROM tb_curso where Preco > 50;
SELECT Nome, Preco FROM tb_curso where Preco Between 3 AND 60;

SELECT Nome from tb_curso Where Nome LIKE "%j%";

select * from tb_curso 
inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso where categoria_id = 3;