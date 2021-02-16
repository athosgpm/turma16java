create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id_categoria int auto_increment primary key,
tamanho varchar(20) not null,
doce boolean not null,
viagem boolean not null
);

create table tb_pizza(
id_personagem int auto_increment primary key,
fk_categoria int,
nome varchar(20) not null,
preco int not null,
saborBorda varchar(20) not null,
tempo int not null,
cozinheiro varchar(20) not null,
foreign key (fk_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (tamanho,doce,viagem) values 
("Grande",false,true),
("Media",true,false),
("pequena",false,true),
("grande",true,false),
("media",false,true);

insert into tb_pizza (fk_categoria,nome,preco,saborBorda,tempo,cozinheiro) values 
(1,"mussarela",50,"cheddar",50,"paulo"),
(2,"brigadeiro",50,"sem sabor",30,"lucas"),
(3,"calabresa",90,"catupiry",10,"antonia"),
(4,"nutela",90,"brigadeiro",30,"maria"),
(5,"nordestina",20,"cheddar",10,"renato"),
(1,"churrasco",20,"sem sabor",40,"pedro"),
(2,"morango",35,"sem sabor",20,"cintia"),
(3,"portugueza",35,"catupiry",10,"beatriz");

select nome,preco from tb_pizza where preco > 45;
select nome,preco from tb_pizza where preco between 29 and 60;

select * from tb_pizza where nome like "%C%";

select * from tb_pizza inner join tb_categoria 
on tb_categoria.id_categoria = tb_pizza.fk_categoria;

select nome,preco,saborBorda,tempo,cozinheiro,tb_categoria.doce from tb_pizza 
inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.fk_categoria 
and tb_categoria.doce = true;



