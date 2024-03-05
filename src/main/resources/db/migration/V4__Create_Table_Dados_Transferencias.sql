CREATE TABLE dados_transferencia (
        id_dados_transferencia INT AUTO_INCREMENT PRIMARY KEY,
        id_vendedora INT,
        metodo_transferencia ENUM('Pix', 'Transferência bancária'),
        chave_pix VARCHAR(100),
        tipo_chave_pix VARCHAR(50),
        instituicao_financeira VARCHAR(100),
        codigo_compensacao_banco VARCHAR(10),
        agencia VARCHAR(20),
        numero_conta_bancaria VARCHAR(20),
        FOREIGN KEY (id_vendedora) REFERENCES vendedoras(id)
);
