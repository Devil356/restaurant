DELETE
FROM dishes;
DELETE
FROM menus;
DELETE
FROM restaurants;
DELETE
FROM users;
DELETE
FROM votes;
ALTER SEQUENCE users_seq RESTART WITH 100000;
ALTER SEQUENCE restaurants_seq RESTART WITH 100000;
ALTER SEQUENCE dishes_seq RESTART WITH 100000;
ALTER SEQUENCE menus_seq RESTART WITH 100000;

INSERT INTO dishes (name, price)
VALUES ('Fish', 100.0),
       ('Meat', 585.0),
       ('Milk', 10.9),
       ('Soap', 45.0),
       ('Steak', 434.5);

INSERT INTO users (name, email)
VALUES ('Admin1', 'admin1@gmail.com'),
       ('Admin2', 'admin2@gmail.com'),
       ('User1', 'user1@yandex.ru'),
       ('User2', 'user2@yandex.ru'),
       ('User3', 'user3@yandex.ru'),
       ('User4', 'user4@yandex.ru');

INSERT INTO user_roles (user_id, role)
VALUES (100000, 'ADMIN'),
       (100001, 'ADMIN'),
       (100002, 'USER'),
       (100003, 'USER'),
       (100004, 'USER'),
       (100005, 'USER');

INSERT INTO restaurants ()