DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(id UUID PRIMARY KEY NOT NULL, nome VARCHAR(250) NULL, email  VARCHAR(250) NULL, telefone VARCHAR(250) NULL);

INSERT INTO usuarios VALUES('0797dd3c-fc68-4802-ad5d-7b47f579d412', 'Matheus Ramos', 'matheus.hrs@live.com', '47991251691');
INSERT INTO usuarios VALUES('1b1e3826-089c-4afb-978a-f1a39ed6a4c8', 'José Benedito', 'jose.benedito@gmail.com', '47993665999');