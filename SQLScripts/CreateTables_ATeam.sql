CREATE DATABASE Kainos_A;

use Kainos_A;

CREATE TABLE `capability` (
  `capabilityID` tinyint NOT NULL AUTO_INCREMENT,
  `capability` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`capabilityID`)
);

CREATE TABLE `band` (
  `bandID` tinyint NOT NULL AUTO_INCREMENT,
  `bandName` varchar(40) NOT NULL,
   PRIMARY KEY (`bandID`)
);

CREATE TABLE `role` (
  `roleID` smallint NOT NULL AUTO_INCREMENT,
  `roleName` varchar(100) NOT NULL,
  `roleDesc` text NOT NULL,
  `datePosted` date NOT NULL,
  `hours` varchar(10) NOT NULL,
  `location` varchar(100) NOT NULL,
  `bandID` tinyint NOT NULL,
  `capabilityID` tinyint NOT NULL,
  `link` varchar(1000),
  PRIMARY KEY (`roleID`),
  CONSTRAINT `band_to_role_FK` FOREIGN KEY (`bandID`) REFERENCES `band` (`bandID`),
  CONSTRAINT `capability_to_role_FK` FOREIGN KEY (`capabilityID`) REFERENCES `capability` (`capabilityID`)
);

CREATE TABLE `competency`(
    `competencyID` tinyint PRIMARY KEY AUTO_INCREMENT,
    `competencyName` varchar (100),
    `competencyDescription` text
);

CREATE TABLE `competency_element`(
    `competencyElementID` tinyint AUTO_INCREMENT,
    `competencyID` tinyint NOT NULL,
    `elementName` varchar (100),
    `bandID` tinyint,
    `elementDescription` text,
    PRIMARY KEY (`competencyElementID`),
    CONSTRAINT `competency_element_to_competency_FK` FOREIGN KEY (`competencyID`) REFERENCES `competency` (`competencyID`),
    CONSTRAINT `band_to_competency_element_FK` FOREIGN KEY (`bandID`) REFERENCES `band` (`bandID`)
);

CREATE TABLE `responsibility` (
 `responsibilityId` smallint NOT NULL,
 `responsibilityTitle` text NOT NULL,
  PRIMARY KEY (`responsibilityId`)
);

CREATE TABLE `role_responsibility` (
 `roleId` smallint NOT NULL,
 `responsibilityId` smallint NOT NULL,
  PRIMARY KEY (`roleId`,`responsibilityId`),
  CONSTRAINT `role_responsibilities_ibfk_1` FOREIGN KEY (`responsibilityId`) REFERENCES `responsibility` (`responsibilityId`)
);
