-- create database db_RH2;
-- create table tb_funcionarios
 -- (
-- 	id bigint(20) auto_increment,
-- 	nome varchar(20) not null,
-- 	salario decimal(20,2),
--   PCD boolean,
--   ativo boolean,  
--   cargo_id bigint not NULL,
-- 	primary key(id),
--    foreign key (cargo_id) references tb_cargo (id)
-- )

-- insert into tb_cargo(nome, PCD, ativo) Values ("CEO", true, true);
-- insert into tb_cargo(nome, PCD, ativo) Values ("Representante", true, true);
-- insert into tb_cargo(nome, PCD, ativo) Values ("Vendedor", true, false);
-- insert into tb_cargo(nome, PCD, ativo) Values ("Cozinheiro", false, true);
-- insert into tb_cargo(nome, PCD, ativo) Values ("Estagiário", false, false);

-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("José", 1500, true, true, 5);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Maria", 2000, true, false, 4);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Eduardo", 3000, true, true, 3);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Ruan", 4000, true, false, 2);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Salvio", 5000, true, true, 2); 
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Ronaldo", 1000, true, true, 5);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Romário", 1200, true, true, 4);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Ricardo", 1300, true, true, 3);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Sabrina", 15000, true, true, 1);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Suellen", 1535, true, true, 5);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Simone", 1589, true, true, 4);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Sergio", 2000, true, true, 3);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Vitor", 3000, true, true, 2);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Wagner", 4000, true, true, 2);
-- insert into tb_funcionarios(nome, salario, PCD, ativo, cargo_id) Values ("Josias", 6000, true, true, 5);

-- select * from tb_funcionarios where salario > 2000;
-- select * from tb_funcionarios where salario > 1000 and salario < 2000;
-- select * from tb_funcionarios where nome like "%C%";
-- select * from tb_funcionarios
-- 	inner join tb_cargo on tb_cargo.id = tb_funcionarios.cargo_id
-- select * from tb_funcionarios
--  	inner join tb_cargo on tb_cargo.id = tb_funcionarios.cargo_id
--    where tb_cargo.id = 5



