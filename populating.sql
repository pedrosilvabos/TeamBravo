DELETE FROM users;
INSERT INTO users(ID, CREATIONTIME, UPDATETIME, VERSION, FIRSTNAME, LASTNAME, EMAIL, PHONE) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Rui', 'Ferrão', 'mail@gmail.com', '999777888'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'Sergio', 'Gouveia', 'mail@gmail.com', '999777888'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'Bruno', 'Ferreira', 'mail@gmail.com', '999777888');


DELETE FROM skills;
INSERT INTO skills(ID, SKILLNAME) VALUES
  (1, 'PROGRAMMER'),
  (2, 'ACCOUNTANT'),
  (3, 'ACTOR'),
  (4, 'NURSE'),
  (5, 'MEDIC'),
  (6, 'CARPENTER'),
  (7, 'ENGINEER'),
  (8, 'ARTIST'),
  (9, 'MECHANIC'),
  (10, 'LAWYER');
 

