DROP TABLE IF EXISTS restaurant;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS menu;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1000_000;

CREATE TABLE user
(
id
name

);

CREATE TABLE restaurant
(
id
user_id


);

CREATE TABLE user_role
(
user_id
role
);

CREATE TABLE menu
(
restaurant_id
);