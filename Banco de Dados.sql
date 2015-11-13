drop database if exists biblioteca;

create database IF not exists biblioteca;

use biblioteca;

create table if not exists admin(
	id_admin integer primary key auto_increment,
	nome varchar(30),
	senha varchar(6)
);

create table if not exists volume(
	id_volume integer primary key auto_increment,
	autor varchar(70),
	descricao varchar(255),
	tipovol varchar(20),
	num_paginas integer,
	ano integer,
	editora varchar (30),
    titulo varchar (30)
);

