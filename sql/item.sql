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

 Date: 03/06/2019 11:23:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `orderid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `foodid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `itemid`, `orderid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, '1', '1', '1', '炒土豆', 12, 6);
INSERT INTO `item` VALUES (2, '2', '2', '2', '炒番茄', 11, 3);
INSERT INTO `item` VALUES (3, '3', '3', '3', '鱼香肉丝', 11, 5);
INSERT INTO `item` VALUES (4, '4', '4', '4', '小龙虾', 11, 5);
INSERT INTO `item` VALUES (5, '5', '5', '5', '炖排骨', 11, 4);
INSERT INTO `item` VALUES (6, '6', '6', '6', '烤鸭', 11, 8);
INSERT INTO `item` VALUES (7, '7', '7', '7', '花甲', 11, 7);

SET FOREIGN_KEY_CHECKS = 1;
