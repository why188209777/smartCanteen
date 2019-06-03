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

 Date: 03/06/2019 11:23:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `createtime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `total` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `orderid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, '1', '2019-06-02', '啊擦擦', 0, 12);
INSERT INTO `order` VALUES (2, '2', '2019-06-02', '010', 0, 13);
INSERT INTO `order` VALUES (3, '3', '2019-06-02', '撒大声地', 0, 12);
INSERT INTO `order` VALUES (4, '4', '2019-06-02', 'SSA', 0, 45);
INSERT INTO `order` VALUES (5, '5', '2019-06-02', 'A大概是地方', 0, 24);
INSERT INTO `order` VALUES (6, '6', '2019-06-02', ' 方式发顺丰', 0, 85);

SET FOREIGN_KEY_CHECKS = 1;
