DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS votes;
DROP TABLE IF EXISTS menus_dishes;
DROP TABLE IF EXISTS dishes;
DROP TABLE IF EXISTS restaurants_menus;
DROP TABLE IF EXISTS menus;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS users_seq;
DROP SEQUENCE IF EXISTS restaurants_seq;
DROP SEQUENCE IF EXISTS dishes_seq;
DROP SEQUENCE IF EXISTS menus_seq;
DROP SEQUENCE IF EXISTS votes_seq;

CREATE SEQUENCE users_seq START WITH 100000;
CREATE SEQUENCE restaurants_seq START WITH 100000;
CREATE SEQUENCE dishes_seq START WITH 100000;
CREATE SEQUENCE menus_seq START WITH 100000;
CREATE SEQUENCE votes_seq START WITH 100000;

CREATE TABLE users
(
    id    INTEGER PRIMARY KEY DEFAULT nextval('users_seq'),
    name  VARCHAR NOT NULL,
    email VARCHAR NOT NULL
);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE user_roles
(
    user_id INTEGER PRIMARY KEY NOT NULL,
    role    VARCHAR,
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE restaurants
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('restaurants_seq'),
    name     VARCHAR NOT NULL,
    admin_id INTEGER NOT NULL,
    FOREIGN KEY (admin_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE menus
(
    id      INTEGER PRIMARY KEY DEFAULT nextval('menus_seq'),
    created TIMESTAMP           DEFAULT now()
);
CREATE TABLE restaurants_menus
(
    menu_id       INTEGER REFERENCES menus (id) ON DELETE CASCADE,
    restaurant_id INTEGER REFERENCES restaurants (id) ON DELETE CASCADE,
    PRIMARY KEY (menu_id, restaurant_id)
);


CREATE TABLE dishes
(
    id    INTEGER PRIMARY KEY DEFAULT nextval('dishes_seq'),
    name  VARCHAR NOT NULL,
    price FLOAT   NOT NULL
);

CREATE TABLE menus_dishes
(
    menu_id INTEGER REFERENCES menus (id)  NOT NULL,
    dish_id INTEGER REFERENCES dishes (id) NOT NULL,
    PRIMARY KEY (menu_id, dish_id)
);

CREATE TABLE votes
(
    id            INTEGER PRIMARY KEY DEFAULT nextval('votes_seq'),
    user_id       INTEGER                           NOT NULL,
    vote_time     TIMESTAMP           DEFAULT now() NOT NULL,
    restaurant_id INTEGER                           NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants (id) ON DELETE CASCADE
);

