CREATE TABLE furama_resort.Accommodation_Order(
customer_id VARCHAR(15),
vila_name VARCHAR(50) UNIQUE,
house_name VARCHAR(50) UNIQUE,
date_of_hire DATE NOT NULL,
check_out_date DATE NOT NULL,
PRIMARY KEY (customer_id, house_name, vila_name),
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
FOREIGN KEY (vila_name) REFERENCES Vila(vila_name),
FOREIGN KEY (house_name) REFERENCES House(house_name)
 );

CREATE TABLE furama_resort.Vila (
vila_id VARCHAR(50)  NOT NULL PRIMARY KEY,
vila_name  VARCHAR(50)  UNIQUE NOT NULL,
priceVila FLOAT NOT NULL
);

CREATE TABLE furama_resort.Tent (
vila_id VARCHAR(50)  NOT NULL PRIMARY KEY,
vila_name  VARCHAR(50)  UNIQUE NOT NULL,
priceVila FLOAT NOT NULL
);
CREATE TABLE furama_resort.House (
house_id VARCHAR(50)  NOT NULL PRIMARY KEY,
house_name  VARCHAR(50) UNIQUE NOT NULL,
priceHouse FLOAT NOT NULL
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
FOREIGN KEY (reports_to) REFERENCES Employees( employees_id)
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
price FLOAT NOT NULL,
borrowOrder_type VARCHAR(100),
employees_id VARCHAR(15) ,
license_plates VARCHAR(15),
 payment_method  VARCHAR(255),
FOREIGN KEY (payment_method) REFERENCES Payment(payment_method),
FOREIGN KEY (employees_id) REFERENCES Employees(employees_id),
FOREIGN KEY (license_plates) REFERENCES Vehicle(license_plates)
);
CREATE TABLE furama_resort.BorrowOrder(
customer_id  VARCHAR(15) ,
borrowOrder_type VARCHAR(100),
cate_number  VARCHAR(15),
borrowDate DATE NOT NULL,
returnDate DATE NOT NULL,
PRIMARY KEY (customer_id , cate_number),
 FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
  FOREIGN KEY (cate_number) REFERENCES Category(cate_number)
);

CREATE TABLE furama_resort.Book (
book_id VARCHAR(15) PRIMARY KEY,
book_name VARCHAR(255) NOT NULL,
author VARCHAR(100) NOT NULL,
publish_year INT(5) NOT NULL,
cate_number  VARCHAR(15) ,
FOREIGN KEY (cate_number ) REFERENCES Category(cate_number )
);
CREATE TABLE furama_resort.Video (
video_id VARCHAR(15) PRIMARY KEY,
video_name VARCHAR(255) NOT NULL,
author VARCHAR(100) NOT NULL,
publish_year INT(5) NOT NULL,
cate_number  VARCHAR(15) ,
FOREIGN KEY (cate_number ) REFERENCES Category(cate_number )
);

CREATE TABLE furama_resort.Category(
cate_number  VARCHAR(255) NOT NULL PRIMARY KEY
);
CREATE TABLE furama_resort.Payment(
 payment_method VARCHAR(255) NOT NULL PRIMARY KEY
);
INSERT INTO `furama_resort`.`Vehicle` (`license_plates`) VALUES ('82B-233244');
INSERT INTO `furama_resort`.`Vehicle` (`license_plates`) VALUES ('92B-345222');
INSERT INTO `furama_resort`.`Vehicle` (`license_plates`) VALUES ('43A1-323348');
INSERT INTO `furama_resort`.`Vehicle` (`license_plates`) VALUES ('29D1-123098');