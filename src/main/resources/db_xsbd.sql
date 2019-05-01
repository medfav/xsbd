/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : db_xsbd

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 01/05/2019 11:15:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_authority
-- ----------------------------
DROP TABLE IF EXISTS `tb_authority`;
CREATE TABLE `tb_authority`  (
  `ID` int(2) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `Authority` int(1) DEFAULT NULL COMMENT '用户权限',
  `AuthorityJson` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '权限内容',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_authority
-- ----------------------------
INSERT INTO `tb_authority` VALUES (0, 0, '[\r\n	{\r\n		\"name\": \"信息管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"基本信息\",\r\n				\"url\": \"/api/user/showuserinfo\"\r\n			},{\r\n				\"name\": \"详细信息\",\r\n				\"url\": \"/api/user/moreinfo\"\r\n			},{\r\n				\"name\": \"信息修改\",\r\n				\"url\": \"/web/model?au=0&model=1&item=3\"\r\n			},{\r\n				\"name\": \"密码修改\",\r\n				\"url\": \"/web/model?au=0&model=1&item=4\"\r\n			}\r\n		]\r\n	}, {\r\n		\"name\": \"账户管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"查询账户\",\r\n				\"url\": \"/api/user/showlist\"\r\n			},{\r\n				\"name\": \"添加账户\",\r\n				\"url\": \"/web/model?au=0&model=2&item=2\"\r\n			},{\r\n				\"name\": \"修改账户\",\r\n				\"url\": \"/web/model?au=0&model=2&item=3\"\r\n			},{\r\n				\"name\": \"删除账户\",\r\n				\"url\": \"/web/model?au=0&model=2&item=4\"\r\n			},{\r\n				\"name\": \"导入/导出\",\r\n				\"url\": \"/web/model?au=0&model=2&item=5\"\r\n			}\r\n		]\r\n	}, {\r\n		\"name\": \"公告管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"查看公告\",\r\n				\"url\": \"/notice/showlist\"\r\n			}, {\r\n				\"name\": \"发布公告\",\r\n				\"url\": \"/web/model?au=0&model=3&item=2\"\r\n			}, {\r\n				\"name\": \"修改公告\",\r\n				\"url\": \"/web/model?au=0&model=3&item=3\"\r\n			}, {\r\n				\"name\": \"删除公告\",\r\n				\"url\": \"/web/model?au=0&model=3&item=4\"\r\n			}\r\n		]\r\n	}\r\n]');
INSERT INTO `tb_authority` VALUES (1, 1, '[\r\n	{\r\n		\"name\": \"信息管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"基本信息\",\r\n				\"url\": \"/api/user/showuserinfo\"\r\n			},{\r\n				\"name\": \"详细信息\",\r\n				\"url\": \"/api/teacher/moreinfo?type=show\"\r\n			},{\r\n				\"name\": \"信息修改\",\r\n				\"url\": \"/api/teacher/moreinfo?type=change\"\r\n			},{\r\n				\"name\": \"密码修改\",\r\n				\"url\": \"/web/model?au=1&model=1&item=4\"\r\n			}\r\n		]\r\n	}, {\r\n		\"name\": \"新生管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"查询\",\r\n				\"url\": \"/api/teacher/stulist\"\r\n			},{\r\n				\"name\": \"添加\",\r\n				\"url\": \"/web/model?au=1&model=2&item=2\"\r\n			},{\r\n				\"name\": \"修改\",\r\n				\"url\": \"/web/model?au=1&model=2&item=3\"\r\n			},{\r\n				\"name\": \"删除\",\r\n				\"url\": \"/web/model?au=1&model=2&item=4\"\r\n			},{\r\n				\"name\": \"导入/导出\",\r\n				\"url\": \"/web/model?au=1&model=2&item=5\"\r\n			}\r\n		]\r\n	}\r\n]');
INSERT INTO `tb_authority` VALUES (2, 2, '[\r\n	{\r\n		\"name\": \"信息管理\",\r\n		\"submenu\": [{\r\n				\"name\": \"基本信息\",\r\n				\"url\": \"/api/user/showuserinfo\"\r\n			},{\r\n				\"name\": \"详细信息\",\r\n				\"url\": \"/api/stu/moreinfo?type=show\"\r\n			},{\r\n				\"name\": \"信息修改\",\r\n				\"url\": \"/api/stu/moreinfo?type=change\"\r\n			},{\r\n				\"name\": \"密码修改\",\r\n				\"url\": \"/web/model?au=2&model=1&item=4\"\r\n			}\r\n		]\r\n	}, {\r\n		\"name\": \"在线报到\",\r\n		\"submenu\": [{\r\n				\"name\": \"在线报到\",\r\n				\"url\": \"/web/model?au=2&model=2&item=1\"\r\n			}\r\n		]\r\n	}\r\n]');

-- ----------------------------
-- Table structure for tb_department
-- ----------------------------
DROP TABLE IF EXISTS `tb_department`;
CREATE TABLE `tb_department`  (
  `ID` int(3) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `DepartmentID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '院系编号',
  `DepartmentName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '院系名称',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '院系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_department
-- ----------------------------
INSERT INTO `tb_department` VALUES (0, '001', '计算机工程学院');
INSERT INTO `tb_department` VALUES (1, '002', '财会学院');
INSERT INTO `tb_department` VALUES (2, '003', '机器人工程学院');
INSERT INTO `tb_department` VALUES (3, '004', '交通工程学院');
INSERT INTO `tb_department` VALUES (4, '005', '机械工程学院');
INSERT INTO `tb_department` VALUES (5, '006', '电子电气工程学院');
INSERT INTO `tb_department` VALUES (6, '007', '经济管理学院');
INSERT INTO `tb_department` VALUES (7, '008', '动漫与数字艺术学院');
INSERT INTO `tb_department` VALUES (8, '009', '外语学院');
INSERT INTO `tb_department` VALUES (9, '010', '护理学院');

-- ----------------------------
-- Table structure for tb_major
-- ----------------------------
DROP TABLE IF EXISTS `tb_major`;
CREATE TABLE `tb_major`  (
  `ID` int(3) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `MajorID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业编号',
  `MajorName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业名称',
  `DepartmentID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '院系编号',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '专业表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_major
-- ----------------------------
INSERT INTO `tb_major` VALUES (1, '0001', '计算机科学与技术', '001');
INSERT INTO `tb_major` VALUES (2, '0002', '会计学', '002');
INSERT INTO `tb_major` VALUES (3, '0003', '机器人工程', '003');
INSERT INTO `tb_major` VALUES (4, '0004', '交通工程', '004');
INSERT INTO `tb_major` VALUES (5, '0005', '机械电子工程专业', '005');
INSERT INTO `tb_major` VALUES (6, '0006', '电气工程及其自动化', '006');
INSERT INTO `tb_major` VALUES (7, '0007', '市场营销', '007');
INSERT INTO `tb_major` VALUES (8, '0008', '数字媒体艺术', '008');
INSERT INTO `tb_major` VALUES (9, '0009', '商务英语', '009');
INSERT INTO `tb_major` VALUES (10, '0010', '护理学', '010');
INSERT INTO `tb_major` VALUES (11, '0011', '软件工程', '001');
INSERT INTO `tb_major` VALUES (12, '0012', '财务管理', '002');
INSERT INTO `tb_major` VALUES (13, '0013', '智能科学与技术', '003');
INSERT INTO `tb_major` VALUES (14, '0014', '安全工程', '004');
INSERT INTO `tb_major` VALUES (15, '0015', '机械设计制造及其自动化', '005');

-- ----------------------------
-- Table structure for tb_notice
-- ----------------------------
DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice`  (
  `NoticeID` int(4) NOT NULL AUTO_INCREMENT COMMENT '公告编号',
  `NoticeTitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公告标题',
  `NoticeText` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '公告内容',
  `UserID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '发布人ID',
  `CreateData` datetime(0) DEFAULT NULL COMMENT '发布时间',
  `ChangeDate` datetime(0) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`NoticeID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公告信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_notice
-- ----------------------------
INSERT INTO `tb_notice` VALUES (1, '新生报到步骤', '1.进入高校新生报到系统网站首页\r\n2.点击登录，输入登录账号和密码，选择正确的用户类型，登录系统\r\n3.完善个人信息\r\n4.点击“在线报到”按钮就可以报到了\r\n', '001', '2014-10-13 11:06:47', '2019-04-21 22:29:21');
INSERT INTO `tb_notice` VALUES (2, '登录系统后请先修改默认密码', '为了账号安全，登录高校新生报到系统后，请务必修改默认密码\r\n修改步骤：点击“信息管理”->“密码修改”->输入当前密码和号修改的密码点击“修改”按钮\r\n注意：修改密码后要求重新登录账号！', '001', '2013-05-13 11:05:46', '2019-04-21 22:34:19');
INSERT INTO `tb_notice` VALUES (3, '查看公告不需要登录系统', '1、  打开高校新生报到管理系统\r\n2、  直接点击公告名称，或者点击更多公告就可以打开公告页面\r\n3、  在公告页面点击左侧的公告，右边就会出现对应的公告内容', '001', '2013-01-31 10:24:01', '2019-04-21 22:41:56');
INSERT INTO `tb_notice` VALUES (12, '测试长内容公告', '测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容\r\n测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容\r\n测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容\r\n测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容\r\n测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容 测试内容', '001', '2019-04-09 20:06:42', '2019-04-21 22:42:52');
INSERT INTO `tb_notice` VALUES (14, '测试带格式公告', 'test test <b>test</b>', '001', '2019-04-09 21:43:10', '2019-04-21 22:44:31');
INSERT INTO `tb_notice` VALUES (15, '测试内容', '测试内容 测试内容 测试内容 测试内容', '001', '2019-04-09 22:24:27', '2019-04-09 22:24:27');
INSERT INTO `tb_notice` VALUES (16, 'wzxwzxwzx', 'wzx wzx wzx', 'wzx', '2019-04-13 13:33:08', '2019-04-13 13:33:08');

-- ----------------------------
-- Table structure for tb_studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_studentinfo`;
CREATE TABLE `tb_studentinfo`  (
  `ID` int(4) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `StuId` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `Name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `Sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `DateOfBirth` date DEFAULT NULL COMMENT '出生年月',
  `IDCard` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证号',
  `Nation` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '民族',
  `EnrollmentNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '录取通知书编号',
  `NativePlace` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '籍贯',
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '家庭住址',
  `FormerSchool` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '原就读学校',
  `Tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系电话',
  `QQ` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'QQ账号',
  `Email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电子邮箱',
  `ParentName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '家长姓名',
  `ParentTel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '家长电话',
  `MajorID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业编号',
  `ClassID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级编号',
  `DormitoryID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '宿舍编号',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_studentinfo
-- ----------------------------
INSERT INTO `tb_studentinfo` VALUES (3, '12', '王五', '女', '2019-03-06', '34290119562418', '汉族', 'qweqweqwe', '123123123', 'qweqweqweasda', 'qweasd', '134345456', '12312312', '123544@123.com', 'www', '1233434123', '0001', NULL, NULL);
INSERT INTO `tb_studentinfo` VALUES (5, '1801010048', '小华', '男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tb_studentinfo` VALUES (7, '222', '222', '女', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tb_studentinfo` VALUES (10, '1801010045', '小红', '女', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0001', NULL, NULL);
INSERT INTO `tb_studentinfo` VALUES (11, '1801010046', '小明', '男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tb_teacherinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacherinfo`;
CREATE TABLE `tb_teacherinfo`  (
  `ID` int(4) NOT NULL AUTO_INCREMENT COMMENT '教师编号',
  `TeacherID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师工号',
  `Name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `Sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `Title` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '职称',
  `MajorID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业编号',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_teacherinfo
-- ----------------------------
INSERT INTO `tb_teacherinfo` VALUES (2, '12', '李四', '男', '教授', '0001');

-- ----------------------------
-- Table structure for tb_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_userinfo`;
CREATE TABLE `tb_userinfo`  (
  `ID` int(4) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `UserName` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名（学号/工号）',
  `StuId` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学号',
  `TeacherID` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `UserPwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户密码',
  `Authority` int(1) DEFAULT NULL COMMENT '用户权限',
  `UserStyle` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户类型（学生/教师/管理员）',
  `Name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `Sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `RegisterStatic` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '报到状态（已报到/未报到）',
  PRIMARY KEY (`ID`, `UserName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_userinfo
-- ----------------------------
INSERT INTO `tb_userinfo` VALUES (1, '001', '', '', '123', 0, '管理员', '张三', '女', '');
INSERT INTO `tb_userinfo` VALUES (2, '002', '', '12', '123', 1, '教师', '李四', '男', NULL);
INSERT INTO `tb_userinfo` VALUES (3, '003', '12', NULL, '123', 2, '学生', '王五', '女', '已报到');
INSERT INTO `tb_userinfo` VALUES (4, 'admin', NULL, NULL, 'admin', 0, '管理员', '小三', '男', NULL);
INSERT INTO `tb_userinfo` VALUES (5, '1801010045', '1801010045', '', '123', 2, '学生', '小红', '女', '未报到');
INSERT INTO `tb_userinfo` VALUES (6, '1801010046', '1801010046', '', '123', 2, '学生', '小明', '男', '已报到');
INSERT INTO `tb_userinfo` VALUES (7, 'wzx', '', '', 'wzx', 0, '管理员', '小飞雪', '女', NULL);
INSERT INTO `tb_userinfo` VALUES (8, 'wzs', '', '', 'wzs', 0, '管理员', 'wzs', '男', NULL);
INSERT INTO `tb_userinfo` VALUES (10, '222', '222', NULL, '222', 2, '学生', '222', '女', '未报到');
INSERT INTO `tb_userinfo` VALUES (12, '1801010048', '1801010048', NULL, '123', 2, '学生', '小华', '男', '未报到');

SET FOREIGN_KEY_CHECKS = 1;
