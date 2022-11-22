CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE tipo_animal(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL
);

CREATE TABLE animal(
	id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
	id_tipo_animal INT,
	nome VARCHAR(100) NOT NULL,
	idade INT NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	FOREIGN KEY (id_tipo_animal) REFERENCES tipo_animal
);
 
CREATE TABLE endereco (
	id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
	rua VARCHAR(100) NOT NULL,
	numero INT NOT NULL,
	cep INT NOT NULL,
	cidade VARCHAR(100) NOT NULL,
	estado VARCHAR(100) NOT NULL,
	pais VARCHAR(100) NOT NULL
);

CREATE TABLE pessoa(
	id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
	id_endereco UUID,
	id_animal UUID,
	nome VARCHAR(99) NOT NULL,
	cpf VARCHAR(12) NOT NULL,
	FOREIGN KEY (id_endereco) REFERENCES endereco,
	FOREIGN KEY (id_animal) REFERENCES animal
);
