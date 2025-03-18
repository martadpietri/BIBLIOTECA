--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from LIBRO;
delete from PRESTAMO;
delete from SOCIOS;

INSERT INTO LIBRO(ISDN,titulo,autor,edicion,categoria) VALUES 
(978-0439708180, "Harry Potter y la piedra filosofal", "J.K. Rowling", 1, "Menos 14"),
(978-0061122415, "El gato negro", "Edgar Allan Poe", 3, "Más 14"),
(978-8498387389, "Matilda", "Roald Dahl", 1, "Menos 14"),
(978-9871132076, "Cuentos de la selva", "Horacio Quiroga", 2, "Más 14"),
(978-0451524935, "1984", "George Orwell", 1, "Más 14"),
(978-8498386146, "Charlie y la fábrica de chocolate", "Roald Dahl", 1, "Menos 14"),
(978-8437605689, "Don Quijote de la Mancha", "Miguel de Cervantes", 1, "Más 14"),
(978-8448608193, "Percy Jackson y el ladrón del rayo", "Rick Riordan", 2, "Menos 14"),
(978-8498389796, "La llamada de lo salvaje", "Jack London", 1, "Más 14"),
(978-0143124193, "El diario de Ana Frank", "Ana Frank", 1, "Más 14");

INSERT INTO SOCIOS(numSocio,nomCompleto,trabajador,fechaNacimiento,masInfo) VALUES
('12345678A', 'Juan Pérez García', 1, '1985/03/22', '612345678'),
('98765432B', 'María López Martínez', 0, '2004/07/15', '623456789'),
('11122233C', 'Carlos Sánchez Ruiz', 1, '1992/11/03', '634567890'),
('56789123D', 'Ana Fernández Pérez', 0, '2009/01/30', '635678901'),
('23456789E', 'Luis Gómez Rodríguez', 1, '1980/06/17', '636789012'),
('87654321F', 'Laura Martínez Sánchez', 0, '2005/12/10', '637890123'),
('34567890G', 'José Álvarez López', 1, '1990/04/02', '638901234'),
('65432109H', 'Sofía Díaz González', 0, '2010/05/21', '639012345'),
('43210987I', 'Pedro Ruiz Romero', 1, '1988/09/14', '640123456'),
('765432108', 'Elena Torres Vargas', 0, '2015/08/29');


INSERT INTO PRESTAMO(ISDN, numSocio, fechaPrestamo, fechaDevolucion)
VALUES
(9780439708180, '12345678A', '2025-04-01', '2025-05-01'),
(9780061122415, '12345678A', '2025-04-02', '2025-04-17'),
(9788498387389, '12345678A', '2025-04-03', '2025-04-18'),
(9789876543210, '98765432B', '2025-03-25', '2025-04-09'),
(9788437605689, '98765432B', '2025-03-26', '2025-04-10'),
(9788498386146, '98765432B', '2025-03-27', '2025-04-11'),
(9788498389796, '11122233C', '2025-04-04', '2025-04-19');
