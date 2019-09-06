/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-09-06 22:43:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `a` varchar(255) DEFAULT NULL,
  `b` varchar(255) DEFAULT NULL,
  `c` datetime DEFAULT NULL,
  `d` varchar(255) DEFAULT NULL,
  `e` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '2', '2019-09-06 22:34:20', '4', '5');
INSERT INTO `student` VALUES ('11', '22', '2019-09-06 22:34:23', '44', '55');
