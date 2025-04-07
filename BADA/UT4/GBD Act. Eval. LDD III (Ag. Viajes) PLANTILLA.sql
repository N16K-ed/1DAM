/* LDD MySQL		GEBD/BADA – ASIR/DAM/DAW
Actividad evaluable no exhaustiva
Contenidos: LDD III 
FRANCISCO JAVIER SAN NICOLÁS.
*/

-- Ejercicio 1
DROP DATABASE IF EXISTS bdAgenciaViajes;
CREATE DATABASE IF NOT EXISTS bdAgenciaViajes;

use bdAgenciaViajes;

CREATE TABLE IF NOT EXISTS Director(
codigo_director INT PRIMARY KEY AUTO_INCREMENT,
dni VARCHAR (9) UNIQUE NOT NULL,
nombre VARCHAR (50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Telefonos(
codigo_director INT NOT NULL,
telefono INT NOT NULL,
CONSTRAINT fk_director_telefono FOREIGN KEY (codigo_director) REFERENCES Director(codigo_director),
CONSTRAINT telefonos PRIMARY KEY (codigo_director, telefono)
);

CREATE TABLE IF NOT EXISTS Destinos(
codigo_destino INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Parques(
codigo_destino INT PRIMARY KEY,
precio_entrada DOUBLE (6,2),
CONSTRAINT fk_destino_parque FOREIGN KEY (codigo_destino) REFERENCES Destinos(codigo_destino)
);

CREATE TABLE IF NOT EXISTS Playas(
codigo_destino INT PRIMARY KEY,
categoria VARCHAR (20) NOT NULL,
playa_principal INT,
CONSTRAINT fk_destino_playa FOREIGN KEY (codigo_destino) REFERENCES Destinos(codigo_destino),
CONSTRAINT fk_playa_principal FOREIGN KEY (playa_principal) REFERENCES Playas(codigo_destino) 
);

CREATE TABLE IF NOT EXISTS Hoteles(
codigo_hotel INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (50) NOT NULL,
codigo_destino INT NOT NULL, 
codigo_director INT UNIQUE NOT NULL,
CONSTRAINT fk_destino_hotel FOREIGN KEY (codigo_destino) REFERENCES Destinos(codigo_destino),
CONSTRAINT fk_director_hotel FOREIGN KEY (codigo_director) REFERENCES Director(codigo_director) 
);

CREATE TABLE IF NOT EXISTS Habitaciones(
numero_habitacion INT NOT NULL,
codigo_hotel INT NOT NULL,
num_camas INT NOT NULL,
tipo VARCHAR (20),
CONSTRAINT fk_hotel_habitacion FOREIGN KEY (codigo_hotel) REFERENCES Hoteles(codigo_hotel),
CONSTRAINT pk_habitacion PRIMARY KEY (numero_habitacion, codigo_hotel)
);









