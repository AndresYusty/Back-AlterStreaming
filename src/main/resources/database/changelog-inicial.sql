-- liquibase formatted sql

-- changeset andres:1
-- comment: Tabla donde guardaremos el contenido - pelicula o serie
CREATE TABLE genero(
	id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL
);
-- changeset andres:2
-- comment: Tabla donde guardaremos el contenido - pelicula o serie
INSERT INTO genero(tipo) VALUES
("comedia"),
("terror"),
("accion");

-- changeset andres:3
-- comment: Tabla donde guardaremos el contenido - pelicula o serie
CREATE TABLE contenido(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre  VARCHAR(50) NOT NULL unique,
    tipo VARCHAR(50) NOT NULL,
        id_genero int NOT NULL,
    		FOREIGN KEY(id_genero) REFERENCES genero(id),
    		puntuaciones INT ,
    		visualizaciones INT NOT NULL
);

-- changeset andres:4
-- comment: Tabla donde guardaremos el contenido - pelicula o serie
CREATE TABLE usuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
    username  VARCHAR(50) NOT NULL unique,
    clave VARCHAR(60) NOT NULL,
    activo BOOLEAN NOT NULL,
    rol VARCHAR (20) NOT NULL
);

-- changeset andres:5
-- comment: Registro de peliculas y series
INSERT INTO contenido(nombre, tipo, id_genero, puntuaciones, visualizaciones) VALUES
("Spiderman", "Pelicula", 3, 1, 0),
("Revancha", "Pelicula", 3, 1, 0),
("Breaking bad", "Serie", 3, 1, 0),
("Juego de Tronos", "Serie", 2, 1, 0),
("¿Qué pasó ayer?", "Pelicula", 1, 1, 0),
("El conjuro", "Pelicula", 3, 1, 0),
("Los simpson", "Serie", 1, 1, 0),
("Titanic", "Pelicula", 3, 1, 0);





