DROP TABLE IF EXISTS `map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `map` (
  `IDmap` int(11) NOT NULL AUTO_INCREMENT,
  `map`        varchar(256),
  PRIMARY KEY (`IDmap`)
  ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `pictures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pictures` (
  `IDpictures` int(11) NOT NULL AUTO_INCREMENT,
  `pictures`   blob(256),
  PRIMARY KEY (`IDpictures`)
  ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;



INSERT INTO `map` VALUES (1,'');

INSERT INTO `pictures` VALUES (1,);
