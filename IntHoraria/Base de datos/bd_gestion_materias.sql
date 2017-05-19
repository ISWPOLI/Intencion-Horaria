/*
Navicat MySQL Data Transfer

Source Server         : local_conec
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : bd_gestion_materias

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-05-17 05:47:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administrador
-- ----------------------------
DROP TABLE IF EXISTS `administrador`;
CREATE TABLE `administrador` (
  `id_administrador` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estado` tinyint(1) NOT NULL,
  `nuip` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_administrador`),
  KEY `fk_usuario_usuario1_idx` (`nuip`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrador
-- ----------------------------
INSERT INTO `administrador` VALUES ('1', '1', '123');

-- ----------------------------
-- Table structure for carrera
-- ----------------------------
DROP TABLE IF EXISTS `carrera`;
CREATE TABLE `carrera` (
  `id_carrera` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(65) NOT NULL,
  PRIMARY KEY (`id_carrera`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carrera
-- ----------------------------
INSERT INTO `carrera` VALUES ('1', 'Ingenieria de Sistemas');

-- ----------------------------
-- Table structure for dia_semana
-- ----------------------------
DROP TABLE IF EXISTS `dia_semana`;
CREATE TABLE `dia_semana` (
  `id_dia_semana` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_dia_semana` varchar(15) NOT NULL,
  PRIMARY KEY (`id_dia_semana`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dia_semana
-- ----------------------------
INSERT INTO `dia_semana` VALUES ('1', 'Lunes');
INSERT INTO `dia_semana` VALUES ('2', 'Martes');
INSERT INTO `dia_semana` VALUES ('3', 'Miercoles');
INSERT INTO `dia_semana` VALUES ('4', 'Jueves');
INSERT INTO `dia_semana` VALUES ('5', 'Viernes');
INSERT INTO `dia_semana` VALUES ('6', 'Sabado');

-- ----------------------------
-- Table structure for docente
-- ----------------------------
DROP TABLE IF EXISTS `docente`;
CREATE TABLE `docente` (
  `id_docente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estado` tinyint(1) NOT NULL,
  `nuip` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_docente`),
  KEY `fk_docente_usuario1_idx` (`nuip`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of docente
-- ----------------------------
INSERT INTO `docente` VALUES ('1', '1', '345');

-- ----------------------------
-- Table structure for estudiante
-- ----------------------------
DROP TABLE IF EXISTS `estudiante`;
CREATE TABLE `estudiante` (
  `id_estudiante` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estado` tinyint(1) NOT NULL,
  `nuip` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_estudiante`),
  KEY `fk_estudiante_usuario1_idx` (`nuip`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of estudiante
-- ----------------------------
INSERT INTO `estudiante` VALUES ('1', '1', '234');

-- ----------------------------
-- Table structure for horario_materia
-- ----------------------------
DROP TABLE IF EXISTS `horario_materia`;
CREATE TABLE `horario_materia` (
  `id_horario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_materia` int(11) NOT NULL,
  `hora_bloque` int(11) NOT NULL,
  `id_dia_semana` int(11) NOT NULL,
  PRIMARY KEY (`id_horario`),
  KEY `fk_horairio_materia_materia1_idx` (`id_materia`),
  KEY `fk_horario_materia_dia_semana1_idx` (`id_dia_semana`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of horario_materia
-- ----------------------------
INSERT INTO `horario_materia` VALUES ('1', '1', '1', '1');

-- ----------------------------
-- Table structure for materia
-- ----------------------------
DROP TABLE IF EXISTS `materia`;
CREATE TABLE `materia` (
  `id_materia` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_materia` varchar(65) NOT NULL,
  `id_carrera` int(10) unsigned NOT NULL,
  `id_materia_prerrequisito` int(10) unsigned NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_materia`),
  KEY `fk_materia_carrera1_idx` (`id_carrera`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of materia
-- ----------------------------
INSERT INTO `materia` VALUES ('1', 'Pre-Calculo', '1', '0', '1');
INSERT INTO `materia` VALUES ('2', 'Calculo Diferencial', '1', '1', '1');
INSERT INTO `materia` VALUES ('3', 'Calculo Integral', '1', '2', '1');

-- ----------------------------
-- Table structure for registro_materia
-- ----------------------------
DROP TABLE IF EXISTS `registro_materia`;
CREATE TABLE `registro_materia` (
  `id_registro_materia` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_materia` int(10) unsigned NOT NULL,
  `id_administrador` int(10) unsigned NOT NULL,
  `id_estudiante` int(10) unsigned DEFAULT NULL,
  `id_docente` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id_registro_materia`),
  KEY `fk_registro_materia_estudiante1_idx` (`id_estudiante`),
  KEY `fk_registro_materia_docente1_idx` (`id_docente`),
  KEY `fk_registro_materia_usuario1_idx` (`id_administrador`),
  KEY `fk_registro_materia_materia1_idx` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registro_materia
-- ----------------------------
INSERT INTO `registro_materia` VALUES ('1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for usuario
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `nuip` int(10) unsigned NOT NULL,
  `nombre_usuario` varchar(45) NOT NULL,
  `apellido_usuario` varchar(45) NOT NULL,
  `email_usuario` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  PRIMARY KEY (`nuip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuario
-- ----------------------------
INSERT INTO `usuario` VALUES ('123', 'Usuario 1', 'Test', 'usu1@test.com', '123');
INSERT INTO `usuario` VALUES ('234', 'Usuario 2', 'Test', 'usu2@test.com', '123');
INSERT INTO `usuario` VALUES ('345', 'Usuario 3', 'Test', 'usu3@test.com', '123');
INSERT INTO `usuario` VALUES ('456', 'Usuario 4', 'Test', 'usu4@test.com', '123');
