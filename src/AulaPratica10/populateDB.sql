-- Populating tipo_animal
INSERT INTO tipo_animal 
	(nome)
VALUES (
	'Cachorro'	
);

INSERT INTO tipo_animal
	(nome)
VALUES (
	'Gato'
);

INSERT INTO tipo_animal
	(nome)
VALUES (
	'Passaro'
);

INSERT INTO tipo_animal
	(nome)
VALUES (
	'Roedor'
);

-- Populating endereco
INSERT INTO endereco
	(id, rua, numero, cep, cidade, estado, pais)
VALUES (
	'643c5c97-a2dc-463d-9254-e103891e37c8', 'Uma rua qualquer', 100, 100100, 'Uma cidade qualquer', 'Um estado qualquer', 'Um pais qualquer'
);

INSERT INTO endereco
	(id, rua, numero, cep, cidade, estado, pais)
VALUES (
	'28e3bb29-b666-4511-bba7-0787dd688022', 'Outra rua qualquer', 200, 200200, 'Outra cidade qualquer', 'Outro estado qualquer', 'Outro pais qualquer'
);

-- Populating animal
INSERT INTO animal
	(id, id_tipo_animal, nome, idade, descricao)
VALUES (
	'265a16cd-3a45-44d6-bcc5-ed90fb3d4149', 1, 'Toby', 5, 'Serelepe'
);

INSERT INTO animal 
	(id, id_tipo_animal, nome, idade, descricao
)
VALUES (
	'73f86426-b64e-4caf-a54b-86f1ed0c0efe', 2, 'Garfield', 2, 'Gordo'
);

-- Populating pessoa

INSERT INTO 
	pessoa (
		id_endereco, id_animal, nome, cpf
)
	VALUES (
		'643c5c97-a2dc-463d-9254-e103891e37c8', '265a16cd-3a45-44d6-bcc5-ed90fb3d4149', 'Augusto', '11111111111'
);

INSERT INTO pessoa
	(id_endereco, id_animal, nome, cpf)
VALUES (
	'28e3bb29-b666-4511-bba7-0787dd688022', '73f86426-b64e-4caf-a54b-86f1ed0c0efe', 'Roberto', '22222222222'
);

