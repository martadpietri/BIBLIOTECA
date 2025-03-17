--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table LIBRO;
drop table PRESTAMO;
drop table SOCIOS;


CREATE TABLE "LIBRO" (
	"ISDN"	INTEGER NOT NULL,
	"Titulo"	TEXT NOT NULL,
	"Autor"	TEXT NOT NULL,
	"Edicion"	INTEGER NOT NULL,
	"Categoria"	INTEGER NOT NULL,
	PRIMARY KEY("ISDN")
);

CREATE TABLE "PRESTAMO" (
	"socio"	INTEGER NOT NULL,
	"libro"	INTEGER NOT NULL,
	"fechaPestamo"	INTEGER NOT NULL,
	"fechaDevolucion"	INTEGER NOT NULL,
	PRIMARY KEY("libro","socio"),
	FOREIGN KEY("libro") REFERENCES "LIBRO"("ISDN"),
	FOREIGN KEY("socio") REFERENCES "SOCIOS"("numSocio")
);

CREATE TABLE "SOCIOS" (
	"numSocio"	INTEGER NOT NULL,
	"nomCcompleto"	TEXT NOT NULL,
	"Trabajador"	INTEGER NOT NULL,
	"fechaNacimiento"	TEXT NOT NULL,
	"masInfo"	TEXT,
	PRIMARY KEY("numSocio")
);


