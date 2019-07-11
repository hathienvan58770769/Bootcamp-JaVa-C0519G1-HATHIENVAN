create table Offices(
office_code varchar(10) not null primary key,
city varchar(50) not null,
phone_number varchar(50) not null,
address_line1 varchar(50) not null,
address_line2 varchar(50),
state varchar(50),
country varchar(50) not null,
postal_code varchar(15) not null
);
create table Employees(
employee_number int not null  primary key,
office_code varchar(10) not null references Offices(office_code),
last_name varchar(50) not null,
first_name varchar(50) not null,
email varchar(100) not null,
job_title varchar(50) not null
);
create table Customers(
customer_number int not null primary key,
employee_number int not null  references Employees(employee_number),
customer_name varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName  varchar(50) not null,
phone_number varchar(50) not null,
address_line1 varchar(50) not null,
address_line12 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(15) not null,
country varchar(50) not null,
creditLimit double
);
create table Payments(
payment_number int not null primary key,
customer_number int not null references Customers(customer_number),
check_number varchar(50) not null ,
payment_date date not null,
amount_money double
);
create table ProductsLine(
product_line varchar(50) not null primary key,
text_description text not null,
image text
);
create table Orders(
order_number int not null primary key, 
customer_number int not null references Customers(customer_number),
order_date date not null,
required_date date not null,
shipped_date date,
statuss varchar(15) not null,
comments text,
quantity_ordered int not null,
price_each double not null
);
create table Products(
product_code varchar(15) not null primary key,
product_line varchar(50) not null references ProductsLine(product_line),
product_name varchar(70) not null,
product_scale  varchar(10) not null,
product_vendor varchar(50) not null,
product_description text not null,
quantity_in_stock int not null,
buy_price double not null,
MSRP double not null
);
create table ProductsOrders(
customer_number int not null,
order_number int not null, 
primary key (customer_number, order_number),
foreign key (customer_number) references Customers(customer_number),
foreign key (order_number) references Orders(order_number)
);