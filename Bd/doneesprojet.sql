-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 07 août 2019 à 10:21
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `donneesprojet`
--
CREATE DATABASE IF NOT EXISTS `donneesprojet` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `donneesprojet`;

-- --------------------------------------------------------

--
-- Structure de la table `objectif`
--

DROP TABLE IF EXISTS `objectif`;
CREATE TABLE IF NOT EXISTS `objectif` (
  `idObjectif` int(11) NOT NULL AUTO_INCREMENT,
  `Debut` date NOT NULL,
  `Duree` varchar(20) NOT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `Poids` int(11) DEFAULT NULL,
  `Temps` time DEFAULT NULL,
  `utilisateurs_idUtilisateurs` int(11) NOT NULL,
  PRIMARY KEY (`idObjectif`),
  KEY `fk_objectif_utilisateurs1_idx` (`utilisateurs_idUtilisateurs`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `objectif`
--

INSERT INTO `objectif` (`idObjectif`, `Debut`, `Duree`, `Type`, `Poids`, `Temps`, `utilisateurs_idUtilisateurs`) VALUES
(1, '2019-01-01', 'journalière', 'vélo', NULL, '01:00:00', 1);

-- --------------------------------------------------------

--
-- Structure de la table `poids`
--

DROP TABLE IF EXISTS `poids`;
CREATE TABLE IF NOT EXISTS `poids` (
  `idPoids` int(11) NOT NULL AUTO_INCREMENT,
  `Poids` int(11) NOT NULL,
  `Date` date NOT NULL,
  `utilisateurs_idUtilisateurs` int(11) NOT NULL,
  PRIMARY KEY (`idPoids`),
  KEY `fk_poids_utilisateurs_idx` (`utilisateurs_idUtilisateurs`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `poids`
--

INSERT INTO `poids` (`idPoids`, `Poids`, `Date`, `utilisateurs_idUtilisateurs`) VALUES
(1, 60, '2019-01-01', 1);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

DROP TABLE IF EXISTS `utilisateurs`;
CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `idUtilisateurs` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(45) NOT NULL,
  `Prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `Login` varchar(45) NOT NULL,
  `Mdp` varchar(20) NOT NULL,
  `Age` int(11) DEFAULT NULL,
  `Taille` int(11) DEFAULT NULL,
  `DateDer` datetime DEFAULT NULL,
  `Sexe` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idUtilisateurs`),
  UNIQUE KEY `idUtilisateurs_UNIQUE` (`idUtilisateurs`),
  UNIQUE KEY `Login_UNIQUE` (`Login`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`idUtilisateurs`, `Nom`, `Prenom`, `mail`, `Login`, `Mdp`, `Age`, `Taille`, `DateDer`, `Sexe`) VALUES
(1, 'root', 'root', 'root@root.com', 'root', 'root', 30, 160, '2019-01-01 00:00:00', 'Femme');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `objectif`
--
ALTER TABLE `objectif`
  ADD CONSTRAINT `fk_objectif_utilisateurs1` FOREIGN KEY (`utilisateurs_idUtilisateurs`) REFERENCES `utilisateurs` (`idUtilisateurs`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `poids`
--
ALTER TABLE `poids`
  ADD CONSTRAINT `fk_poids_utilisateurs` FOREIGN KEY (`utilisateurs_idUtilisateurs`) REFERENCES `utilisateurs` (`idUtilisateurs`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
