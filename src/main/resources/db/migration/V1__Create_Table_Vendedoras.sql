
CREATE TABLE vendedoras (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_completo VARCHAR(100) NOT NULL ,
    cpf VARCHAR(14) NOT NULL ,
    telefone_whatsapp VARCHAR(20) ,
    data_nascimento DATE NOT NULL ,
    trabalha_com_venda_direta ENUM('YES', 'NO') NOT NULL ,
    documento_pessoal BLOB NOT NULL ,
    comprovante_residencia BLOB NOT NULL
);
