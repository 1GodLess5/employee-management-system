CREATE TABLE employees (
    id bigint NOT NULL AUTO_INCREMENT,
    first_name varchar(25) NOT NULL,
    last_name varchar(25) NOT NULL,
    email_id varchar(50) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);