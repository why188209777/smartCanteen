/*
 Navicat Premium Data Transfer

 Source Server         : fsp
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 120.78.139.183:3306
 Source Schema         : smart_canteen

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 03/06/2019 11:23:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for canteen
-- ----------------------------
DROP TABLE IF EXISTS `canteen`;
CREATE TABLE `canteen`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of canteen
-- ----------------------------
INSERT INTO `canteen` VALUES (1, '东食堂', '很好');
INSERT INTO `canteen` VALUES (2, '西食堂', '非常好');

SET FOREIGN_KEY_CHECKS = 1;
