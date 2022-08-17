DROP TABLE IF EXISTS `cientificos`;
SET character_set_client = utf8mb4 ;

CREATE TABLE `cientificos` (
  `id` varchar(8) NOT NULL,
  `nom_apels` nvarchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `cientificos` WRITE;
/*!40000 ALTER TABLE `cientificos` DISABLE KEYS */;
INSERT INTO `cientificos` VALUES ('32128431','cientifico 1'),('32128432','cientifico 2'),('32128433','cientifico 3'),('32128434','cientifico 4');
/*!40000 ALTER TABLE `cientificos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proyectos` (
	id char(4) not null,
	nombre nvarchar(255),
	horas int,
    primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
INSERT INTO `proyectos` VALUES ('SD4D','proyectos 1',4),('FWE1','proyectos 2',7),('4CFE','proyectos 3',2),('WDQS','proyectos 4',6);
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignado_a`
--

DROP TABLE IF EXISTS `asignado_a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `asignado_a` (
	id int not null auto_increment,
	cientifico varchar(8),
    proyecto char(4),
    primary key(id),
	CONSTRAINT cientificos_fk FOREIGN KEY (cientifico) REFERENCES cientificos (id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT proyectos_fk FOREIGN KEY (proyecto) REFERENCES proyectos (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignado_a`
--

LOCK TABLES `asignado_a` WRITE;
/*!40000 ALTER TABLE `asignado_a` DISABLE KEYS */;
INSERT INTO `asignado_a` VALUES (1,'32128431','SD4D'),(2,'32128432','WDQS'),(3,'32128433','FWE1'),(4,'32128434','4CFE');
/*!40000 ALTER TABLE `asignado_a` ENABLE KEYS */;
UNLOCK TABLES;