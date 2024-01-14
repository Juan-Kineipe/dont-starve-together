CREATE DATABASE dont_starve_together;
USE dont_starve_together;

CREATE TABLE survivor (
    id int primary key auto_increment,
    name varchar(30) NOT NULL,
    title varchar(30) NOT NULL,
    description varchar(255) NOT NULL,
    motto varchar(255) NOT NULL,
    icon varchar(255) NOT NULL,
    portrait varchar(255) NOT NULL,
    birthday varchar(30) NOT NULL,
    favorite_food varchar(30) NOT NULL,
    odds_of_survival ENUM('Slim','Grim','None') NOT NULL,
    health int NOT NULL,
    hunger int NOT NULL,
    sanity int NOT NULL

);

CREATE TABLE survivor_perks (
    id int primary key auto_increment,
    survivor_id int REFERENCES survivor(id),
    description varchar(255) NOT NULL
);

CREATE TABLE survivor_skins (
    id int primary key auto_increment,
    survivor_id int REFERENCES survivor(id),
    name varchar(30) NOT NULL,
    collection varchar(30) NOT NULL,
    description varchar(255) NOT NULL,
    motto varchar(255) NOT NULL
);