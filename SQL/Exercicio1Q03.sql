-- cria um banco de dados
create database db_escola;

-- acessa o banco de dados
use db_escola;

-- cria tabela
create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
curso varchar(255) not null,
nota int not null,
ativo boolean,
primary key (id)
);

-- busca das informa da tabela funcionarios
select * from tb_alunos;

-- cadastra dados na tabela
insert into tb_alunos (nome,idade,curso,nota,ativo) values ("Athos",26,"JAVA",8,true),
("Martha",24,"HTML",7,true),
("Julius",29,"CSS",5,true),
("Rafaela",28,"REACT",8,true),
("Jessica",23,"ANGULAR",9,true),
("Bia",26,"C",10,true),
("Matheus",27,"Python",6,true),
("lucas",22,"Dados",3,true);

-- exibe com dados a partir de um filtro
select nome,nota from tb_alunos where nota > 7;
select nome,nota from tb_alunos where nota < 7;

-- altera um dado na tabela
update tb_alunos set nota = 10 where id = 1;

-- insere nova coluna
-- alter table tb_funcionarios
-- add descricao varchar(255);

-- altera coluna
-- alter table tb_funcionarios change descricao descricao_funcionario varchar(255);

-- deleta uma linha
-- delete from tb_funcionarios where id=2