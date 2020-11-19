CREATE TABLE IF NOT EXISTS `mydb`.`Client` (
  `idClient` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `téléphone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `adresse` VARCHAR(45) NULL,
  PRIMARY KEY (`idClient`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Compagnie` (
  `idCompagnie` INT NOT NULL,
  `Nom` VARCHAR(45) NULL,
  PRIMARY KEY (`idCompagnie`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Ville` (
  `idVille` INT NOT NULL,
  `Nom` VARCHAR(45) NULL,
  PRIMARY KEY (`idVille`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Aéroport` (
  `idAéroport` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `Ville_idVille` INT NOT NULL,
  PRIMARY KEY (`idAéroport`),
  INDEX `fk_Aéroport_Ville1_idx` (`Ville_idVille` ASC),
  CONSTRAINT `fk_Aéroport_Ville1`
    FOREIGN KEY (`Ville_idVille`)
    REFERENCES `mydb`.`Ville` (`idVille`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Vol` (
  `idVol` INT NOT NULL,
  `DateDépart` DATETIME NULL,
  `heureDépart` DECIMAL(11) NULL,
  `DateArrivée` DATETIME NULL,
  `HeureArrivé` DECIMAL(11) NULL,
  `Capaciter` INT NULL,
  `Compagnie_idCompagnie` INT NOT NULL,
  `Aéroport_idAéroportDepart` INT NOT NULL,
  `Aéroport_idAéroportArriver` INT NOT NULL,
  PRIMARY KEY (`idVol`),
  INDEX `fk_Vol_Compagnie1_idx` (`Compagnie_idCompagnie` ASC) ,
  INDEX `fk_Vol_Aéroport1_idx` (`Aéroport_idAéroportDepart` ASC) ,
  INDEX `fk_Vol_Aéroport2_idx` (`Aéroport_idAéroportArriver` ASC) ,
  CONSTRAINT `fk_Vol_Compagnie1`
    FOREIGN KEY (`Compagnie_idCompagnie`)
    REFERENCES `mydb`.`Compagnie` (`idCompagnie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Vol_Aéroport1`
    FOREIGN KEY (`Aéroport_idAéroportDepart`)
    REFERENCES `mydb`.`Aéroport` (`idAéroport`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Vol_Aéroport2`
    FOREIGN KEY (`Aéroport_idAéroportArriver`)
    REFERENCES `mydb`.`Aéroport` (`idAéroport`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Réservation` (
  `idRéservation` INT NOT NULL,
  `Date` DATETIME NULL,
  `etat` VARCHAR(45) NULL,
  `Client_idClient` INT NOT NULL,
  `Vol_idVol` INT NOT NULL,
  PRIMARY KEY (`idRéservation`),
  INDEX `fk_Réservation_Client_idx` (`Client_idClient` ASC) ,
  INDEX `fk_Réservation_Vol1_idx` (`Vol_idVol` ASC) ,
  CONSTRAINT `fk_Réservation_Client`
    FOREIGN KEY (`Client_idClient`)
    REFERENCES `mydb`.`Client` (`idClient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Réservation_Vol1`
    FOREIGN KEY (`Vol_idVol`)
    REFERENCES `mydb`.`Vol` (`idVol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Escale` (
  `idEscale` INT NOT NULL,
  `HeureArriver` VARCHAR(45) NULL,
  `HeurDepart` VARCHAR(45) NULL,
  `Vol_idVol` INT NOT NULL,
  `Aéroport_idAéroport` INT NOT NULL,
  PRIMARY KEY (`idEscale`),
  INDEX `fk_Escale_Vol1_idx` (`Vol_idVol` ASC),
  INDEX `fk_Escale_Aéroport1_idx` (`Aéroport_idAéroport` ASC) ,
  CONSTRAINT `fk_Escale_Vol1`
    FOREIGN KEY (`Vol_idVol`)
    REFERENCES `mydb`.`Vol` (`idVol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Escale_Aéroport1`
    FOREIGN KEY (`Aéroport_idAéroport`)
    REFERENCES `mydb`.`Aéroport` (`idAéroport`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
