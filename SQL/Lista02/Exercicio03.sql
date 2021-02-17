create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id_categoria int auto_increment primary key,
doces boolean not null,
remedio boolean not null,
cosmetico boolean not null
);

create table tb_produto(
id_produto int auto_increment primary key,
fk_categoria int,
nome varchar(20) not null,
preco int not null,
validade date not null,
qtEstoque int not null,
ativo boolean not null,
foreign key (fk_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (doces,remedio,cosmetico) values 
(false,false,true),
(false,true,false),
(true,false,false),
(false,true,false),
(false,false,true);

insert into tb_produto (fk_categoria,nome,preco,validade,qtEstoque,ativo) values 
(1,"hidratante",70,20300101,50,true),
(2,"doril",5,20300101,30,true),
(3,"mentos",2,20300101,10,true),
(4,"benegripe",9,20300101,30,true),
(5,"gel",90,20300101,10,true),
(1,"creme",20,20300101,5,true),
(2,"vitaminaD",100,20300101,10,true),
(3,"chocolate",3,20300101,9,true);

select nome,preco from tb_produto where preco > 50;
select nome,preco from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria 
on tb_categoria.id_categoria = tb_produto.fk_categoria;

select nome,preco,validade,qtEstoque,ativo,tb_categoria.cosmetico from tb_produto
inner join tb_categoria on tb_categoria.id_categoria = tb_produto.fk_categoria 
and tb_categoria.cosmetico = true;



