-- MySQL dump 10.13  Distrib 8.0.16, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: furama_resort
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Accommodation`
--

DROP TABLE IF EXISTS `Accommodation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Accommodation` (
  `accommodation_name` varchar(50) NOT NULL,
  `number_of_accommodation` int(11) NOT NULL,
  PRIMARY KEY (`accommodation_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accommodation`
--

LOCK TABLES `Accommodation` WRITE;
/*!40000 ALTER TABLE `Accommodation` DISABLE KEYS */;
INSERT INTO `Accommodation` VALUES ('HOUSE',4),('TENT',3),('VILLA',5);
/*!40000 ALTER TABLE `Accommodation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Accommodation_Order`
--

DROP TABLE IF EXISTS `Accommodation_Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Accommodation_Order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` varchar(15) DEFAULT NULL,
  `vila_id` varchar(50) DEFAULT NULL,
  `tent_id` varchar(50) DEFAULT NULL,
  `house_id` varchar(50) DEFAULT NULL,
  `accommodation_name` varchar(50) DEFAULT NULL,
  `date_of_hire` date NOT NULL,
  `check_out_date` date NOT NULL,
  `price` float NOT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  `employees_id` varchar(15) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `price_date` date DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `payment_method` (`payment_method`),
  KEY `customer_id` (`customer_id`),
  KEY `vila_id` (`vila_id`),
  KEY `tent_id` (`tent_id`),
  KEY `house_id` (`house_id`),
  KEY `accommodation_name` (`accommodation_name`),
  CONSTRAINT `accommodation_order_ibfk_1` FOREIGN KEY (`payment_method`) REFERENCES `payment` (`payment_method`),
  CONSTRAINT `accommodation_order_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`),
  CONSTRAINT `accommodation_order_ibfk_3` FOREIGN KEY (`vila_id`) REFERENCES `vila` (`vila_id`),
  CONSTRAINT `accommodation_order_ibfk_4` FOREIGN KEY (`tent_id`) REFERENCES `tent` (`tent_id`),
  CONSTRAINT `accommodation_order_ibfk_5` FOREIGN KEY (`house_id`) REFERENCES `house` (`house_id`),
  CONSTRAINT `accommodation_order_ibfk_6` FOREIGN KEY (`accommodation_name`) REFERENCES `accommodation` (`accommodation_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accommodation_Order`
--

LOCK TABLES `Accommodation_Order` WRITE;
/*!40000 ALTER TABLE `Accommodation_Order` DISABLE KEYS */;
INSERT INTO `Accommodation_Order` VALUES (1,'KH01','V01',NULL,NULL,'VILLA','2019-07-02','2019-07-05',1200000,'VISA','NV01','PAID','2019-07-03'),(2,'KH02',NULL,NULL,'H04','HOUSE','2019-07-03','2019-07-10',4800000,'VISA','NV02','PAID','2019-07-04'),(3,'KH03',NULL,'T02',NULL,'TENT','2019-07-01','2019-07-07',1050000,'MASTER CARD','NV03','UNPAID',NULL),(4,'KH04','V05',NULL,NULL,'VILLA','2019-07-03','2019-07-12',3500000,'VISA','NV04','PAID','2019-07-12'),(5,'KH05',NULL,NULL,'H02','HOUSE','2019-07-02','2019-07-09',2800000,'MASTER CARD','NV01','UNPAID',NULL);
/*!40000 ALTER TABLE `Accommodation_Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CheckInSwimmingPool`
--

DROP TABLE IF EXISTS `CheckInSwimmingPool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `CheckInSwimmingPool` (
  `swimming_id` varchar(15) NOT NULL,
  `open_time` time NOT NULL,
  PRIMARY KEY (`swimming_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CheckInSwimmingPool`
--

LOCK TABLES `CheckInSwimmingPool` WRITE;
/*!40000 ALTER TABLE `CheckInSwimmingPool` DISABLE KEYS */;
INSERT INTO `CheckInSwimmingPool` VALUES ('SW','06:00:00');
/*!40000 ALTER TABLE `CheckInSwimmingPool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customers`
--

DROP TABLE IF EXISTS `Customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Customers` (
  `customer_id` varchar(15) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `bỉthday` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `license_plates` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `license_plates` (`license_plates`),
  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`license_plates`) REFERENCES `vehicle` (`license_plates`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers`
--

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;
INSERT INTO `Customers` VALUES ('KH01','Le Thi Hang','1999-06-05','Thanh Khe','0734268455','43A2-328847'),('KH02','Tran Thi My','1990-07-03','Hai Chau','0937462465','74C1-566776'),('KH03','Nguyen Thao Ly','1997-09-08','Lien Chieu','0934354366','82B1-273462'),('KH04','Truong Thi Vy','1986-01-17','Ngu Hanh Son','0343554344','89H1-435677'),('KH05','Ha Thi Thuy','1999-03-09','Lien Chieu','0738543534','92D1-324244');
/*!40000 ALTER TABLE `Customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employees`
--

DROP TABLE IF EXISTS `Employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Employees` (
  `employees_id` varchar(15) NOT NULL,
  `employees_name` varchar(50) NOT NULL,
  `bỉthday` date NOT NULL,
  `year_olds` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `job_tilte` varchar(100) NOT NULL,
  `Salary` double NOT NULL,
  `reports_to` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`employees_id`),
  KEY `reports_to` (`reports_to`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`reports_to`) REFERENCES `employees` (`employees_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employees`
--

LOCK TABLES `Employees` WRITE;
/*!40000 ALTER TABLE `Employees` DISABLE KEYS */;
INSERT INTO `Employees` VALUES ('NV01','Truong Thi Han','1985-07-12',34,'Thanh Khe','0384384785','Nhan Vien',6000000,'QL01'),('NV02','Le Van Nam','1996-08-24',23,'Hai Chau','0734246533','Nhan Vien',5500000,'QL01'),('NV03','Nguyen Thi Truc','1982-09-03',37,'Ngu Hanh Son','0823244355','Nhan Vien',4500000,'QL01'),('NV04','Nguyen Van Thanh','1993-08-16',26,'Hai Chau','0732343245','Nhan Vien',5000000,'QL01'),('QL01','Tran Thanh Vy','1991-12-09',28,'Lien Chieu','0983274324','Quan Ly',12000000,NULL);
/*!40000 ALTER TABLE `Employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `House`
--

DROP TABLE IF EXISTS `House`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `House` (
  `house_id` varchar(50) NOT NULL,
  `house_name` varchar(50) NOT NULL,
  `priceHouse` float NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`house_id`),
  UNIQUE KEY `house_name` (`house_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `House`
--

LOCK TABLES `House` WRITE;
/*!40000 ALTER TABLE `House` DISABLE KEYS */;
INSERT INTO `House` VALUES ('H01','HOUSE 1',500000,'empty'),('H02','HOUSE 2',400000,'full'),('H03','HOUSE 3',550000,'empty'),('H04','HOUSE 4',600000,'full');
/*!40000 ALTER TABLE `House` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Payment`
--

DROP TABLE IF EXISTS `Payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Payment` (
  `payment_method` varchar(255) NOT NULL,
  PRIMARY KEY (`payment_method`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Payment`
--

LOCK TABLES `Payment` WRITE;
/*!40000 ALTER TABLE `Payment` DISABLE KEYS */;
INSERT INTO `Payment` VALUES ('MASTER CARD'),('VISA');
/*!40000 ALTER TABLE `Payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tent`
--

DROP TABLE IF EXISTS `Tent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Tent` (
  `tent_id` varchar(50) NOT NULL,
  `tent_name` varchar(50) NOT NULL,
  `priceTent` float NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`tent_id`),
  UNIQUE KEY `tent_name` (`tent_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tent`
--

LOCK TABLES `Tent` WRITE;
/*!40000 ALTER TABLE `Tent` DISABLE KEYS */;
INSERT INTO `Tent` VALUES ('T01','TENT 1',200000,'empty'),('T02','TENT 2',150000,'full'),('T03','TENT 3',250000,'empty');
/*!40000 ALTER TABLE `Tent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vehicle`
--

DROP TABLE IF EXISTS `Vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Vehicle` (
  `license_plates` varchar(15) NOT NULL,
  `date_in` date NOT NULL,
  `date_out` date NOT NULL,
  PRIMARY KEY (`license_plates`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vehicle`
--

LOCK TABLES `Vehicle` WRITE;
/*!40000 ALTER TABLE `Vehicle` DISABLE KEYS */;
INSERT INTO `Vehicle` VALUES ('43A2-328847','2019-07-02','2019-07-05'),('74C1-566776','2019-07-03','2019-07-10'),('82B1-273462','2019-07-01','2019-07-07'),('89H1-435677','2019-07-03','2019-07-12'),('92D1-324244','2019-07-02','2019-06-09');
/*!40000 ALTER TABLE `Vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vila`
--

DROP TABLE IF EXISTS `Vila`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Vila` (
  `vila_id` varchar(50) NOT NULL,
  `vila_name` varchar(50) NOT NULL,
  `priceVila` float NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`vila_id`),
  UNIQUE KEY `vila_name` (`vila_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vila`
--

LOCK TABLES `Vila` WRITE;
/*!40000 ALTER TABLE `Vila` DISABLE KEYS */;
INSERT INTO `Vila` VALUES ('V01','VILLA 1',300000,'full'),('V02','VILLA 2',400000,'empty'),('V03','VILLA 3',250000,'empty'),('V04','VILLA 4',500000,'empty'),('V05','VILLA 5',350000,'full');
/*!40000 ALTER TABLE `Vila` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-14 10:40:31
