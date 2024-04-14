CREATE TABLE IF NOT EXISTS Animals(
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Type VARCHAR(50)
);

INSERT INTO Animals(Type) VALUES
	('Домашние животные'), ('Вьючные животные');
    
CREATE TABLE Pets(
	id INT AUTO_INCREMENT PRIMARY KEY,
	animal_type VARCHAR(30),
	type_id INT DEFAULT 1,
	FOREIGN KEY (type_id) REFERENCES Animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Pets (animal_type) VALUES 
	('Собака'), ('Кот'), ('Хомяк');
    
CREATE TABLE Pack_animals(
	id INT AUTO_INCREMENT PRIMARY KEY,
	animal_type VARCHAR(30),
	type_id INT DEFAULT 2,
	FOREIGN KEY (type_id) REFERENCES Animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Pack_animals (animal_type) VALUES 
	('Лошадь'), ('Верблюд'), ('Осел');
    
CREATE TABLE Dog(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 1,
	FOREIGN KEY (type_id) REFERENCES Pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Dog (name, birthday, color, commands) VALUES 
	('Кварк', '2016-09-03', 'Черный', 'Взять, Зайка, Лапу'),
	('Булка', '2022-07-16', 'Черный', 'Умри, Рядом'),
	('Рок', '2024-11-05', 'Белый', 'Рядом');
    
CREATE TABLE Cat(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 2,
	FOREIGN KEY (type_id) REFERENCES Pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Cat (name, birthday, color, commands) VALUES 
	('Сима', '2020-12-12', 'Серый', 'Спать, Есть, Лежать'),
	('Чао', '2023-12-09', 'Черный', 'Есть, Играть, Прятаться'),
	('Люси', '2022-05-19', 'Белый', 'Ловить, Есть,');
    
CREATE TABLE Hamster(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 3,
	FOREIGN KEY (type_id) REFERENCES Pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Hamster (name, birthday, color, commands) VALUES 
	('Сэр', '2020-12-12', 'Белый', 'Есть'),
	('Май', '2023-12-09', 'Черный', 'Спать');
    
CREATE TABLE Horse (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 1,
	FOREIGN KEY (type_id) REFERENCES Pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Horse (name, birthday, color, commands) VALUES 
	('Грация', '2017-03-12', 'Рыжий', 'Галоп'),
	('Чарли', '2023-11-09', 'Черный', 'Рысь'),
    ('Лэди', '2019-09-09', 'Черный', 'Галоп, Прыжок');
    
CREATE TABLE Camel (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 2,
	FOREIGN KEY (type_id) REFERENCES Pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Camel (name, birthday, color, commands) VALUES 
	('Сапфир', '2020-03-12', 'Рыжий', 'Нести'),
	('Караван', '2019-01-09', 'Рыжий', 'Стоять'),
    ('Ронни', '2016-10-02', 'Черный', 'Ждать');
    
CREATE TABLE Donkey (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT DEFAULT 3,
	FOREIGN KEY (type_id) REFERENCES Pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Donkey (name, birthday, color, commands) VALUES 
	('Санни', '2024-03-12', 'Белый', 'Тащить'),
	('Зоя', '2024-01-09', 'Рыжий', 'Спать');
    
DROP TABLE human_friends_bd.Camel;

SELECT * FROM Horse UNION SELECT * FROM Donkey;

CREATE TABLE 3_years_old(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
    animal_type VARCHAR(30),
	birthday DATE,
	age_in_months INT
);

CREATE TABLE All_together(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	animal_type VARCHAR(30),
	birthday DATE,
	color VARCHAR(30),
	commands VARCHAR(100),
	type_id INT
);

INSERT INTO All_together (name,animal_type, birthday, color, commands, type_id)
SELECT name, 'Кот' AS animal_type, birthday, color, commands, type_id
FROM Cat
UNION
SELECT name, 'Собака' AS animal_type, birthday, color, commands, type_id
FROM Dog
UNION
SELECT name, 'Хомяк' AS animal_type, birthday, color, commands, type_id
FROM Hamster
UNION
SELECT name, 'Лошадь' AS animal_type, birthday, color, commands, type_id
FROM Horse
UNION
SELECT name, 'Осел' AS animal_type, birthday, color, commands, type_id
FROM Donkey;

INSERT INTO 3_years_old (name, animal_type, birthday, age_in_months)
SELECT name, animal_type, birthday, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age_in_months
FROM all_together
WHERE birthday <= DATE_SUB(CURDATE(), INTERVAL 1 YEAR) AND birthday >= DATE_SUB(CURDATE(), INTERVAL 3 YEAR);






    




    
    
    
    
    