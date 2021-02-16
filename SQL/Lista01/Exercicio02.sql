-- cria um banco de dados
create database db_ecommerce;

-- acessa o banco de dados
use db_ecommerce;

-- cria tabela
create table tb_produtos(
id bigint auto_increment,
descricao varchar(255) not null,
preco float not null,
qtdEstoque int not null,
setor varchar(100) not null,
desconto float not null,
ativo boolean,
primary key (id)
);

-- busca das informa da tabela funcionarios
select * from tb_produtos;

-- cadastra dados na tabela
insert into tb_produtos (descricao,preco,qtdEstoque,setor,desconto,ativo) values ("computador",5000,50,"eletronicos",10,true),
("Celular x",1000,100,"eletronicos",5,true),
("remedio x",50,500,"saude",15,true),
("Arroz",7,100,"alimentos",20,true),
("doce x",4,200,"alimentos",0,true),
("Maquina de lavar",3000,10,"eletronicos",7,true),
("televisão",1000,100,"eletronicos",5,true),
("Camisa",100,30,"roupas",15,true);

-- exibe com dados a partir de um filtro
select descricao,preco from tb_produtos where preco > 500;
select descricao,preco from tb_produtos where preco < 500;

-- altera um dado na tabela
update tb_produtos set preco = 4000 where id = 1;