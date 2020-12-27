DROP TABLE IF EXISTS restaurant;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS menu;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1000_000;

CREATE TABLE users
(
id
name
isVoted
voteTime
restaurantId
);

CREATE TABLE restaurants
(
id
admin
menu
users
user_id


);

CREATE TABLE user_roles
(
user_id
role
);

CREATE TABLE menus
(
restaurant_id
);