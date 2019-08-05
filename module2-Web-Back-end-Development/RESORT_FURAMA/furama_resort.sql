CREATE TABLE furama_resort.Accommodation_Order(
order_id int not null auto_increment primary key ,
customer_id VARCHAR(15),
vila_id VARCHAR(50),
tent_id VARCHAR(50),
house_id VARCHAR(50),
accommodation_name VARCHAR(50),
date_of_hire DATE NOT NULL,
check_out_date DATE NOT NULL,
price FLOAT NOT NULL,
payment_method  VARCHAR(255),
employees_id VARCHAR(15),
status VARCHAR(50),
FOREIGN KEY (payment_method) REFERENCES Payment(payment_method),
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
FOREIGN KEY (vila_id) REFERENCES Vila(vila_id),
FOREIGN KEY (tent_id) REFERENCES Tent(tent_id),
FOREIGN KEY (house_id) REFERENCES House(house_id),
FOREIGN KEY (accommodation_name) REFERENCES Accommodation(accommodation_name)
);
CREATE TABLE furama_resort.Accommodation(
accommodation_name VARCHAR(50) NOT NULL PRIMARY KEY,
number_of_accommodation INT NOT NULL
);
CREATE TABLE furama_resort.Vila (
vila_id VARCHAR(50)  NOT NULL PRIMARY KEY,
vila_name  VARCHAR(50)  UNIQUE NOT NULL,
priceVila FLOAT NOT NULL,
status VARCHAR(50)

);
ALTER TABLE furama_resort.Vila
ADD COLUMN accommodation_name VARCHAR(50) NOT NULL,
ADD FOREIGN KEY (accommodation_name) REFERENCES Accommodation(accommodation_name);

CREATE TABLE furama_resort.Tent (
tent_id VARCHAR(50)  NOT NULL PRIMARY KEY,
tent_name  VARCHAR(50)  UNIQUE NOT NULL,
priceTent FLOAT NOT NULL,
status VARCHAR(50)
);
CREATE TABLE furama_resort.House (
house_id VARCHAR(50)  NOT NULL PRIMARY KEY,
house_name  VARCHAR(50) UNIQUE NOT NULL,
priceHouse FLOAT NOT NULL,
status VARCHAR(50)
);
CREATE TABLE furama_resort.CheckInSwimmingPool(
swimming_id VARCHAR(15) NOT NULL PRIMARY KEY,
open_time TIME NOT NULL 
);
CREATE TABLE furama_resort.Employees (
employees_id VARCHAR(15) NOT NULL PRIMARY KEY,
employees_name VARCHAR(50) NOT NULL,
bỉthday DATE NOT NULL,
year_olds INT NOT NULL,
address VARCHAR(255) NOT NULL,
phone VARCHAR(11) NOT NULL,
job_tilte VARCHAR(100) NOT NULL,
Salary DOUBLE NOT NULL,
reports_to VARCHAR(100) ,
FOREIGN KEY (reports_to) REFERENCES Employees(employees_id)
);

CREATE TABLE furama_resort.Vehicle (
license_plates VARCHAR(15) NOT NULL PRIMARY KEY,
date_in DATE NOT NULL,
date_out DATE NOT NULL
);

CREATE TABLE furama_resort.Customers (
customer_id VARCHAR(15) NOT NULL PRIMARY KEY,
customer_name VARCHAR(50) NOT NULL,
bỉthday DATE NOT NULL,
address VARCHAR(255) NOT NULL,
phone VARCHAR(11) NOT NULL,
license_plates VARCHAR(15),
swimming_id VARCHAR(15),
FOREIGN KEY (license_plates) REFERENCES Vehicle(license_plates),
FOREIGN KEY (swimming_id) REFERENCES CheckInSwimmingPool(swimming_id)
);

CREATE TABLE furama_resort.Payment(
 payment_method VARCHAR(255) NOT NULL PRIMARY KEY
);
--
--
SELECT * FROM furama_resort.House
WHERE STATUS = 'FULL';
--
SELECT * FROM furama_resort.Vila
where status like 'empty';
--
SELECT * FROM furama_resort.Tent
where status like 'empty';
--
-- employees
SELECT employees_id, employees_name, Salary FROM furama_resort.Employees
where Salary <= 5000000;

SELECT employees_id, employees_name,bỉthday, year_olds FROM furama_resort.Employees
where year_olds > 35;

SELECT employees_id, employees_name, bỉthday, year_olds FROM furama_resort.Employees
where year(bỉthday) < 1995 AND year(bỉthday) > 1980;

SELECT employees_id, employees_name,bỉthday, year_olds FROM furama_resort.Employees
where month(bỉthday) = 08;

-- customers
SELECT customer_id,customer_name,address FROM furama_resort.Customers
where address like 'Hai Chau';

SELECT customer_id,customer_name,bỉthday FROM furama_resort.Customers
where year(bỉthday) = 1990 ;

SELECT customer_id,customer_name,bỉthday FROM furama_resort.Customers
where month(bỉthday) = month(now()) AND day(bỉthday) = day(now());
-- virhicle
SELECT license_plates, date_in FROM furama_resort.Vehicle
where date_in = date(now());

-- 
SELECT * FROM furama_resort.Accommodation_Order
where status = 'PAID';
--
SELECT * FROM furama_resort.Accommodation_Order
where status = 'PAID' AND price_date = date(NOW());
--
SELECT * FROM furama_resort.Accommodation_Order
where payment_method = 'VISA';
--
SELECT * FROM furama_resort.Accommodation_Order
where payment_method = 'MASTER CARD';
--
SELECT * FROM furama_resort.Accommodation_Order
INNER join furama_resort.Customers
on Accommodation_Order.customer_id = Customers.customer_id;
--
SELECT Customers.customer_name, Accommodation_Order.price FROM furama_resort.Accommodation_Order
INNER join furama_resort.Customers
on Accommodation_Order.customer_id = Customers.customer_id
where Accommodation_Order.price >= 3000000 ;
--
select * FROM ((furama_resort.Accommodation_Order
INNER join furama_resort.Customers
on Accommodation_Order.customer_id = Customers.customer_id)
INNER join furama_resort.Employees
on Employees.employees_id = Accommodation_Order.employees_id)
where Accommodation_Order.payment_method like 'VISA';
--
SELECT  Customers.customer_id, Customers.customer_name, Accommodation_Order.price, 
Employees.employees_id, Accommodation_Order.status, 
Customers.bỉthday as birthday_custumer, Customers.phone as phone_customer 
FROM ((furama_resort.Accommodation_Order
INNER join furama_resort.Customers
on Accommodation_Order.customer_id = Customers.customer_id)
INNER join furama_resort.Employees
on Employees.employees_id = Accommodation_Order.employees_id);
--
--

















