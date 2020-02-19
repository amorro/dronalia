CREATE DATABASE  IF NOT EXISTS `dronalia` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dronalia`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: dronalia
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `almacenes`
--

DROP TABLE IF EXISTS `almacenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `almacenes` (
  `alm_id` int NOT NULL AUTO_INCREMENT,
  `alm_name` varchar(45) DEFAULT NULL,
  `alm_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`alm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `almacenes`
--

LOCK TABLES `almacenes` WRITE;
/*!40000 ALTER TABLE `almacenes` DISABLE KEYS */;
INSERT INTO `almacenes` VALUES (1,'Palma','Direccio 1'),(2,'Inca','Direccio 2'),(3,'Manacor','Direccio 3');
/*!40000 ALTER TABLE `almacenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drones`
--

DROP TABLE IF EXISTS `drones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drones` (
  `dro_id` int NOT NULL AUTO_INCREMENT,
  `dro_nombre` varchar(45) DEFAULT NULL,
  `dro_ejes` varchar(45) DEFAULT NULL,
  `dro_medida` varchar(45) DEFAULT NULL,
  `dro_categoria` enum('BASICO','AVANZADO','PROFESIONAL') DEFAULT NULL,
  `dro_color` enum('NEGRO','BLANCO','ROJO') DEFAULT NULL,
  `dro_precio_base` double DEFAULT NULL,
  `dro_foto` varchar(45) DEFAULT NULL,
  `dro_foto2` varchar(45) DEFAULT NULL,
  `dro_foto3` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drones`
--

LOCK TABLES `drones` WRITE;
/*!40000 ALTER TABLE `drones` DISABLE KEYS */;
INSERT INTO `drones` VALUES (1,'DR_B10','2','20x3x8','BASICO','NEGRO',50,'/img/drones/DR_B10.jpg','/img/drones/DR_B10.2.jpg','/img/drones/DR_B10.3.jpg'),(2,'DR_B20','4','20x18x8','BASICO','BLANCO',60,'/img/drones/DR_B20.jpg','/img/drones/DR_B20.2.jpg','/img/drones/DR_B20.3.jpg'),(3,'DR_A35','4','22x20x8','AVANZADO','NEGRO',70,'/img/drones/DR_A35.jpg','/img/drones/DR_A35.2.jpg','/img/drones/DR_A35.2.jpg'),(4,'DR_A46','4','25x23x10','AVANZADO','ROJO',90,'/img/drones/DR_A46.jpg','/img/drones/DR_A46.2.jpg','/img/drones/DR_A46.2.jpg'),(5,'DR_P78','6','27x25x10','PROFESIONAL','NEGRO',120,'/img/drones/DR_P78.jpg','/img/drones/DR_P78.2.jpg','/img/drones/DR_P78.2.jpg'),(6,'DR_P96','2','30x28x10','PROFESIONAL','BLANCO',150,'/img/drones/DR_P96.jpg','/img/drones/DR_P96.2.jpg','/img/drones/DR_P96.3.jpg');
/*!40000 ALTER TABLE `drones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturas` (
  `fac_id` int NOT NULL,
  `fac_use_email` varchar(45) NOT NULL,
  `fac_fecha` date NOT NULL,
  `fac_total` double NOT NULL,
  PRIMARY KEY (`fac_id`),
  KEY `fac_use_email_FK_idx` (`fac_use_email`),
  CONSTRAINT `fac_use_email_FK` FOREIGN KEY (`fac_use_email`) REFERENCES `users` (`use_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lin_factura`
--

DROP TABLE IF EXISTS `lin_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lin_factura` (
  `lin_fac_id` int NOT NULL,
  `lin_id` int NOT NULL,
  `lin_producto` varchar(45) NOT NULL,
  `lin_precio_prod` double NOT NULL,
  PRIMARY KEY (`lin_id`,`lin_fac_id`),
  KEY `lin_fac_id_FK_idx` (`lin_fac_id`),
  CONSTRAINT `lin_fac_id_FK` FOREIGN KEY (`lin_fac_id`) REFERENCES `facturas` (`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lin_factura`
--

LOCK TABLES `lin_factura` WRITE;
/*!40000 ALTER TABLE `lin_factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `lin_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skins`
--

DROP TABLE IF EXISTS `skins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skins` (
  `ski_id` int NOT NULL,
  `ski_tematica` enum('VIDEOJUEGOS','NATURALEZA','PELICULA') DEFAULT NULL,
  `ski_nombre` varchar(45) DEFAULT NULL,
  `ski_foto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ski_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skins`
--

LOCK TABLES `skins` WRITE;
/*!40000 ALTER TABLE `skins` DISABLE KEYS */;
/*!40000 ALTER TABLE `skins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `sto_alm_id` int NOT NULL,
  `sto_id` int NOT NULL AUTO_INCREMENT,
  `sto_modelo` varchar(20) DEFAULT NULL,
  `sto_disponibles` int DEFAULT NULL,
  `sto_estanteria` varchar(20) DEFAULT NULL,
  `sto_estante` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sto_id`,`sto_alm_id`),
  KEY `alm_sto_fk_idx` (`sto_alm_id`),
  CONSTRAINT `alm_sto_fk` FOREIGN KEY (`sto_alm_id`) REFERENCES `almacenes` (`alm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,1,'DR_B10',30,'7','2'),(2,1,'DR_A46',20,'4','3'),(3,1,'DR_B20',19,'3','4'),(1,2,'DR_A35',16,'6','4'),(2,2,'DR_P78',12,'1','3'),(3,3,'DR_P96',25,'5','3');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipus_skin`
--

DROP TABLE IF EXISTS `tipus_skin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipus_skin` (
  `tsk_id` int NOT NULL,
  `tsk_descripcion` varchar(45) NOT NULL,
  `tsk_precio` double DEFAULT NULL,
  PRIMARY KEY (`tsk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipus_skin`
--

LOCK TABLES `tipus_skin` WRITE;
/*!40000 ALTER TABLE `tipus_skin` DISABLE KEYS */;
INSERT INTO `tipus_skin` VALUES (1,'MAPA',72),(2,'LOGO',10.5);
/*!40000 ALTER TABLE `tipus_skin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `use_email` varchar(45) NOT NULL,
  `use_userName` varchar(45) NOT NULL,
  `use_name` varchar(45) NOT NULL,
  `use_surname` varchar(45) NOT NULL,
  `use_passwr` varchar(80) NOT NULL,
  PRIMARY KEY (`use_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin','admin','admin','admin','8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918'),('alex@gmail.com','Alex','Alex','M','a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3'),('fdj00@iesemilidarder.com','FDJ','Francis','Daniele Juncosa','123qweASD'),('lrc00@iesemilidarder.com','LRC','Lluis','Roca Cañellas','123qweASD');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-19  2:06:58
