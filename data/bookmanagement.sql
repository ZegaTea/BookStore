CREATE DATABASE  IF NOT EXISTS `bookmanagement` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bookmanagement`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bookmanagement
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `idBook` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 NOT NULL,
  `price` float NOT NULL,
  `author` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `publisher` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `introduction` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `imageLink` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idBook`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Chờ một ngày nắng',700,'Diệp Chi Linh','tudv','Đây là mô tả','Image/BookImg/1.jpg'),(2,'Chờ một ngày nắng',800,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/2.jpg'),(3,'Chờ một ngày nắng',300,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/3.jpg'),(4,'Chờ một ngày nắng',400,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/4.jpg'),(5,'Chờ một ngày nắng',500,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/5.jpg'),(6,'Chờ một ngày nắng',600,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/6.jpg'),(7,'Chờ một ngày nắng',700,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/7.jpg'),(8,'Chờ một ngày nắng',800,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/8.jpg'),(9,'Chờ một ngày nắng',900,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/9.jpg'),(10,'Chờ một ngày nắng',1000,'Diệp CHi Linh','tudv','Đây là mô tả','Image/BookImg/10.jpg');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `idCart` int(11) NOT NULL AUTO_INCREMENT,
  `totalPrice` float DEFAULT NULL,
  PRIMARY KEY (`idCart`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cartdetail`
--

DROP TABLE IF EXISTS `cartdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cartdetail` (
  `idBook` int(11) NOT NULL,
  `idCart` int(11) NOT NULL,
  `count` int(11) DEFAULT NULL,
  `totalCount` float DEFAULT NULL,
  PRIMARY KEY (`idBook`,`idCart`),
  CONSTRAINT `FK_DETAILS_BOOK` FOREIGN KEY (`idBook`) REFERENCES `book` (`idBook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_DETAILS_CART` FOREIGN KEY (`idBook`) REFERENCES `cart` (`idCart`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartdetail`
--

LOCK TABLES `cartdetail` WRITE;
/*!40000 ALTER TABLE `cartdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `cartdetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-05  0:46:30
