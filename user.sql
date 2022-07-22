/*
 Navicat Premium Data Transfer

 Source Server         : First
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 22/07/2022 16:12:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123');
INSERT INTO `user` VALUES (2, 'test', '123');
INSERT INTO `user` VALUES (3, '张三', '123');
INSERT INTO `user` VALUES (4, '李四', '123');
INSERT INTO `user` VALUES (5, '王五', '123');
INSERT INTO `user` VALUES (6, '赵六', '123');

SET FOREIGN_KEY_CHECKS = 1;
