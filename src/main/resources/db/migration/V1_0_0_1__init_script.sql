CREATE SEQUENCE IF NOT EXISTS hibernate_sequence start 1000 increment 1;



CREATE TABLE IF NOT EXISTS Counterparty
(
    id serial PRIMARY KEY ,
    name varchar(255) NOT NULL,
    phone_number varchar(255) NOT NULL
);


CREATE TABLE IF NOT EXISTS Cashbox
(
    id         serial PRIMARY KEY,
    counterparty_id    int8,
    data    date          NOT NULL,
    cost    integer       NOT NULL,
    text    varchar(255) NOT NULL,
    FOREIGN KEY (counterparty_id) REFERENCES Counterparty (id)
);

