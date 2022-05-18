-- ddl (Creación bd)-- 

DROP DATABASE alimentamos;

CREATE DATABASE alimentamos;

\c alimentamos;

CREATE TABLE persona(
    identificacion INT NOT NULL,
    nombre VARCHAR(60) NOT NULL,
    direccion VARCHAR(40) NOT NULL ,
    PRIMARY KEY(identificacion)
);

CREATE TABLE telefonos_persona(
    identificacion_persona INT NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    PRIMARY KEY(identificacion_persona,telefono),
    FOREIGN KEY (identificacion_persona) REFERENCES persona(identificacion) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE ciudad(
    id SERIAL,
    ciudad VARCHAR(20) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE ruta_distribucion(
    id INT NOT NULL, 
    id_ciudad_destino INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    fecha_apertura DATE NOT NULL,
    fecha_cambio_costo DATE NOT NULL,
    costo_ruta REAL NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (id_ciudad_destino) REFERENCES ciudad(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE cliente(
    identicacion_persona_cliente INT NOT NULL,
    id_ciudad INT NOT NULL,
    fecha_entrega_productos DATE NOT NULL,
    PRIMARY KEY(identicacion_persona_cliente),
    FOREIGN KEY (identicacion_persona_cliente) REFERENCES persona(identificacion) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_ciudad) REFERENCES ciudad(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE conductor(
    identicacion_persona_conductor INT NOT NULL,
    fecha_ingreso DATE NOT NULL,
    disponibilidad BOOLEAN NOT NULL,
    id_ruta_distribucion INT ,
    PRIMARY KEY(identicacion_persona_conductor),
    FOREIGN KEY (id_ruta_distribucion) REFERENCES ruta_distribucion(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (identicacion_persona_conductor) REFERENCES persona(identificacion) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE historial_rutas_conductor(
    id SERIAL,
    identicacion_persona_conductor INT NOT NULL,
    fecha_asignacion_ruta DATE NOT NULL,
    PRIMARY KEY(id,identicacion_persona_conductor),
    FOREIGN KEY (identicacion_persona_conductor) REFERENCES conductor(identicacion_persona_conductor) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE pedido(
    id SERIAL,
    subtotal REAL NOT NULL,
    total REAL,
    id_ruta_distribucion INT NOT NULL,
    identicacion_persona_cliente INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (id_ruta_distribucion) REFERENCES ruta_distribucion(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (identicacion_persona_cliente) REFERENCES cliente(identicacion_persona_cliente) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE articulo(
    id SERIAL,
    nombre VARCHAR(50) NOT NULL,
    precio REAL NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE sede_principal(
    id SERIAL,
    id_pedido INT NOT NULL,
    id_articulo INT NOT NULL,
    cantidad INT NOT NULL,
    valor REAL NOT NULL,
    PRIMARY KEY(id,id_pedido,id_articulo),
    FOREIGN KEY (id_pedido) REFERENCES pedido(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_articulo) REFERENCES articulo(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE proveedor(
    nit INT NOT NULL,
    persona_contacto VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    PRIMARY KEY(nit)
);

CREATE TABLE telefonos_proveedor(
    nit_proveedor INT NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    PRIMARY KEY(nit_proveedor,telefono),
    FOREIGN KEY (nit_proveedor) REFERENCES proveedor(nit) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE distribuir(
    id_articulo INT NOT NULL,
    nit_proveedor INT NOT NULL,
    PRIMARY KEY(id_articulo,nit_proveedor),
    FOREIGN KEY (id_articulo) REFERENCES articulo(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (nit_proveedor) REFERENCES proveedor(nit) ON DELETE CASCADE ON UPDATE CASCADE
);



-- Trigger que genera el total

CREATE OR REPLACE FUNCTION total()
RETURNS trigger
AS
$total$
DECLARE 
x int := NEW.id_ruta_distribucion;
BEGIN
    NEW.total := (((NEW.subtotal * 0.3) + NEW.subtotal) + (SELECT costo_ruta FROM ruta_distribucion WHERE id = x ));
    RETURN NEW;
END;
$total$
LANGUAGE plpgsql;

CREATE OR REPLACE TRIGGER calculo_total
BEFORE INSERT OR UPDATE
ON pedido
FOR EACH ROW 
EXECUTE PROCEDURE total();

-- RULES para insertar

CREATE OR REPLACE RULE valor_rango 
    AS ON INSERT 
    TO sede_principal WHERE NEW.valor < 0
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE cantidad_rango 
    AS ON INSERT  
    TO sede_principal WHERE NEW.cantidad < 0  
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE costo_ruta_rango 
    AS ON INSERT  
    TO ruta_distribucion WHERE NEW.costo_ruta < 0 
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE fecha_anterior_actual 
    AS ON INSERT 
    TO cliente WHERE current_date > NEW.fecha_entrega_productos 
    DO INSTEAD NOTHING; 

-- RULES para actualizar

CREATE OR REPLACE RULE valor_rango_u 
    AS ON UPDATE 
    TO sede_principal WHERE NEW.valor < 0
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE cantidad_rango_u
    AS ON UPDATE  
    TO sede_principal WHERE NEW.cantidad < 0  
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE costo_ruta_rango_u
    AS ON UPDATE  
    TO ruta_distribucion WHERE NEW.costo_ruta < 0 
    DO INSTEAD NOTHING; 

CREATE OR REPLACE RULE fecha_anterior_actual_u 
    AS ON UPDATE 
    TO cliente WHERE current_date > NEW.fecha_entrega_productos 
    DO INSTEAD NOTHING; 

-- DML insercion de datos

INSERT INTO persona VALUES (1000001,'Juan Lopez','Calle 47 A 32 B 12');
INSERT INTO persona VALUES (1000002,'Yojhan Cardona','Calle 33 A 55 B 1');
INSERT INTO persona VALUES (1000003,'Brandon Savedra','Calle 15 A 32 A 2');
INSERT INTO persona VALUES (1000004,'Paula Cante','Calle 47 A 44 J 44');
INSERT INTO persona VALUES (1000005,'Felipe Hernandez','Calle 12 tranversal americas');
INSERT INTO persona VALUES (1000006,'Camila Gonzalez','Cra 4 bis 76');
INSERT INTO persona VALUES (1000007,'Stiven Gomez','Av 4 b 5');
INSERT INTO persona VALUES (1000008,'Julian Roa','Cll 14 bis 6');
INSERT INTO persona VALUES (1000009,'Sofia Nuñez','Cra 47 a 6 b');
INSERT INTO persona VALUES (1000010,'Sabina Ruiz','Cll 3 bis 5');
INSERT INTO persona VALUES (1000011,'Julio Arange','Cll 33 bis 53');
INSERT INTO persona VALUES (1000012,'Julio Arange','Cll 33 bis 53');

SELECT * FROM persona;

INSERT INTO telefonos_persona VALUES (1000001,'3122111312');
INSERT INTO telefonos_persona VALUES (1000002,'3152545647');
INSERT INTO telefonos_persona VALUES (1000003,'3178563151');
INSERT INTO telefonos_persona VALUES (1000004,'3176541685');
INSERT INTO telefonos_persona VALUES (1000005,'3132651658');
INSERT INTO telefonos_persona VALUES (1000006,'32014596');
INSERT INTO telefonos_persona VALUES (1000007,'41258934');
INSERT INTO telefonos_persona VALUES (1000008,'20356987');
INSERT INTO telefonos_persona VALUES (1000009,'34785236');
INSERT INTO telefonos_persona VALUES (1000010,'31624897');

SELECT * FROM telefonos_persona;

INSERT INTO ciudad(ciudad) VALUES ('Bogota');
INSERT INTO ciudad(ciudad) VALUES ('Cali');
INSERT INTO ciudad(ciudad) VALUES ('Medellin');
INSERT INTO ciudad(ciudad) VALUES ('Ibague');
INSERT INTO ciudad(ciudad) VALUES ('Cucuta');
INSERT INTO ciudad(ciudad) VALUES ('Bucaramanga');
INSERT INTO ciudad(ciudad) VALUES ('Armenia');
INSERT INTO ciudad(ciudad) VALUES ('Barranquilla');
INSERT INTO ciudad(ciudad) VALUES ('Cartagena');
INSERT INTO ciudad(ciudad) VALUES ('Pereira');
INSERT INTO ciudad(ciudad) VALUES ('Buga');

SELECT * FROM ciudad;

INSERT INTO ruta_distribucion VALUES (101,1,'Ruta #FFF125','23-03-2022','12-07-2022',15000);
INSERT INTO ruta_distribucion VALUES (102,2,'Ruta #KKF789','23-03-2022','12-06-2022',50000);
INSERT INTO ruta_distribucion VALUES (103,3,'Ruta #LSM525','23-03-2022','12-08-2022',45000);
INSERT INTO ruta_distribucion VALUES (104,4,'Ruta #F5F5TH','26-03-2022','24-10-2022',45000);
INSERT INTO ruta_distribucion VALUES (105,5,'Ruta #F8DCFR','15-02-2022','27-09-2022',31000);

SELECT * FROM ruta_distribucion;

INSERT INTO cliente VALUES (1000001,1,'23-05-2022');
INSERT INTO cliente VALUES (1000002,2,'23-04-2022');
INSERT INTO cliente VALUES (1000003,3,'26-03-2022');
INSERT INTO cliente VALUES (1000004,4,'15-05-2022');
INSERT INTO cliente VALUES (1000005,5,'30-03-2022');
INSERT INTO cliente VALUES (1000011,4,'30-03-2022');

SELECT * FROM cliente;

INSERT INTO conductor VALUES (1000006,'23-05-2021',TRUE,101);
INSERT INTO conductor VALUES (1000007,'23-04-2021',TRUE,102);
INSERT INTO conductor VALUES (1000008,'26-03-2021',TRUE,103);
INSERT INTO conductor VALUES (1000009,'15-05-2021',TRUE,104);
INSERT INTO conductor VALUES (1000010,'30-03-2021',TRUE,105);
INSERT INTO conductor VALUES (1000011,'30-03-2021',FALSE,105);

SELECT * FROM conductor;

INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000006,'23-05-2020');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000006,'23-05-2021');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000007,'23-04-2019');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000008,'26-03-2020');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000009,'15-05-2021');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000010,'30-03-2018');
INSERT INTO historial_rutas_conductor(identicacion_persona_conductor,fecha_asignacion_ruta) VALUES (1000010,'30-07-2018');

SELECT * FROM historial_rutas_conductor;

INSERT INTO articulo(nombre,precio) VALUES ('Leche klim',6000); 
INSERT INTO articulo(nombre,precio) VALUES ('Pan Bimbo',4000);
INSERT INTO articulo(nombre,precio) VALUES ('Atun Pescadito',6500);   
INSERT INTO articulo(nombre,precio) VALUES ('Arroz Diana libra',3200);     
INSERT INTO articulo(nombre,precio) VALUES ('Pasta Doria',2500);  

SELECT * FROM articulo;

INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (60000,101,1000001);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (40000,102,1000002);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (40000,102,1000002);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (65000,103,1000003);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (32000,104,1000004);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (25000,105,1000005);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (25000,105,1000005);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (40000,105,1000001);
INSERT INTO pedido(subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (32000,104,1000011);

SELECT * FROM pedido;

INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor) VALUES (1,1,10,6000); 
INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (2,2,10,4000); 
INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (3,3,10,6500); 
INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (4,4,10,3200); 
INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (5,5,10,2500); 
INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (6,2,10,4000); 


SELECT * FROM sede_principal;

INSERT INTO proveedor(nit, direccion, nombre, persona_contacto) VALUES (10, 'Cll 70 A Bis Sur #80 n 22','Juan Randulfo Vargas López','German Vargas');
INSERT INTO proveedor(nit, direccion, nombre, persona_contacto) VALUES (20, 'cra 5 transversal 7','Paula Alejandra Martinez Gongora','Arnold Rodriguez');
INSERT INTO proveedor(nit, direccion, nombre, persona_contacto) VALUES (30, 'Cll 33 J Norte #66 - 20','Felipe Arley Duarte Suiza','Sofia Detelvina');
INSERT INTO proveedor(nit, direccion, nombre, persona_contacto) VALUES (40, 'Cll 12 Z sur #66 - 20','Paula Maria Cante Guani','Claudia Liliana');
INSERT INTO proveedor(nit, direccion, nombre, persona_contacto) VALUES (50, 'Cra 12 diagonal 5 Norte','Andres Felipe Palacios Vargas','Holman Moreno');

SELECT * FROM proveedor;

INSERT INTO telefonos_proveedor(telefono, nit_proveedor) VALUES('315254545',10);
INSERT INTO telefonos_proveedor(telefono, nit_proveedor) VALUES('314789987',20);
INSERT INTO telefonos_proveedor(telefono, nit_proveedor) VALUES('317288562',30);
INSERT INTO telefonos_proveedor(telefono, nit_proveedor) VALUES('315245697',40);
INSERT INTO telefonos_proveedor(telefono, nit_proveedor) VALUES('312579842',50);

SELECT * FROM telefonos_proveedor;

INSERT INTO distribuir(id_articulo, nit_proveedor) VALUES(1,20);
INSERT INTO distribuir(id_articulo, nit_proveedor) VALUES(3,10);
INSERT INTO distribuir(id_articulo, nit_proveedor) VALUES(2,30);
INSERT INTO distribuir(id_articulo, nit_proveedor) VALUES(4,40);
INSERT INTO distribuir(id_articulo, nit_proveedor) VALUES(5,50);

SELECT * FROM distribuir;


-- ventas por cliente FUNCION

CREATE TABLE vent_cliente(
     nombre VARCHAR(30),
     total BIGINT
);

CREATE OR REPLACE FUNCTION ventas_cliente(idv int)
RETURNS SETOF vent_cliente 
AS
$$
SELECT pe.nombre, p.total FROM persona AS pe JOIN 
cliente AS c ON (pe.identificacion = c.identicacion_persona_cliente) 
JOIN pedido AS p ON (c.identicacion_persona_cliente = p.identicacion_persona_cliente) WHERE c.identicacion_persona_cliente = idv;
$$
LANGUAGE sql;     

SELECT * FROM ventas_cliente(1000001);


-- ventas por ciudad FUNCION

CREATE TABLE total(
     total BIGINT
);

CREATE OR REPLACE FUNCTION ventas_ciudad(city VARCHAR(30))
RETURNS SETOF total 
AS
$$
SELECT p.total 
    FROM cliente AS c 
        JOIN pedido AS p ON (p.identicacion_persona_cliente = c.identicacion_persona_cliente) 
                JOIN ciudad AS ci ON (c.id_ciudad = ci.id) WHERE ci.ciudad = city;
$$
LANGUAGE sql;     

SELECT * FROM ventas_ciudad('Ibague');


------------------------------------------------------------------------------------------------------

-- gastos VISTA

CREATE VIEW vista_gastos(Gastos_de_la_empresa) AS 
    SELECT SUM(subtotal) FROM pedido;


SELECT * FROM vista_gastos;

-- conductores asignados a las rutas FUNCION

CREATE TABLE cond_asignados(
     nombre_persona VARCHAR(50),
     nombre_ruta_distribucion VARCHAR(50)
);

CREATE OR REPLACE FUNCTION conductores_asignados(estado BOOLEAN)
RETURNS SETOF cond_asignados 
AS
$$
SELECT pe.nombre,r.nombre 
    FROM persona AS pe JOIN conductor AS c ON (pe.identificacion = c.identicacion_persona_conductor) 
        JOIN ruta_distribucion AS r ON (r.id = c.id_ruta_distribucion) WHERE c.disponibilidad = estado;
$$
LANGUAGE sql;    

SELECT * FROM conductores_asignados(TRUE);
------------------------------------------------------------------------------------------------------

-- clientes cubiertos por cada una de las rutas VISTA


 CREATE VIEW vista_conductores_cubiertos (nombre_cliente, nombre_ruta, ciudad_destino_cliente) AS SELECT pe.nombre,r.nombre, ciu.ciudad 
    FROM persona AS pe JOIN cliente AS cli ON (pe.identificacion = cli.identicacion_persona_cliente)
        JOIN pedido AS p ON (cli.identicacion_persona_cliente = p.identicacion_persona_cliente)
        JOIN ruta_distribucion AS r ON (r.id = p.id_ruta_distribucion) 
        JOIN ciudad AS ciu ON (ciu.id = r.id_ciudad_destino);

SELECT * FROM vista_conductores_cubiertos;

-- Historial rutas conductor VISTA

CREATE VIEW vista_historial (nombre_conductor, fecha_asignada_de_ruta, nombre_de_la_ruta) AS
     SELECT pe.nombre, his.fecha_asignacion_ruta, ru.nombre 
     FROM persona AS pe, conductor AS c, historial_rutas_conductor AS his, ruta_distribucion AS ru
     WHERE  pe.identificacion = c.identicacion_persona_conductor AND c.identicacion_persona_conductor = his.identicacion_persona_conductor
     AND   ru.id = c.id_ruta_distribucion;

SELECT * FROM vista_historial;

-- ventas VISTA

CREATE VIEW vista_venta (venta_total_de_pedidos) AS
 SELECT SUM(total) FROM pedido;

 SELECT * FROM vista_venta;

