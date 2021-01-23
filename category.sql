/*
Navicat MySQL Data Transfer

Source Server         : koa2-blog
Source Server Version : 50732
Source Host           : localhost:3306
Source Database       : tmall_ssm

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-01-23 00:04:16
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('60', '安全座椅');
INSERT INTO `category` VALUES ('64', '太阳镜');
INSERT INTO `category` VALUES ('68', '品牌女装');
INSERT INTO `category` VALUES ('69', '时尚男鞋');
INSERT INTO `category` VALUES ('71', '男士西服');
INSERT INTO `category` VALUES ('72', '男士手拿包 ');
INSERT INTO `category` VALUES ('73', '男表');
INSERT INTO `category` VALUES ('74', '女表');
INSERT INTO `category` VALUES ('75', '空调');
INSERT INTO `category` VALUES ('76', '冰箱');
INSERT INTO `category` VALUES ('77', '原汁机222');
INSERT INTO `category` VALUES ('78', '扫地机器人 ');
INSERT INTO `category` VALUES ('79', '平衡车');
INSERT INTO `category` VALUES ('80', '电热水器');
INSERT INTO `category` VALUES ('81', '沙发');
INSERT INTO `category` VALUES ('82', '马桶');
INSERT INTO `category` VALUES ('83', '平板电视555');
INSERT INTO `category` VALUES ('85', '更新1');
