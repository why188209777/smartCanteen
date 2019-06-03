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

 Date: 03/06/2019 13:54:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `foodid` int(11) NOT NULL,
  `fname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(11, 1) NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `mid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`foodid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (1, '酱爆茄子', 3.0, NULL, 1, 1);
INSERT INTO `food` VALUES (2, '番茄炒蛋', 4.0, NULL, 1, 1);
INSERT INTO `food` VALUES (3, '酸菜鱼', 8.0, NULL, 1, 1);
INSERT INTO `food` VALUES (4, '爆炒牛蛙', 21.0, NULL, 2, 2);
INSERT INTO `food` VALUES (5, '鲜花豆腐', 3.0, NULL, 1, 2);
INSERT INTO `food` VALUES (6, '红烧鱼头', 16.0, NULL, 1, 2);
INSERT INTO `food` VALUES (7, '宫爆鸡丁', 12.0, NULL, 2, 3);
INSERT INTO `food` VALUES (8, '水煮肉片', 13.0, NULL, 2, 3);
INSERT INTO `food` VALUES (9, '红烧鸡翅', 15.0, NULL, 1, 4);
INSERT INTO `food` VALUES (10, '鱼香肉丝', 10.0, NULL, 1, 4);

SET FOREIGN_KEY_CHECKS = 1;
