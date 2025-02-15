create table if not exists nordpool_api.price (
    id serial primary key not null,
    city_id integer references nordpool_api.city(id),
    price_raw real not null,
    currency_id varchar references nordpool_api.currency(id),
    timestamp timestamptz
);

create sequence if not exists nordpool_api.price_seq increment by 1 start with 1;