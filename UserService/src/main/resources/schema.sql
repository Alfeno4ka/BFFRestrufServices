create schema if not exists bff_restful_services;

create table if not exists bff_restful_services.dat_users(
    id uuid not null primary key,
    first_name varchar not null,
    last_name varchar not null,
    middle_name varchar,
    email varchar not null,
    phone varchar not null,
    delivery_address varchar not null
);