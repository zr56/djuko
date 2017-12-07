/*
SQLyog Professional v12.4.1 (64 bit)
MySQL - 10.1.22-MariaDB : Database - djuko_04
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`djuko_04` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `djuko_04`;

/*Table structure for table `ikan` */

DROP TABLE IF EXISTS `ikan`;

CREATE TABLE `ikan` (
  `id_ikan` int(5) NOT NULL AUTO_INCREMENT,
  `id_perawatan` int(5) NOT NULL,
  `kekenyangan` int(10) NOT NULL,
  `umur` int(10) NOT NULL,
  `daerah` int(5) DEFAULT '1',
  PRIMARY KEY (`id_ikan`),
  KEY `id_perawatan` (`id_perawatan`),
  CONSTRAINT `id_perawatan` FOREIGN KEY (`id_perawatan`) REFERENCES `perawatan` (`id_perawatan`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;

/*Data for the table `ikan` */

insert  into `ikan`(`id_ikan`,`id_perawatan`,`kekenyangan`,`umur`,`daerah`) values 
(22,9,30,1,1),
(23,10,30,1,1),
(24,11,30,1,1),
(25,12,30,1,1),
(29,8,65,3,2),
(30,8,60,1,3),
(43,13,30,7,1),
(44,14,30,3,1),
(45,8,30,1,1),
(46,15,50,3,1);

/*Table structure for table `perawatan` */

DROP TABLE IF EXISTS `perawatan`;

CREATE TABLE `perawatan` (
  `id_perawatan` int(5) NOT NULL AUTO_INCREMENT,
  `id_player` int(5) NOT NULL,
  `stok_makanan` int(10) NOT NULL,
  `stok_obat` int(10) NOT NULL,
  PRIMARY KEY (`id_perawatan`),
  KEY `id_player` (`id_player`),
  CONSTRAINT `id_player` FOREIGN KEY (`id_player`) REFERENCES `player` (`id_player`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `perawatan` */

insert  into `perawatan`(`id_perawatan`,`id_player`,`stok_makanan`,`stok_obat`) values 
(8,8,14,6),
(9,9,10,1),
(10,10,10,1),
(11,11,10,1),
(12,12,10,1),
(13,13,10,1),
(14,14,10,1),
(15,15,19,10);

/*Table structure for table `player` */

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `id_player` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `uang` varchar(20) NOT NULL DEFAULT '1000',
  `level` int(20) DEFAULT '1',
  PRIMARY KEY (`id_player`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `player` */

insert  into `player`(`id_player`,`username`,`password`,`uang`,`level`) values 
(8,'basir','b','18000',2),
(9,'wima','w','1000',1),
(10,'luky','l','1000',1),
(11,'meili','m','1000',1),
(12,'hendra','h','1000',1),
(13,'gavin','g','2000',1),
(14,'noni','noni','2000',1),
(15,'3d','3d','5000',1);

/* Trigger structure for table `perawatan` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `perawatan_ai` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `perawatan_ai` AFTER INSERT ON `perawatan` FOR EACH ROW insert into `ikan` (`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) values (null, new.id_perawatan, 30, 1) */$$


DELIMITER ;

/* Trigger structure for table `player` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `p_ai` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `p_ai` AFTER INSERT ON `player` FOR EACH ROW INSERT INTO `perawatan`(`id_perawatan`, `id_player`, `stok_makanan`, `stok_obat`) VALUES (null, new.id_player, 10,1) */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
