--liquibase formatted sql

--changeset liquibase-service:create tables

create table if not exists owners
(
    id            bigserial primary key,
    first_name varchar(50) not null ,
    last_name varchar(50) ,
    passport_number varchar(55) not null unique ,
    email varchar(50) unique ,
    phone_number varchar(30) unique
);

create table if not exists cars
(
    id            bigserial primary key,
    make          varchar(55) not null,
    model          varchar(55) not null,
    year_of_issue int         not null,
    power         int         not null,
    fuel_type     varchar(30) not null,
    owner_id bigint ,
    foreign key (owner_id) references owners (id)
);