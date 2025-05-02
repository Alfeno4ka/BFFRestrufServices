create schema if not exists bff_restful_services;

create table if not exists bff_restful_services.dat_orders
(
    id uuid not null primary key,
    user_id uuid not null,
    amount numeric(8, 2) not null,
    currency varchar(3) not null
);

create table if not exists bff_restful_services.dat_order_entries
(
    id            uuid not null primary key,
    order_id      uuid not null references bff_restful_services.dat_orders (id),
    position_number integer not null default 1,
    position_name varchar not null ,
    position_quantity  integer
)