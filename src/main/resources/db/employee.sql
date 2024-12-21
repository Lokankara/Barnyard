DROP TABLE IF EXISTS employees;

CREATE TABLE employees
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    age         INT,
    gender      VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role        VARCHAR(50),
    fixed_bugs  INT DEFAULT 0,
    worked_days INT DEFAULT 0
);

CREATE TABLE employees
(
    id     BIGSERIAL PRIMARY KEY,
    name   VARCHAR(255) NOT NULL,
    age    INT,
    gender VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role   VARCHAR(50)
);

CREATE TABLE designers
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    age         INT,
    gender      VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role        VARCHAR(50),
    fixed_bugs  INT,
    worked_days INT
);

CREATE TABLE developers
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    age        INT,
    gender     VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role       VARCHAR(50),
    fixed_bugs INT
);

CREATE TABLE managers
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    age         INT,
    gender      VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role        VARCHAR(50),
    worked_days INT
);

CREATE TABLE qcs
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    age        INT,
    gender     VARCHAR(10),
    salary      NUMERIC(10, 2),
    rate        NUMERIC(10, 2),
    role       VARCHAR(50),
    fixed_bugs INT
);


INSERT INTO employees (name, gender, salary, rate, role)
VALUES ('Roy', 'Male', 5000.0, 100.0, 'EMPLOYEE'),
       ('John', 'Male', 5500.0, 110.0, 'EMPLOYEE'),
       ('Jimmy', 'Male', 4800.0, 95.0, 'EMPLOYEE'),
       ('Thomas', 'Male', 6000.0, 120.0, 'EMPLOYEE'),
       ('Albert', 'Male', 5300.0, 105.0, 'EMPLOYEE'),
       ('Charlie', 'Male', 5100.0, 100.0, 'EMPLOYEE'),
       ('Michael', 'Male', 5900.0, 115.0, 'EMPLOYEE'),
       ('Howard', 'Male', 5600.0, 108.0, 'EMPLOYEE'),
       ('James', 'Male', 5200.0, 102.0, 'EMPLOYEE'),
       ('Marvin', 'Male', 5400.0, 106.0, 'EMPLOYEE'),
       ('Jordan', 'Male', 5800.0, 110.0, 'EMPLOYEE'),
       ('William', 'Male', 6000.0, 120.0, 'EMPLOYEE'),
       ('Wayne', 'Male', 5500.0, 107.0, 'EMPLOYEE'),
       ('Jeremy', 'Male', 5700.0, 113.0, 'EMPLOYEE'),
       ('Robert', 'Male', 5900.0, 116.0, 'EMPLOYEE'),
       ('Edwards', 'Male', 5600.0, 109.0, 'EMPLOYEE'),
       ('Chester', 'Male', 5300.0, 104.0, 'EMPLOYEE'),
       ('Daniel', 'Male', 5100.0, 101.0, 'EMPLOYEE');

INSERT INTO employees (name, gender, salary, rate, role)
VALUES ('Mary', 'Female', 5200.0, 105.0, 'EMPLOYEE'),
       ('Patricia', 'Female', 5500.0, 110.0, 'EMPLOYEE'),
       ('Karen', 'Female', 4800.0, 95.0, 'EMPLOYEE'),
       ('Rita', 'Female', 5600.0, 108.0, 'EMPLOYEE'),
       ('Dolores', 'Female', 5100.0, 100.0, 'EMPLOYEE'),
       ('Pauline', 'Female', 5400.0, 106.0, 'EMPLOYEE'),
       ('Agnes', 'Female', 5200.0, 103.0, 'EMPLOYEE'),
       ('Kristin', 'Female', 5300.0, 104.0, 'EMPLOYEE'),
       ('Dawn', 'Female', 5000.0, 99.0, 'EMPLOYEE'),
       ('Lisa', 'Female', 5700.0, 112.0, 'EMPLOYEE'),
       ('Carolyn', 'Female', 5600.0, 110.0, 'EMPLOYEE'),
       ('Ashley', 'Female', 5800.0, 115.0, 'EMPLOYEE'),
       ('Maria', 'Female', 4900.0, 98.0, 'EMPLOYEE'),
       ('Lillian', 'Female', 5500.0, 111.0, 'EMPLOYEE'),
       ('Frances', 'Female', 5100.0, 101.0, 'EMPLOYEE'),
       ('Marian', 'Female', 5400.0, 107.0, 'EMPLOYEE'),
       ('Alice', 'Female', 5200.0, 105.0, 'EMPLOYEE'),
       ('Helen', 'Female', 5300.0, 106.0, 'EMPLOYEE'),
       ('Linda', 'Female', 5500.0, 109.0, 'EMPLOYEE');

INSERT INTO employees (name, gender, salary, rate, role, fixed_bugs, worked_days)
VALUES ('Roy', 'Male', 5000.0, 100.0, 'DESIGNER', 10, 20),
       ('John', 'Male', 5500.0, 110.0, 'DESIGNER', 12, 22);

INSERT INTO employees (name, gender, salary, rate, role, fixed_bugs)
VALUES ('Michael', 'Male', 5900.0, 115.0, 'DEVELOPER', 15),
       ('James', 'Male', 5200.0, 102.0, 'DEVELOPER', 20);

INSERT INTO employees (name, gender, salary, rate, role, worked_days)
VALUES ('Thomas', 'Male', 6000.0, 120.0, 'MANAGER', 25),
       ('Marvin', 'Male', 5400.0, 106.0, 'MANAGER', 30);

INSERT INTO employees (name, gender, salary, rate, role, fixed_bugs)
VALUES ('Patricia', 'Female', 5500.0, 110.0, 'QC', 18),
       ('Agnes', 'Female', 5200.0, 103.0, 'QC', 22);

SELECT SUM(salary)
FROM employees
WHERE gender = 'Male';
