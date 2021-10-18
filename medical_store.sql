-- DROP DATABASE IF EXISTS medical_store;
-- CREATE DATABASE medical_store;
USE medical_store;
-- DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
	cust_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    PRIMARY KEY(cust_id)
);

-- DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	emp_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    role ENUM('admin','associate'),
    salary DOUBLE(9,2),
    PRIMARY KEY(emp_id)
) ;

-- DROP TABLE IF EXISTS supplier;
CREATE TABLE supplier (
	sup_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    supplier_name VARCHAR(45),
    PRIMARY KEY(sup_id)
);


-- DROP TABLE IF EXISTS product;
CREATE TABLE product (
	prod_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	prod_name VARCHAR(45) NOT NULL,
	prod_description VARCHAR(150),
	price DOUBLE(6,2),
    current_stock INT NOT NULL,
    min_limit INT NOT NULL,
    total_sold DOUBLE(9,0),
	supplier_id INT UNSIGNED NOT NULL,
    PRIMARY KEY(prod_id),
    FOREIGN KEY(supplier_id) REFERENCES supplier(sup_id)
);

-- DROP TABLE IF EXISTS transaction;
CREATE TABLE transaction (
	trans_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    customer_id INT UNSIGNED NOT NULL,
    product_id INT UNSIGNED NOT NULL,
    employee_id INT UNSIGNED NOT NULL,
    date DATE NOT nulL,
    PRIMARY KEY(trans_id),
    FOREIGN KEY(customer_id) REFERENCES customer(cust_id),
    FOREIGN KEY(product_id) REFERENCES product(prod_id),
    FOREIGN KEY(employee_id) REFERENCES employee(emp_id)
);

-- INSERT INTO customer (first_name, last_name)
-- VALUES ('John', 'Doe'),
-- 	('Joe','Schmoe'),
--     ('Grace','Hopper'),
--     ('Ada', 'Lovelace');
--     

-- INSERT INTO employee (first_name, last_name, role, salary)
-- VALUES ('Charles', 'Babbage', 'associate', 50000),
-- 	('Alice', 'Smith', 'admin', 70000);
--     
-- INSERT INTO supplier (supplier_name)
-- VALUES ('ACME'),
-- 	('LexCorp'),
--     ('Wayne Industries');
--     
-- INSERT INTO product (prod_name, prod_description, price, current_stock, min_limit, total_sold, supplier_id)
-- VALUES ('Vitamin A', 'A vitamin supplement.', 13.00, 500, 100, 2500, 1),
-- 	('Tylenol', 'For headaches', 24.00, 600, 100, 3424, 1),
--     ('Kryptonite', '', 100.00, 3000, 200, 2342, 2);
--     
-- INSERT INTO transaction (customer_id, product_id, employee_id, date)
-- VALUES (1, 2, 2, '2021-10-11'),
-- 	(2, 1, 1, '2021-9-21'),
--     (3, 3, 1, '2021-7-12');


