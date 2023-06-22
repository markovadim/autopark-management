--liquibase formatted sql

--changeset liquibase-service:insert data

insert into owners (first_name, last_name, passport_number, email, phone_number)
values ('vadim', 'markov', 'dwe3daw3d', 'emailemail@gmail.com', '567854326654'),
       ('vadim', 'nemarkov', 'd321edw3df', 'csa322w@gmail.com', '986524326654'),
       ('igorio', 'kovalo', 'h3g77375621', 'yterq7672@gmail.com', '807845226654'),
       ('kirio', 'jiok', 'uyweqt656371', 'kirikiriw@gmail.com', '354635243876'),
       ('vadim', 'makarov', 'uy7551313', 'dsa3w@gmail.com', '321435477325'),
       ('viktor', 'kirolov', '213fdjr23', 'ffffrr32w@gmail.com', '655637281937');

insert into cars (make, model, year_of_issue, power, fuel_type, owner_id)
values ('AUDI', 'a7', 2023, 321, 'PETROL', 1),
       ('BMW', 'e39', 2001, 141, 'DIESEL', 1),
       ('NISSAN', 'X-Trail', 2011, 201, 'DIESEL', 3),
       ('VOLKSWAGEN', 'B5+', 2001, 135, 'DIESEL', 2);