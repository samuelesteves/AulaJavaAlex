--create database trabalhoTaxonomia

create table usuario(
	codUsuario int primary key identity(1,1) not null
	,nome varchar(200) not null
	,cpf varchar(14) not null
	,area varchar(200) not null
)

create table seresVivos(
	codSeresVivos int primary key identity(1,1) not null
	,reino varchar(150) not null
	,filo varchar(150) not null
	,classe varchar(150) not null
	,ordem varchar(150) not null
	,familia varchar(150) not null
	,genero varchar(150) not null
	,especie varchar(150) not null
	,nomeComum varchar(150) not null
)

create table laboratorio(
	cod int primary key identity(1,1) not null
	,nome varchar(200) not null
	,cnpj varchar(200) not null
	,areaDePesquisa varchar(200) not null
	,telefone varchar(200) not null
)

create table endereco(
	codEndereco int primary key identity(1,1) not null
	,endereco varchar(250) not null
	,estado varchar(2) not null
	,numero int not null
	,bairro varchar(250) not null
	,cep varchar(9) not null
	,codLaboratorio int not null
	CONSTRAINT fk_laboratorio_endereco FOREIGN KEY (codLaboratorio) REFERENCES laboratorio (cod)
)
