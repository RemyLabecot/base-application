DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
                        CUST_ID Bigserial PRIMARY KEY NOT NULL,
                        NAME varchar(100) NOT NULL,
                        AGE smallint NOT NULL);

INSERT INTO customer (NAME, AGE) VALUES ('remy', 33);
INSERT INTO customer (NAME, AGE) VALUES ('arno', 43);
INSERT INTO customer (NAME, AGE) VALUES ('prout', 12);
INSERT INTO customer (NAME, AGE) VALUES ('pouet', 72);