#drop database Beers;
create database Beers;
use Beers;
create table beer(
id int primary key auto_increment,
name varchar(255) unique,
tagline text,
first_brewed text,
description text,
image_url text,
ibu double
#food_pairing text
);
describe beer;
select*from beer;
