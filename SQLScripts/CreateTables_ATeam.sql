CREATE DATABASE Kainos_A;

use Kainos_A;

CREATE TABLE `roles` (
  `roleID` smallint NOT NULL AUTO_INCREMENT,
  `roleName` varchar(100) NOT NULL,
  `roleDesc` text NOT NULL,
  `datePosted` date not null,
  `hours` varchar(10) not null,
  `location` varchar(100) not null,
  `bandID` tinyint NOT NULL,
  `capabilityID` tinyint NOT NULL,
  `link` varchar(1000) NOT NULL,
  PRIMARY KEY (`roleID`),
  CONSTRAINT `band_to_role_FK` FOREIGN KEY (`bandID`) REFERENCES `band` (`bandID`),
  CONSTRAINT `capability_to_role_FK` FOREIGN KEY (`capabilityID`) REFERENCES `capability` (`capabilityID`)
);

CREATE TABLE `capability` (
  `capabilityID` tinyint NOT NULL AUTO_INCREMENT,
  `capability` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`capabilityID`)
);

CREATE TABLE `band` (
  `bandID` tinyint NOT NULL AUTO_INCREMENT,
  `bandName` varchar(40) DEFAULT NULL,
  `bandExpectations` text,
  PRIMARY KEY (`bandID`)
);