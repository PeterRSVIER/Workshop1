-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema PB_Workshop1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PB_Workshop1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PB_Workshop1` DEFAULT CHARACTER SET utf8 ;
USE `PB_Workshop1` ;

-- -----------------------------------------------------
-- Table `PB_Workshop1`.`AccountType`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`AccountType` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`Account` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `accountTypeId` INT(11) NOT NULL,
  PRIMARY KEY (`Id`),
  INDEX `fk_accountTypeId` (`accountTypeId` ASC) VISIBLE,
  CONSTRAINT `fk_accountTypeId`
    FOREIGN KEY (`accountTypeId`)
    REFERENCES `PB_Workshop1`.`AccountType` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`AddressType`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`AddressType` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`Customer` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `accountId` INT(11) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `middlename` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`),
  INDEX `fk_accountId` (`accountId` ASC) VISIBLE,
  CONSTRAINT `fk_accountId`
    FOREIGN KEY (`accountId`)
    REFERENCES `PB_Workshop1`.`Account` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`Address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`Address` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `customerId` INT(11) NOT NULL,
  `addressTypeId` INT(11) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `houseNumber` INT(11) NOT NULL,
  `houseExtention` VARCHAR(45) NULL DEFAULT NULL,
  `city` VARCHAR(45) NOT NULL,
  `zipCode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`, `customerId`),
  INDEX `fk_customerId` (`customerId` ASC) VISIBLE,
  INDEX `fk_AddressType` (`addressTypeId` ASC) VISIBLE,
  CONSTRAINT `fk_AddressType`
    FOREIGN KEY (`addressTypeId`)
    REFERENCES `PB_Workshop1`.`AddressType` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customerId`
    FOREIGN KEY (`customerId`)
    REFERENCES `PB_Workshop1`.`Customer` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`OrderStatus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`OrderStatus` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  `startdate` DATE NOT NULL,
  `enddate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`Order` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `customerId` INT(11) NOT NULL,
  `totalCost` DECIMAL(10,0) NOT NULL,
  `date` DATE NOT NULL,
  `orderStatusId` INT(11) NOT NULL,
  PRIMARY KEY (`Id`),
  INDEX `fk_orderStatusId` (`orderStatusId` ASC) VISIBLE,
  CONSTRAINT `fk_orderStatusId`
    FOREIGN KEY (`orderStatusId`)
    REFERENCES `PB_Workshop1`.`OrderStatus` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`Product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`Product` (
  `Id` INT(11) NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `price` DECIMAL(10,0) NOT NULL,
  `stock` INT(11) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `PB_Workshop1`.`OrderLine`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PB_Workshop1`.`OrderLine` (
  `orderId` INT(11) NOT NULL,
  `productId` INT(11) NOT NULL,
  `amount` INT(11) NOT NULL,
  PRIMARY KEY (`orderId`, `productId`),
  INDEX `fk_productId` (`productId` ASC) VISIBLE,
  CONSTRAINT `fk_orderId`
    FOREIGN KEY (`orderId`)
    REFERENCES `PB_Workshop1`.`Order` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_productId`
    FOREIGN KEY (`productId`)
    REFERENCES `PB_Workshop1`.`Product` (`Id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
