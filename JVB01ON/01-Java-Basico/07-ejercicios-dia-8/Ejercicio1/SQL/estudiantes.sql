-- Eliminar la tabla estudiantes si ya existe
DROP DATABASE IF EXISTS universidad;

-- Crear la base de datos si no existe
CREATE DATABASE universidad;

-- Usar la base de datos
USE universidad;

-- Crear la tabla estudiantes si no existe
CREATE TABLE estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    grade DECIMAL(5, 2) NOT NULL
);
