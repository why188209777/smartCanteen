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

 Date: 06/06/2019 10:07:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `foodid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(11, 1) NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `mid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`foodid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
INSERT INTO `food` VALUES (11, '豆腐鲶鱼', 10.0, NULL, 1, 2);
INSERT INTO `food` VALUES (12, '小煎鸡', 15.0, NULL, 1, 3);
INSERT INTO `food` VALUES (13, '蒜苔鸡丝', 20.0, NULL, 3, 2);
INSERT INTO `food` VALUES (14, '蒜苗回锅肉', 18.0, NULL, 2, 1);
INSERT INTO `food` VALUES (15, '木耳肉片', 15.0, NULL, 1, 4);
INSERT INTO `food` VALUES (16, '青椒炒蛋', 10.0, NULL, 2, 2);
INSERT INTO `food` VALUES (17, '青椒土豆丝', 8.0, NULL, 1, 1);
INSERT INTO `food` VALUES (18, '炒飘儿菜', 10.0, NULL, 2, 3);
INSERT INTO `food` VALUES (19, '白油冬瓜', 8.0, NULL, 3, 1);
INSERT INTO `food` VALUES (20, '炒小瓜丝', 10.0, NULL, 2, 2);
INSERT INTO `food` VALUES (21, '土豆烧排骨', 20.0, NULL, 2, 1);
INSERT INTO `food` VALUES (22, '干锅鸭子', 20.0, NULL, 3, 1);
INSERT INTO `food` VALUES (23, '芹菜豆干回锅肉', 20.0, NULL, 2, 4);
INSERT INTO `food` VALUES (24, '大葱炒猪肝', 25.0, NULL, 3, 4);
INSERT INTO `food` VALUES (25, '西兰花炒肉', 18.0, NULL, 2, 3);
INSERT INTO `food` VALUES (26, '鱼香茄子', 15.0, NULL, 3, 4);
INSERT INTO `food` VALUES (27, '焖豆腐', 8.0, NULL, 2, 3);
INSERT INTO `food` VALUES (28, '炒青笋叶', 10.0, NULL, 3, 2);
INSERT INTO `food` VALUES (29, '炒莲花白', 15.0, NULL, 1, 2);
INSERT INTO `food` VALUES (30, '炒土豆丝', 10.0, NULL, 2, 3);

SET FOREIGN_KEY_CHECKS = 1;
