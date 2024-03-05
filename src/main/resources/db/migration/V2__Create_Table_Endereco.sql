CREATE TABLE endereco (
      id_vendedora INT,
      endereco VARCHAR(100),
      numero VARCHAR(10),
      complemento VARCHAR(100),
      bairro VARCHAR(50),
      cidade VARCHAR(50),
      estado CHAR(2),
      cep VARCHAR(10),
      FOREIGN KEY (id_vendedora) REFERENCES vendedoras(id)
);
