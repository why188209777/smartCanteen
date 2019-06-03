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

 Date: 03/06/2019 11:23:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idcard` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `studentid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `class` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phonenum` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `studentid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zs', '62092319900823729X', '2017b11066', '软工16-3', '123', '18167108365', '15号楼');
INSERT INTO `user` VALUES (2, '殷雅畅 ', '620923197008115453', '2018b11065', '机械15-4', '123456', '18989452224', '8号楼');
INSERT INTO `user` VALUES (3, '卞伟祺', '620923198208203276', '2018b11054', '经管17-1', '123654', '18069223475', '2号楼');
INSERT INTO `user` VALUES (4, '贺文杰 ', '620923197802236738', '2018b11061', '水利16-2', '1541122', '13065784554', '3号楼');
INSERT INTO `user` VALUES (5, '谢圣杰', '620923197009163879', '2019b11101', '软工16-2', 'asa54654', '18168544114', '2号楼');
INSERT INTO `user` VALUES (6, '朱泽洋 ', '51170219740419175X', '2019b11041', '数媒17-2', '26516jhkhkh', '13850984511', '3号楼');
INSERT INTO `user` VALUES (7, '罗嘉懿 ', '511702198504283656', '2016b11021', '软工17-2', '546gfhj', '13068542144', '7号楼');
INSERT INTO `user` VALUES (8, '蒋开霁', '511702197901178476', '2017b11013', '生物16-4', '5646456fhf', '13065771412', '8号楼');
INSERT INTO `user` VALUES (9, '赵旭尧 ', '511702198604224530', '2017b11063', '化工17-2', '4awaa42', '18989471454', '12号楼');
INSERT INTO `user` VALUES (10, '尤杰伟 ', '511702197807102977', '2018b11032', '水利17-3', 'awxc4544', '13850697300', '11号楼');

SET FOREIGN_KEY_CHECKS = 1;
