CREATE DATABASE  IF NOT EXISTS `jtd_db1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jtd_db1`;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`roleId`),
  KEY `roleId` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `roleId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `userId` (`userId`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `User_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'fmeaadmin','fmea123',1,1),(2,'fmeauseruser','fmea123',1,2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


CREATE TABLE `bussinessunit` (
  `BusUnitID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EngagementID` int(10),
  `BusUnitName` varchar(50) DEFAULT NULL,
  `Description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BusUnitID`),
  KEY `BusUnitID` (`BusUnitID`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

CREATE TABLE `Engagement` (
  `EngagementID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EngagementName` varchar(100) DEFAULT NULL,
  `SectorID` int(10) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`EngagementID`),
  KEY `EngagementID` (`EngagementID`)
  ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

CREATE TABLE `Sectors` (
  `SectorID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SectorName` varchar(50) DEFAULT NULL,
  `Desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SectorID`),
  KEY `SectorID` (`SectorID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



CREATE TABLE `CauseCode` (
  `CauseCodeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EngagementID` int(10),
  `CauseCode` varchar(50) DEFAULT NULL,
  `KeyWord1` varchar(50) DEFAULT NULL,
  `KeyWord2` varchar(50) DEFAULT NULL,
  `KeyWord3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CauseCodeID`),
  KEY `CauseCodeID` (`CauseCodeID`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

CREATE TABLE `Application` (
  `applicationID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `appName` varchar(50) DEFAULT NULL,
  `engagementID` int(10),
  `busUnitID` int(10),
  `technology` varchar(50) DEFAULT NULL,
  `database` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`applicationID`),
  KEY `applicationID` (`applicationID`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


CREATE TABLE `RAW_REPORT` (
  `Date` varchar(250) DEFAULT NULL,
  `Impressions` varchar(100) DEFAULT NULL,
  `Clicks` varchar(250) DEFAULT NULL,
  `Earning` varchar(250) DEFAULT NULL
  );
