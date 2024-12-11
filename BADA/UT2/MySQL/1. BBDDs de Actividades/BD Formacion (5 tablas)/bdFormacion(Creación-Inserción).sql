DROP DATABASE IF EXISTS bdFormacion;
CREATE DATABASE  IF NOT EXISTS `bdformacion`;
USE `bdformacion`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: bdformacion
-- ------------------------------------------------------
-- Server version	8.0.22


-- Table structure for table `alumnos`
--
set foreign_key_checks = 0;

DROP TABLE IF EXISTS alumnos;
CREATE TABLE alumnos (
  CODAL varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NOMAL varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  DIRAL varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  POB varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (CODAL),
  UNIQUE KEY uq_dir (DIRAL)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `alumnos`
--
INSERT ALUMNOS VALUES ('A1', 'Antonio Antúnez', 'C/La Ermita 3', 'Pamplona');
INSERT ALUMNOS VALUES ('A2', 'Ane Aranburu', 'Avda. Central 5', 'Barañái');
INSERT ALUMNOS VALUES ('A3', 'Amalia Naya', 'C/Magdalena s/', 'Pamplona');
INSERT ALUMNOS VALUES ('A4', 'Antonio García Pérez', 'Astilleros 3', 'Valencia');
INSERT ALUMNOS VALUES ('A5', 'Carlos Pérez Ruiz', 'Magallanes 21', 'Utiel');
INSERT ALUMNOS VALUES ('A6', 'José Navarro Lard', 'Río Segura 14', 'Valencia');
INSERT ALUMNOS VALUES ('A7', 'Elisa Ébeda Sansó', 'Valencia 4', 'Sagunto');
INSERT ALUMNOS VALUES ('A8', 'Eva San Martí', 'Villafranca 34', 'Alzira');
INSERT ALUMNOS VALUES ('A9', 'Alfredo Hernández Luis', 'Salinas 8', 'Valencia');

--
-- Table structure for table `alumnoscursillos`
--

DROP TABLE IF EXISTS alumnoscursillos;
CREATE TABLE alumnoscursillos (
  CODAL varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  CODCUR varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NOTA decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (CODAL,CODCUR),
  KEY fk_cur (CODCUR),
  CONSTRAINT fk_al FOREIGN KEY (CODAL) REFERENCES alumnos (CODAL) ON UPDATE CASCADE,
  CONSTRAINT fk_cur FOREIGN KEY (CODCUR) REFERENCES cursillos (CODCUR) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `alumnoscursillos`
--
INSERT ALUMNOSCURSILLOS VALUES ('A1', 'C1', 9);
INSERT ALUMNOSCURSILLOS VALUES ('A1', 'C4', 5);
INSERT ALUMNOSCURSILLOS VALUES ('A1', 'C8', 8);
INSERT ALUMNOSCURSILLOS VALUES ('A1', 'C9', 6);
INSERT ALUMNOSCURSILLOS VALUES ('A2', 'C2', 8);
INSERT ALUMNOSCURSILLOS VALUES ('A3', 'C1', 9);
INSERT ALUMNOSCURSILLOS VALUES ('A3', 'C2', 9);
INSERT ALUMNOSCURSILLOS VALUES ('A3', 'C5', 4);
INSERT ALUMNOSCURSILLOS VALUES ('A3', 'C9', 5);
INSERT ALUMNOSCURSILLOS VALUES ('A4', 'C1', 10);
INSERT ALUMNOSCURSILLOS VALUES ('A4', 'C3', 7);
INSERT ALUMNOSCURSILLOS VALUES ('A4', 'C8', 7);

--
-- Table structure for table `cursillos`
--
DROP TABLE IF EXISTS cursillos;
CREATE TABLE cursillos (
  CODCUR varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NOMCUR varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NUMHORAS int NOT NULL,
  FECHA date NOT NULL,
  CODP varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (CODCUR),
  UNIQUE KEY UQ__CURSILLO__E4F8FFEF214ABFE0 (NOMCUR),
  KEY FK__CURSILLOS__CODP__2B3F6F97 (CODP),
  CONSTRAINT FK__CURSILLOS__CODP__2B3F6F97 FOREIGN KEY (CODP) REFERENCES profesores (CODP) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `cursillos`
--
INSERT CURSILLOS VALUES ('C1', 'SO', 300, '2016-04-24', 'P1');
INSERT CURSILLOS VALUES ('C2', 'HW', 150, '2016-03-21', 'P3');
INSERT CURSILLOS VALUES ('C3', 'HTML', 200, '2015-11-12', 'P1');
INSERT CURSILLOS VALUES ('C4', 'CONTABILIDAD', 200, '2015-12-12', 'P2');
INSERT CURSILLOS VALUES ('C5', 'FOL', 200, '2015-12-12', 'P2');
INSERT CURSILLOS VALUES ('C6', 'ASBD', 150, '2016-10-23', 'P3');
INSERT CURSILLOS VALUES ('C7', 'BADA', 175, '2015-05-20', 'P3');
INSERT CURSILLOS VALUES ('C8', 'ACDA', 225, '2017-06-17', 'P4');
INSERT CURSILLOS VALUES ('C9', 'DII', 160, '2016-08-21', 'P4');

--
-- Table structure for table `departamentos`
--
DROP TABLE IF EXISTS departamentos;
CREATE TABLE departamentos (
  CODDEP varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NOMDEP varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PLANTA int NOT NULL,
  PRIMARY KEY (CODDEP),
  UNIQUE KEY UQ__DEPARTAM__E4B97BF0469A5AAB (NOMDEP)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `departamentos`
--
INSERT INTO departamentos VALUES ('D1','INFORMÁTICA',1),('D2','ADMNISTRATIVO',2);

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS profesores;
CREATE TABLE profesores (
  CODP varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NOMP varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  NIVEL varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  FECCONTRATO date NOT NULL,
  SALARIO decimal(10,2) DEFAULT NULL,
  CODDEP varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (CODP),
  UNIQUE KEY UQ__PROFESOR__E2AB1FFB07CAFBA2 (NOMP),
  KEY fk_dep (CODDEP),
  CONSTRAINT fk_dep FOREIGN KEY (CODDEP) REFERENCES departamentos (CODDEP) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `profesores`
--
INSERT PROFESORES VALUES ('P1', 'Patricia Pérez', 'A', '2008-10-05', 1500.00, 'D1');
INSERT PROFESORES VALUES ('P2', 'Paula Puerta', 'B', '2010-03-19', 1300.00, 'D2');
INSERT PROFESORES VALUES ('P3', 'Peio Pagoaga', 'A', '2011-10-25', 1000.00, 'D1');
INSERT PROFESORES VALUES ('P4', 'Maite Zubillaga', 'B', '2011-12-11', 1250.00, 'D2');
INSERT PROFESORES VALUES ('P5', 'Luis Dorado', 'C', '2009-05-22', 1600.00, 'D2');

set foreign_key_checks = 1;
-- Dump completed
