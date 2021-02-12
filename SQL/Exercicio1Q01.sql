-- cria um banco de dados
create database db_servico_rh;

-- acessa o banco de dados
use db_servico_rh;

-- cria tabela
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
funcao varchar(100) not null,
setor varchar(100) not null,
ativo boolean,
primary key (id)
);

-- busca das informa da tabela funcionarios
select * from tb_funcionarios;

-- cadastra dados na tabela
insert into tb_funcionarios (nome,idade,salario,funcao,setor,ativo) values ("Athos",26,3000,"Dev.Jr","Banco de Dados",true),
("Martha",30,1500,"Dev.Jr","Frontend",true),
("Julius",27,3000,"Dev.Pleno","Backend",true),
("Rafaela",28,1500,"Dev.Jr","Backend",true),
("Jessica",29,6000,"Dev.senior","Banco de Dados",true);

-- exibe com dados a partir de um filtro
select nome, salario from tb_funcionarios where salario > 2000;
select nome, salario from tb_funcionarios where salario < 2000;

-- altera um dado na tabela
update tb_funcionarios set salario = 20000 where id = 1;
