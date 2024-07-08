create table if not exists nordpool_api.currency (
    id varchar primary key not null,
    name varchar not null,
    symbol varchar not null,
    decimals integer not null
)