use db_TAUBERPANQUECAS;
create table tb_PAOPAOZIN(
ID bigint auto_increment,
Nome varchar(30),
description varchar(255),
Disponivel boolean,
Valor decimal(10,2),
primary key(ID));
alter table tb_paopaozin
modify column description varchar(255);

use db_TAUBERPANQUECAS;
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pão de centeio", "Uma das farinhas mais utilizadas para fazer pães é a de centeio.", false, 0.5);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Australliano", "A massa escura, macia e adocicada desse pão tão popular leva melado de cana e cacau. Para deixar a casca com essa aparência rústica, vai uma polvilhada de fubá antes de assar.", false, 0.4);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Brioche", " É comumente moldado com duas bolas de massa, sendo que a maior serve de base para a menor.", true, 0.300);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pão preto", "Feito com sementes de abóbora, girassol, linhaça, gergelim e farinha de centeio e/ou de trigo. É um pão levemente adocicado.", false, 150);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pão alentejano", "Ele é preparado com farinha de trigo e massa lêveda e deve ser assado em forno a lenha. A utilização de sêmola de trigo é opcional e garante ao pão uma textura mais firme.", false, 0.5);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Ciabatta", "A massa da ciabatta é mole e, depois de assada, o pão possui crosta fina e miolo úmido. É feita, geralmente, com farinha de trigo.", true, 0.5);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pao com sementes", "Elaborados com 7, 9 e até 12 tipos de grãos diferentes, esses pães são ricos em fibras.", true, 0.5);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Hallula", "O hallula leva leite e manteiga em sua receita", false, 0.7);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pao de ouro", "Este é o carro chefe da casa, nosso pão fermentado com ouro e com crosta banhada a ouro tem um maravilhoso sabor e textura porosa, apenas para os mais excêntricos", true, 2775);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("O PAO DO TAUBER", "Elaborado com água, farinha de ouro refinada, fermento de diamante em pó, sal de petroleo, sangue rejuvelhecido de um lendario cervo que vive apenas no pico do evertest; é um pão de massa mais pesada e menor umidade. Assim como o pão alentejano, também possui uma textura mais firme.", true, 3975);
 insert into tb_paopaozin (Nome, description, Disponivel, Valor) values ("Pão Francês", "O Tradicional pão que não pode faltar nas mesas brasileitas.", true, 0.1);
 
 use db_TAUBERPANQUECAS;
create table tb_tipo_bolo(
	id bigint auto_increment,
	descricao varchar(35) not null,
    	validade date,
	disponivel boolean,
    	valor decimal (10,2),
	primary key(id)
);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Cenoura com cobertura", "2020-12-05", 1, 15.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Leite", "2020-12-05", 1, 10.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Brigadeiro", "2020-12-07", 1, 25.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Formigueiro", "2020-12-05", 1, 12.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Fubá", "2020-12-04", 1, 12.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Milho", "2020-12-04", 1, 15.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Laranja", "2020-12-05", 1, 12.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo de Banana", "2020-12-05", 1, 20.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Vulcão de chocolate", "2020-12-07", 1, 45.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Vulcão de leite ninho", "2020-12-07", 1, 45.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Vegano", "2020-12-08", 1, 45.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Naked Cake de morango", "2020-12-06", 1, 35.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Cupcake - 3 unidades", "2020-12-06", 1, 12.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Feliz Aniversário", "2020-12-07", 1, 40.00);
insert into tb_tipo_bolo(descricao, validade, disponivel, valor) values ("Bolo Kit Kat", "2020-12-08", 1, 70.00);

create table tb_bebida(
	id bigint auto_increment,
    descricao varchar (60),
	disponivel boolean,
    valor decimal (10,2),
	primary key (id)
);
insert into tb_bebida (descricao, disponivel, valor) values ("Café Coado", true, 2.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Café Simples", true, 2.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Café Expresso", true, 3.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Café Expresso Duplo", true, 5.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Capuccino", true, 4.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Pingado", true, 3.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Chá Mate", true, 3.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Chocolate Quente", true, 5.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Frapê de Capuccino", true, 9.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Soda Italiana", true, 8.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Vitamina Tradicional", true, 8.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Suco Detox", true, 7.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Suco Cura Ressaca", true, 7.00);
insert into tb_bebida (descricao, disponivel, valor) values ("Suco de Laranja Natural", true, 7.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Suco de Polpa Maracujá", true, 6.50);
insert into tb_bebida (descricao, disponivel, valor) values ("Suco de Polpa Morango", true, 6.50);

------------------------------------------------------------------------------------------------------

use db_TAUBERPANQUECAS;
create table tb_clientes
  (
	id bigint(20) auto_increment,
	nome varchar(20) not null,
	cpf char(11),
	celular char(12),
	ende varchar(255),
	numero int,
    cep char(8),
	primary key(id)
);
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Joseph","82367181784","023788092104","554-318 Donec Av.",246,"91598480");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Ayanna","54106913389","030629975611","P.O. Box 578, 5946 Egestas Street",252,"46195526");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Dana","79536098468","011081019689","P.O. Box 301, 7248 Eu, St.",767,"99010099");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Regina","01116214789","078892491258","9692 Dolor, Rd.",80,"41232960");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Scarlet","57450728677","038548580186","189-4564 Et St.",480,"07834563");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Emerson","35983655295","056130264906","P.O. Box 761, 6602 Id St.",202,"64157455");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Reagan","60930426368","057022617164","P.O. Box 263, 3780 Fringilla Ave",536,"75614267");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Denise","33016196684","099205429075","801-3543 Sem, St.",481,"19835656");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Rafael","10564488506","073709320767","P.O. Box 116, 5567 Orci Ave",730,"10306731");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Morgan","54709336018","032288317548","364-4712 Sed St.",639,"40614442");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Philip","73616719372","092585905346","160-6473 Nulla Avenue",386,"90873192");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Baker","94931903048","055282378502","119 Est Road",152,"88706828");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Teagan","33485949190","062390751244","Ap #206-5485 Tempor St.",689,"07322796");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Ryan","54973462837","025525719467","880-1177 Non Rd.",835,"07321588");
INSERT INTO tb_clientes(nome,cpf,celular,ende,numero,cep) VALUES ("Tanek","66434136959","033469429809","Ap #333-8609 Mollis Av.",337,"86931645");

----------------------------------------------------------------------------------------------------------------------------------------------------------------

use db_TAUBERPANQUECAS;
create table tb_forma_pag
(
	id bigint auto_increment,
    metodo varchar(30),
    primary key(id)
);
    insert into tb_forma_pag(metodo) values ("Cartão Débito");
insert into tb_forma_pag(metodo) values ("Cartão Crédito");
insert into tb_forma_pag(metodo) values ("Dinheiro");
insert into tb_forma_pag(metodo) values ("Cheque");
insert into tb_forma_pag(metodo) values ("Paypal");
insert into tb_forma_pag(metodo) values ("Boleto");
insert into tb_forma_pag(metodo) values ("Pix");
insert into tb_forma_pag(metodo) values ("Transferência");

---------------------------------------------------------------

use db_tauberpanquecas;
create table tb_comanda(
ID bigint auto_increment,
tipo_pao_id bigint,
tipo_bolo_id bigint,
tipo_bebida_id bigint,
cliente_id bigint,
forma_pag_id bigint,
primary key (ID),
 foreign key (tipo_pao_id) references tb_paopaozin (ID),
 foreign key (tipo_bolo_id) references tb_tipo_bolo (id),
 foreign key (tipo_bebida_id) references tb_bebida (id),
 foreign key (cliente_id) references tb_clientes (id),
 foreign key (forma_pag_id) references tb_forma_pag (id)
);

------------------------------------------------------------------

insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (9,13,15,14,4);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (8,1,6,9,6);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (9,10,8,11,6);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (4,6,8,11,2);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (8,5,4,15,3);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (8,11,9,12,4);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (8,13,10,2,3);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (5,3,7,2,4);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (4,7,4,4,8);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (3,3,1,1,5);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (9,12,7,14,7);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (5,11,6,12,5);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (4,9,4,9,4);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (3,10,12,5,5);
insert into tb_comanda (tipo_pao_id, tipo_bolo_id, tipo_bebida_id,
cliente_id, forma_pag_id) values (7,3,6,1,8);

--------------------------------------------------------------------

select tb_paopaozin.nome, tb_paopaozin.Valor, tb_tipo_bolo.descricao, tb_tipo_bolo.valor, tb_bebida.descricao, tb_bebida.valor, tb_clientes.nome, tb_forma_pag.metodo from (((((tb_comanda 
inner join tb_paopaozin on tb_paopaozin.ID = tb_comanda.tipo_pao_id)
inner join tb_tipo_bolo on tb_tipo_bolo.id = tb_comanda.tipo_bolo_id)
inner join tb_bebida on tb_bebida.id = tb_comanda.tipo_bebida_id)
inner join tb_clientes on tb_clientes.id = tb_comanda.cliente_id)
inner join tb_forma_pag on tb_forma_pag.id = tb_comanda.forma_pag_id);

