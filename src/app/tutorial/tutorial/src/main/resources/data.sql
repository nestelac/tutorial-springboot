INSERT INTO CATEGORY(id, name) VALUES (1, 'Eurogames');
INSERT INTO CATEGORY(id, name) VALUES (2, 'Ameritrash');
INSERT INTO CATEGORY(id, name) VALUES (3, 'Familiar');

INSERT INTO AUTHOR(id, name, nationality) VALUE (1, 'Alan R. Moon', 'US');
INSERT INTO AUTHOR(id, name, nationality) VALUE (2, 'Vital Lacerda', 'PT');
INSERT INTO AUTHOR(id, name, nationality) VALUE (3, 'Simone Luciani', 'IT');
INSERT INTO AUTHOR(id, name, nationality) VALUE (4, 'Perepau Llistosella', 'ES');
INSERT INTO AUTHOR(id, name, nationality) VALUE (5, 'Michael Kiesling', 'DE');
INSERT INTO AUTHOR(id, name, nationality) VALUE (6, 'Phil Walker-Harding', 'US');

INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (1, 'On Mars', '14', 1, 2);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (2, 'Aventureros al tren', '8', 3, 1);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (3, '1920: Wall Street', '12', 1, 4);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (4, 'Barrage', '14', 1, 3);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (5, 'Los viajes de Marco Polo', '12', 1, 3);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUE (6, 'Azul', '8', 3, 5);

INSERT  INTO CLIENTES(id, name) VALUE (1, 'Raul');
INSERT  INTO CLIENTES(id, name) VALUE (2, 'Jordi');
INSERT  INTO CLIENTES(id, name) VALUE (3, 'Nerea');
INSERT  INTO CLIENTES(id, name) VALUE (4, 'Noelia');
INSERT  INTO CLIENTES(id, name) VALUE (5, 'Ruben');
INSERT  INTO CLIENTES(id, name) VALUE (6, 'Alba');

INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (1, 'Game5', 'Raul', 1/1/1, 2/2/2);
INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (2, 'Game2', 'Jordi', 1/1/1, 2/2/2);
INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (3, 'Game1', 'Nerea', 1/1/1, 2/2/2);
INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (4, 'Game6', 'Noelia', 1/1/1, 2/2/2);
INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (5, 'Game4', 'Ruben', 1/1/1, 2/2/2);
INSERT  INTO PRESTAMO(id, nameGam, nameCli, fechaPres, fechaDev) VALUE (6, 'Game3', 'Alba', 1/1/1, 2/2/2);