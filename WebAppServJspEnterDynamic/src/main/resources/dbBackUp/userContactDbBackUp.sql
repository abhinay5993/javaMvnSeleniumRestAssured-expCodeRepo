-- MySQL dump 10.13  Distrib 8.0.30, for Linux (x86_64)
--
-- Host: localhost    Database: UserContactMS
-- ------------------------------------------------------
-- Server version	8.0.30-0ubuntu0.20.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminUser_info`
--

DROP TABLE IF EXISTS `adminUser_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adminUser_info` (
  `ad_Id` int NOT NULL AUTO_INCREMENT,
  `ad_userName` varchar(255) NOT NULL,
  `ad_pwd` varchar(255) NOT NULL,
  PRIMARY KEY (`ad_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminUser_info`
--

LOCK TABLES `adminUser_info` WRITE;
/*!40000 ALTER TABLE `adminUser_info` DISABLE KEYS */;
INSERT INTO `adminUser_info` VALUES (1,'admin@gmail.com','admin@123'),(2,'ad@gmail.com','pass@123');
/*!40000 ALTER TABLE `adminUser_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userContact_details`
--

DROP TABLE IF EXISTS `userContact_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userContact_details` (
  `user_Id` int NOT NULL AUTO_INCREMENT,
  `user_Name` varchar(255) NOT NULL,
  `user_EmailId` varchar(255) NOT NULL,
  `user_MobileNo` varchar(255) NOT NULL,
  `user_Country` varchar(255) NOT NULL,
  PRIMARY KEY (`user_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userContact_details`
--

LOCK TABLES `userContact_details` WRITE;
/*!40000 ALTER TABLE `userContact_details` DISABLE KEYS */;
INSERT INTO `userContact_details` VALUES (30,'Abhinay L','abhinay5993@gmail.com','9566089853','CHENNAI'),(32,'Basul','basul@itc.com','9547367438','Bangalur'),(33,'Atif Aslam','adeez@co.in','4500025000','ISLAMABAD');
/*!40000 ALTER TABLE `userContact_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-02  2:01:15
