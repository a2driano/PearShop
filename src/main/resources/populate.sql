-- CREATE TABLE product (
--   id  int (20) NOT NULL,
--   article  int (20) NOT NULL,
--   category VARCHAR(25),
--   name VARCHAR(25),
--   description VARCHAR(500),
--   screen VARCHAR(25),
--   memory  int (10) NOT NULL,
--   communicator VARCHAR(20),
--   color VARCHAR(20),
--   camera int (20),
--   price int (20),
--   quantity int (20)
-- );


INSERT INTO product (id, article, category, name, description, screen, memory, communicator, color
  , camera, price, quantity) VALUES (
  1
  , 100001
  , 'ipad'
  , 'Apple iPad Air 2 Wi-Fi 16GB Space Gray'
  ,
  'Экран 9.7" Retina (2048 x 1536 точек) с IPS-матрицей/ 16 млн. цветов / Apple A8X / камера 8 Мп + фронтальная 1.2 Мп / Bluetooth 4.0 / Wi-Fi 802.11 a/b/g/n/ac / 16 ГБ встроенной памяти / iOS 8.1 / 240 x 169.5 x 6.1 мм, 437 г / серый космос'
  , 9.7
  , 16
  , 'wi-fi'
  , 'space gray'
  , 8
  , 10713.00
  , 12);

-- INSERT INTO order (id, firstname, lastname, email, phone, description, date, status) VALUES (
--   1
--   , 'Антон'
--   , 'Шевченко'
--   , 'antoha1989@gmail.com'
--   , '380991568745'
--   , '+доставка по адресу: дом Пушкина, ул. Колотушкина'
--   , '01 Jan 2016'
--   , 'completed');

-- 	INSERT INTO product (name, code, title, description, manufacturer, category, price, stock) VALUES (
--     'dolomite'
-- 	, 'EV207286'
-- 	, 'Pinnacle Dolomite'
-- 	, 'The Pinnacle Dolomite is our fast road bike designed for UK road conditions'
-- 	, 'Pinnacle'
-- 	, 'bikes'
-- 	, 417
-- 	, 7);
