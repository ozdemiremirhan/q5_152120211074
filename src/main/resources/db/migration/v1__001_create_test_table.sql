-- V1__create_test_table.sql
CREATE TABLE test (
  id SERIAL PRIMARY KEY,
  name VARCHAR(50),
  surname VARCHAR(50),
  password VARCHAR(100)
);