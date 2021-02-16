CREATE TABLE `tb_usuario` (
	`id_usuario` INT NOT NULL AUTO_INCREMENT,
	`nome_completo` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	`categoria_usuario` BOOLEAN NOT NULL,
	`imagem_usuario` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `tb_postagem` (
	`id_postagem` INT NOT NULL AUTO_INCREMENT,
	`descricao` TEXT NOT NULL,
	`imagem_postagem` VARCHAR(255) NOT NULL,
	`data_conclusão` DATE NOT NULL,
	`data_postagem` DATE NOT NULL,
	`fk_usuario` INT NOT NULL,
	`fk_tema` INT NOT NULL,
	PRIMARY KEY (`id_postagem`)
);

CREATE TABLE `tb_tema` (
	`id_tema` INT NOT NULL AUTO_INCREMENT,
	`categoria` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`tipo_ajuda` varchar(255) NOT NULL,
	PRIMARY KEY (`id_tema`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`fk_usuario`) REFERENCES `tb_usuario`(`id_usuario`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`fk_tema`) REFERENCES `tb_tema`(`id_tema`);

