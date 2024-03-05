CREATE TABLE usuarios (
  id_vendedora INT,
  email VARCHAR(100),
  senha VARCHAR(100),
  tipo ENUM('vendedora', 'administrador'),
  PRIMARY KEY (id_vendedora),
  FOREIGN KEY (id_vendedora) REFERENCES vendedoras(id)
);
