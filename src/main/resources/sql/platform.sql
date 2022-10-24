/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50735 (5.7.35)
 Source Host           : localhost:3306
 Source Schema         : platform

 Target Server Type    : MySQL
 Target Server Version : 50735 (5.7.35)
 File Encoding         : 65001

 Date: 24/10/2022 08:12:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for T_Cell
-- ----------------------------
DROP TABLE IF EXISTS `T_Cell`;
CREATE TABLE `T_Cell` (
  `id` bigint(20) NOT NULL,
  `dna_code` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `dna_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `biz_type` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `root_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of T_Cell
-- ----------------------------
BEGIN;
INSERT INTO `T_Cell` (`id`, `dna_code`, `dna_name`, `biz_type`, `parent_id`, `root_id`) VALUES (1, '1', '1', '1', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for T_Va
-- ----------------------------
DROP TABLE IF EXISTS `T_Va`;
CREATE TABLE `T_Va` (
  `id` bigint(20) NOT NULL COMMENT '表主键',
  `code` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `cell_id` bigint(20) DEFAULT NULL,
  `data_type` smallint(6) DEFAULT NULL,
  `int_value` bigint(20) DEFAULT NULL,
  `double_value` double DEFAULT NULL,
  `string_value` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `date_calue` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of T_Va
-- ----------------------------
BEGIN;
INSERT INTO `T_Va` (`id`, `code`, `name`, `cell_id`, `data_type`, `int_value`, `double_value`, `string_value`, `date_calue`) VALUES (1, 'dicValue', 'dicValue', 1, 1, NULL, NULL, 'lang', '2022-08-21 15:08:46');
INSERT INTO `T_Va` (`id`, `code`, `name`, `cell_id`, `data_type`, `int_value`, `double_value`, `string_value`, `date_calue`) VALUES (2, 'zh', 'zh', 1, 1, NULL, NULL, '中文', NULL);
INSERT INTO `T_Va` (`id`, `code`, `name`, `cell_id`, `data_type`, `int_value`, `double_value`, `string_value`, `date_calue`) VALUES (3, 'en', 'en', 1, 1, NULL, NULL, '英文', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
