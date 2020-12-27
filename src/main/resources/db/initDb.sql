DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS admins;
DROP TABLE IF EXISTS menus;
DROP TABLE IF EXISTS dishes;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1000000;

CREATE TABLE admins
(
    id    INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name  VARCHAR NOT NULL,
    email VARCHAR NOT NULL
);
CREATE UNIQUE INDEX admins_unique_email_idx ON admins (email);

CREATE TABLE users
(
    id            INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name          VARCHAR NOT NULL,
    email         VARCHAR NOT NULL,
    voteTime      TIMESTAMP           DEFAULT null,
    restaurant_id INTEGER             DEFAULT null
);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE restaurants
(
    restaurant_id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    admin_id      INTEGER NOT NULL,
    menu_id       INTEGER NOT NULL,
    users INTEGER[]
);

CREATE TABLE dishes
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR NOT NULL ,
    price FLOAT NOT NULL
);

CREATE TABLE menus
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    menus INTEGER[]
);