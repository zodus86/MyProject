CREATE SEQUENCE IF NOT EXISTS hibernate_sequence start 1000 increment 1;



CREATE TABLE IF NOT EXISTS cashbox
(
    id serial PRIMARY KEY ,
    date date NOT NULL ,
    text varchar(500) NOT NULL,
    sum numeric(12,2) NOT NULL,
    type_of_operation varchar(50) NOT NULL
);


create table IF NOT EXISTS  users
(
    id serial,
    username varchar(255) not null,
    password varchar(255) not null,
    status varchar(50) not null,
    role varchar(20)
);