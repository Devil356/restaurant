DELETE
FROM user_roles;
DELETE
FROM votes;
DELETE
FROM menus_dishes;
DELETE
FROM menus;
DELETE
FROM restaurants;
DELETE
FROM users;
ALTER SEQUENCE users_seq RESTART WITH 100000;
ALTER SEQUENCE restaurants_seq RESTART WITH 100000;
ALTER SEQUENCE dishes_seq RESTART WITH 100000;
ALTER SEQUENCE menus_seq RESTART WITH 100000;
-- ALTER SEQUENCE menus_dishes_seq RESTART WITH 100000;

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

INSERT INTO restaurants(name, admin_id)
VALUES ('First restaurant', 100000),
       ('Second restaurant', 100000),
       ('Third restaurant', 100001);

INSERT INTO menus (restaurant_id)
VALUES (100000),
       (100001),
       (100002);

INSERT INTO dishes (name, price)
VALUES ('Fish', 100.0),
       ('Meat', 585.0),
       ('Milk', 10.9),
       ('Soap', 45.0),
       ('Steak', 434.5);

INSERT INTO menus_dishes (menu_id, dish_id)
VALUES (100000, 100000),
       (100000, 100001),
       (100000, 100002),
       (100000, 100003),

       (100001, 100001),
       (100001, 100002),
       (100001, 100003),
       (100001, 100004),
       (100001, 100000),

       (100002, 100003),
       (100002, 100001),
       (100002, 100002);

--        (100003, 100000),
--        (100003, 100001),
--        (100003, 100004),
--        (100003, 100003);

INSERT INTO votes (user_id, vote_time, restaurant_id)
VALUES (100002, '2020-12-31 13:00:00', 100000),
       (100003, '2020-12-31 10:00:00', 100001),
       (100004, '2020-12-31 14:00:00', 100002),
       (100005, '2020-12-31 15:00:00', 100001);