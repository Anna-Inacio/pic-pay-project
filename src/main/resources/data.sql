DELETE FROM bank_details;
DELETE FROM users;

INSERT INTO USERS (name, document_type, document_number, email, password) VALUES
('Anna', 'CPF' , '123.456.789.10', 'anna@gmail.com', '12345'),
('Joana', 'CPF', '123.456.789.11', 'joana@gmail.com', '1234567'),
('Anna Joias', 'CNPJ', '05.883.656/0001-13', 'annajoias@gmail.com', '123456');

INSERT INTO BANK_DETAILS (agency, digit, account, pix_key, bank_name) VALUES
(123, 1, 1234567, 'anna@gmail.com', 'bankanna'),
(123, 1, 9874561, 'joana@gmail.com', 'bankanna'),
(123, 1, 5678910, 'annajoias@gmail.com', 'bankanna');