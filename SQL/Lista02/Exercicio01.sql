create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id_classe int auto_increment primary key,
classe varchar(20) not null,
raca varchar(20) not null,
corBandeira varchar(20) not null
);

create table tb_personagem(
id_personagem int auto_increment primary key,
fk_classe int,
nome varchar(20) not null,
ataque int not null,
defesa int not null,
vida int not null,
mana int not null,
foreign key (fk_classe) references tb_classe (id_classe)
);

insert into tb_classe (classe,raca,corBandeira) values 
("templaria","humana","azul"),
("arqueira","elfa","verde"),
("assassina","humana","roxo"),
("guerreira","anã","vermelho"),
("maga","humana","rosa");

insert into tb_personagem (fk_classe,nome,ataque,defesa,vida,mana) values 
(1,"athos",1500,5000,5000,1000),
(2,"katatau",3000,1500,3000,3000),
(3,"yoda",4000,1500,1000,4000),
(4,"chaves",2000,3000,3000,500),
(5,"alice",5000,1500,1000,5000),
(1,"cat",1000,4000,4000,500),
(2,"coiote",2000,1500,2000,2000),
(3,"soled",5000,1500,1000,3000);

select nome,ataque from tb_personagem where ataque > 2000;
select nome,defesa from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "%C%";

select * from tb_personagem 
inner join tb_classe on tb_classe.id_classe = tb_personagem.fk_classe;

select nome,ataque,defesa,vida,mana,tb_classe.classe from tb_personagem 
inner join tb_classe on tb_classe.id_classe = tb_personagem.fk_classe 
and tb_classe.classe = "templaria";



