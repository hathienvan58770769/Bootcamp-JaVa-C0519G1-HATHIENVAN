-- truy van AND:
select productCode, productName, buyPrice, quantityInStock from classicmodels.products
where buyPrice > 56.76 and quantityInStock > 10;

-- Truy van AND trong INNER JOIN :
select productCode, productName, buyPrice,textDescription from classicmodels.products
inner join classicmodels.productlines
on classicmodels.products.productLine = classicmodels.productlines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;

-- Truy Van OR:
select productCode, productName, buyPrice, quantityInStock, productVendor, productLine 
from classicmodels.products
where productLine = 'Classic Cars' or productVendor = 'Classic Metal Creations';

-- Truy van du lieu tu nhieu bang :
-- Su dung inner join :
select classicmodels.customers.customerNumber, customerName, phone, paymentDate, amount
from classicmodels.customers 
inner join classicmodels.payments
on classicmodels.customers.customerNumber = classicmodels.payments.customerNumber
where city = 'Las Vegas';

-- Sử dụng left join để lấy dữ liệu từ hai bảng:
select classicmodels.customers.customerNumber, classicmodels.customers.customerName, 
classicmodels.orders.orderNumber, classicmodels.orders.status
from classicmodels.customers
left join classicmodels.orders
on classicmodels.customers.customerNumber = classicmodels.orders.customerNumber;

-- truy vấn tìm tất cả khách hàng chưa đặt hàng bất kỳ sản phẩm nào :
select classicmodels.customers.customerNumber, classicmodels.customers.customerName, 
classicmodels.orders.orderNumber, classicmodels.orders.status
from classicmodels.customers
left join classicmodels.orders
on classicmodels.customers.customerNumber = classicmodels.orders.customerNumber
where orderNumber is null;

-- truy van với cột status:
select status from classicmodels.orders;

-- truy van group by với cột status :
select status from classicmodels.orders
group by status;

-- Sử dụng các hàm tập hợp với mệnh đề group by :
-- sử dụng hàm COUNT với mệnh đề GROUP BY để biết có bao nhiêu đơn đặt hàng trong mỗi status:
select status , count(*) as 'so luong status'
from classicmodels.orders
group by status; 

--  Sử dụng group by với hàm tập hợp truy vấn trên hai bảng (orders và orderdetails):
select status, sum(quantityOrdered * priceEach) as amount
from classicmodels.orders
inner join classicmodels.orderdetails on classicmodels.orders.ordernumber = classicmodels.orderdetails.ordernumber
group by status;

-- truy vấn, tính tổng tiền của từng đơn hàng :
select orderNumber , sum(quantityOrdered * priceEach) as total
from classicmodels.orderdetails
group by orderNumber;

-- GROUP BY với mệnh đề HAVING: Tổng doanh thu của những năm lớn hơn năm 2003:
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from classicmodels.orders
inner join classicmodels.orderdetails on classicmodels.orders.orderNumber = classicmodels.orderdetails.orderNumber
where status = 'shipped'
group by year 
having year > 2003;
