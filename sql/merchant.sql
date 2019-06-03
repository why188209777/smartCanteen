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

 Date: 03/06/2019 11:23:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for merchant
-- ----------------------------
DROP TABLE IF EXISTS `merchant`;
CREATE TABLE `merchant`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mnane` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of merchant
-- ----------------------------
INSERT INTO `merchant` VALUES (1, '1', '东食堂', '物美价廉', 1);
INSERT INTO `merchant` VALUES (2, '2', '西食堂', '美味可口', 1);
INSERT INTO `merchant` VALUES (3, '3', '美食广场', '种类丰富', 2);
INSERT INTO `merchant` VALUES (4, '4', '小吃街', '小吃种类多，味道好', 2);

SET FOREIGN_KEY_CHECKS = 1;
