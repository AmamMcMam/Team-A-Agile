CREATE DATABASE Kainos_A;

use Kainos_A;

CREATE TABLE `role` (
  `roleID` smallint NOT NULL AUTO_INCREMENT,
  `roleName` varchar(100) NOT NULL,
  `roleDesc` text NOT NULL,
  `datePosted` date not null,
  `hours` varchar(10) not null,
  `location` varchar(100) not null,
  `bandID` tinyint NOT NULL,
  `capabilityID` tinyint NOT NULL,
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
  `bandName` varchar(40) NOT NULL,
  `bandExpectations` text,
  PRIMARY KEY (`bandID`)
);

CREATE TABLE `competency`(
    `competencyID` TINYINT NOT NULL AUTO_INCREMENT,
    `competencyName` varchar (40), 
    `competencyDescription` text,
    PRIMARY KEY (`competencyID`)
);

CREATE TABLE `competency_element`(
	`competencyElementID` TINYINT NOT NULL AUTO_INCREMENT,
    `competencyID` TINYINT NOT NULL,
    `elementName` varchar (40), 
    `bandID` TINYINT NOT NULL,
    `elementDescription` text,
    PRIMARY KEY (`competencyElementID`),
    CONSTRAINT `competency_element_to_competency_FK` FOREIGN KEY (`competencyID`) REFERENCES `competency` (`competencyID`),
    CONSTRAINT `band_to_competency_element_FK` FOREIGN KEY (`bandID`) REFERENCES `band` (`bandID`)
);