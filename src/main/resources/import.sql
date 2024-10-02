CREATE TABLE if not exists public.PERSONS
(
    id           SERIAL PRIMARY KEY,
    name         TEXT    NOT NULL,
    surname      TEXT    NOT NULL,
    age          INTEGER NOT NULL,
    phone_number TEXT,
    city_of_living TEXT
);
INSERT INTO public.PERSONS(name, surname, age, phone_number, city_of_living)
VALUES ('Anatoly', 'Zhuchkov', 42, 79002543135, 'Moscow');
INSERT INTO public.PERSONS(name, surname, age, phone_number, city_of_living)
VALUES ('Aleksandr', 'Leshkov', 30, 79002543136, 'KRD');
INSERT INTO public.PERSONS(name, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Simonan', 31, 79002543137, 'KRD');
INSERT INTO public.PERSONS(name, surname, age, phone_number, city_of_living)
VALUES ('Alla', 'Kuprazkina', 37, 79002543138, 'KRD');
INSERT INTO public.PERSONS(name, surname, age, phone_number, city_of_living)
VALUES ('Allia', 'Kirpa', 29, 79002543139, 'KRD');