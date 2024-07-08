create table if not exists nordpool_api.city (
    id serial primary key not null,
    country_id varchar references nordpool_api.country(id),
    name varchar not null
);

create sequence if not exists nordpool_api.city_seq increment by 1 start with 1;