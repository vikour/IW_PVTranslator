/**
 * Author:  vikour
 * Created: 30-oct-2018
 */

CREATE TABLE modulo (
    nombre VARCHAR(50) PRIMARY KEY,
    alpha DOUBLE NOT NULL,
    beta DOUBLE NOT NULL,
    gamma DOUBLE NOT NULL,
    kappa DOUBLE NOT NULL
);

CREATE TABLE campaña (
    nombre VARCHAR(50) PRIMARY KEY,
    modulo VARCHAR(50) NOT NULL,
    CONSTRAINT modulo_fk FOREIGN KEY (modulo) REFERENCES modulo(nombre) ON DELETE CASCADE
);

INSERT INTO modulo VALUES
('moduo1', 0.5, 3, 5.3, 6),
('moduo2', 0.7, 1, 4.3, 3),
('moduo4', 0.9, 2, 5.9, 2);

INSERT INTO campaña VALUES
('campaña11', 'modulo1'),
('campaña12', 'modulo1'),
('campaña13', 'modulo1'),
('campaña21', 'modulo2'),
('campaña22', 'modulo2'),
('campaña23', 'modulo2'),
('campaña24', 'modulo2'),
('campaña41', 'modulo4'),
('campaña42', 'modulo4'),
('campaña43', 'modulo4');


