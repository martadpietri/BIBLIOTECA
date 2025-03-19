--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table LIBRO;
drop table PRESTAMO;
drop table SOCIOS;
drop table USUARIO;


CREATE TABLE "LIBRO" (
	"ISBN"	INTEGER NOT NULL,
	"titulo"	TEXT NOT NULL,
	"autor"	TEXT NOT NULL,
	"edicion"	INTEGER NOT NULL,
	"categoriaLibro"	INTEGER NOT NULL,
	PRIMARY KEY("ISBN")
);

CREATE TABLE "PRESTAMO" (
	"numSocio"	INTEGER NOT NULL,
	"ISBN"	INTEGER NOT NULL,
	"fechaPrestamo"	INTEGER NOT NULL,
	"fechaDevolucion"	INTEGER NOT NULL,
	PRIMARY KEY("ISBN","numSocio"),
	FOREIGN KEY("ISBN") REFERENCES "LIBRO"("ISBN"),
	FOREIGN KEY("numSocio") REFERENCES "SOCIOS"("numSocio")
);

CREATE TABLE "SOCIOS" (
	"numSocio"	TEXT NOT NULL,
	"nomCompleto"	TEXT NOT NULL,
	"Trabajador"	INTEGER NOT NULL,
	"fechaNacimiento"	TEXT NOT NULL,
	"masInfo"	TEXT,
	PRIMARY KEY("numSocio")
);

CREATE TABLE "USUARIO" (
	"usuarios"	TEXT NOT NULL,
	"contraseña"	TEXT NOT NULL,
	PRIMARY KEY("usuarios")
);

