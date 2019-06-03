/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : smart_canteen

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 03/06/2019 13:54:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `itemid` int(11) NOT NULL AUTO_INCREMENT,
  `orderid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `foodid` int(11) NULL DEFAULT NULL,
  `fname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(11, 1) NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`itemid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, '1', 1, '炒土豆', 12.0, 6);
INSERT INTO `item` VALUES (2, '2', 2, '炒番茄', 11.0, 3);
INSERT INTO `item` VALUES (3, '3', 3, '鱼香肉丝', 11.0, 5);
INSERT INTO `item` VALUES (4, '4', 4, '小龙虾', 11.0, 5);
INSERT INTO `item` VALUES (5, '5', 5, '炖排骨', 11.0, 4);
INSERT INTO `item` VALUES (6, '6', 6, '烤鸭', 11.0, 8);
INSERT INTO `item` VALUES (7, '7', 7, '花甲', 11.0, 7);

SET FOREIGN_KEY_CHECKS = 1;
