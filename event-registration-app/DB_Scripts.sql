--Scripts to Create Schema or DB "-
CREATE DATABASE `spk-mysql-db`;

-- Scripts to Create DB Table :-

CREATE TABLE `audience` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `birth_date` datetime NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
