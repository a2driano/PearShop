create table product (
  product_id integer not null,
  article VARCHAR(25) not null,
  camera double,
  category varchar(25) not null,
  color varchar(20),
  communicator varchar(20),
  count integer,
  description varchar(500),
  memory integer,
  name varchar(255) not null,
  price double,
  quantity integer not null,
  screen double,
  primary key (product_id)
);
create table userorder (
  order_id integer not null,
  date date,
  description varchar(500),
  email varchar(100) not null,
  firstname varchar(100) not null,
  lastname varchar(100) not null,
  phone integer not null,
  status varchar(25),
  product_id integer,
  primary key (order_id)
);
alter table product
add constraint UK_tqchd79ivu9bmv4gnkvs5yth1 unique (article);
alter table userorder
add constraint FKqmq02pyieanrditflagwx4f1p
foreign key (product_id)
references product





-- CREATE TABLE PRODUCT (
--   product_id  int (20) NOT NULL,
--   article  int (20) NOT NULL,
--   category VARCHAR(25),
--   name VARCHAR(255),
--   description VARCHAR(500),
--   screen VARCHAR(25),
--   memory  int (10) NOT NULL,
--   communicator VARCHAR(20),
--   color VARCHAR(20),
--   camera int (20),
--   price int (20),
--   quantity int (20)
-- );
-- INSERT INTO product (product_id, article, category, name, description, screen, memory, communicator, color
--   , camera, price, quantity) VALUES (
--   1
--   , 100001
--   , 'ipad'
--   , 'Apple iPad Air 2 Wi-Fi 16GB Space Gray'
--   ,
--   'Экран 9.7" Retina (2048 x 1536 точек) с IPS-матрицей/ 16 млн. цветов / Apple A8X / камера 8 Мп + фронтальная 1.2 Мп / Bluetooth 4.0 / Wi-Fi 802.11 a/b/g/n/ac / 16 ГБ встроенной памяти / iOS 8.1 / 240 x 169.5 x 6.1 мм, 437 г / серый космос'
--   , 9.7
--   , 16
--   , 'wi-fi'
--   , 'space gray'
--   , 8
--   , 10713.00
--   , 12);
--
-- INSERT INTO product (product_id, article, category, name, description, screen, memory, communicator, color
--   , camera, price, quantity) VALUES (
--   2
--   , 100001
--   , 'ipad'
--   , 'Apple iPad 4'
--   ,
--   'Экран 9.7" Retina (2048 x 1536 точек) с IPS-матрицей/ 16 млн. цветов / Apple A8X / камера 8 Мп + фронтальная 1.2 Мп / Bluetooth 4.0 / Wi-Fi 802.11 a/b/g/n/ac / 16 ГБ встроенной памяти / iOS 8.1 / 240 x 169.5 x 6.1 мм, 437 г / серый космос'
--   , 9.7
--   , 16
--   , 'wi-fi'
--   , 'space gray'
--   , 8
--   , 10713.00
--   , 12);
