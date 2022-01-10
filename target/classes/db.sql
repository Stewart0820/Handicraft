/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.7.36 : Database - team01
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`team01` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

/*Table structure for table `ad` */

CREATE TABLE `ad` (
  `ad_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '封面id',
  `ad_img` varchar(255) DEFAULT NULL COMMENT '封面图片',
  `ad_title` varchar(50) DEFAULT NULL COMMENT '封面标题',
  `ad_content` varchar(100) NOT NULL COMMENT '封面简介',
  PRIMARY KEY (`ad_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `ad` */

/*Table structure for table `artists` */

CREATE TABLE `artists` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `image` varchar(255) NOT NULL COMMENT '图片',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `position` varchar(50) NOT NULL COMMENT '职位',
  `content` varchar(1000) NOT NULL COMMENT '简介内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `artists` */

/*Table structure for table `blog` */

CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客id',
  `blog_name` varchar(15) NOT NULL COMMENT '博客用户名',
  `blog_date` varchar(8) NOT NULL COMMENT '博客日期',
  `bolg_pricture` varchar(7) NOT NULL COMMENT '博客图片',
  `blog_context` varchar(150) NOT NULL COMMENT '博客内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `blog` */

/*Table structure for table `choose` */

CREATE TABLE `choose` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '标题',
  `content` varchar(1000) NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `choose` */

/*Table structure for table `customers` */

CREATE TABLE `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `image` varchar(255) COLLATE utf8mb4_german2_ci NOT NULL COMMENT '图片',
  `name` varchar(50) COLLATE utf8mb4_german2_ci NOT NULL COMMENT '姓名',
  `content` varchar(1000) COLLATE utf8mb4_german2_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_german2_ci;

/*Data for the table `customers` */

/*Table structure for table `introduction` */

CREATE TABLE `introduction` (
  `intro_id` int(11) NOT NULL COMMENT '简介id',
  `intro_title` varchar(25) DEFAULT NULL COMMENT '简介标题',
  `intro_content` varchar(255) DEFAULT NULL COMMENT '简介内容',
  `intro_img` varchar(255) DEFAULT NULL COMMENT '简介插图',
  PRIMARY KEY (`intro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `introduction` */

/*Table structure for table `javaee_team` */

CREATE TABLE `javaee_team` (
  `team_id` bigint(20) NOT NULL,
  `team_desc` varchar(255) DEFAULT NULL,
  `team_icon` varchar(255) DEFAULT NULL,
  `team_name` varchar(255) DEFAULT NULL,
  `team_slogen` varchar(255) DEFAULT NULL,
  `team_state` varchar(255) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `update_user` varchar(255) DEFAULT NULL,
  `deleted` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `team_city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`team_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='开发团队表';

/*Data for the table `javaee_team` */

insert  into `javaee_team`(`team_id`,`team_desc`,`team_icon`,`team_name`,`team_slogen`,`team_state`,`create_time`,`create_user`,`update_time`,`update_user`,`deleted`,`version`,`team_city`) values 
(1,'这个是团队','img/1.jpg','中国代码队','打码最快小组','on',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'团队2','img/a.jpg','团队名字','打码最快小组','on',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `javeee_member` */

CREATE TABLE `javeee_member` (
  `m_id` bigint(20) NOT NULL,
  `m_face_img` varchar(255) DEFAULT NULL,
  `m_grade` varchar(255) DEFAULT NULL,
  `m_item_id` bigint(20) DEFAULT NULL,
  `m_job` varchar(255) DEFAULT NULL,
  `m_name` varchar(255) DEFAULT NULL,
  `m_number` varchar(255) DEFAULT NULL,
  `m_skill` varchar(255) DEFAULT NULL,
  `m_status` varchar(255) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `update_user` varchar(255) DEFAULT NULL,
  `deleted` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='开发人员信息表';

/*Data for the table `javeee_member` */

/*Table structure for table `products` */

CREATE TABLE `products` (
  `new_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '新品id',
  `new_name` varchar(20) DEFAULT NULL COMMENT '新品名',
  `new_intro` varchar(100) DEFAULT NULL COMMENT '新品介绍',
  `new_img` varchar(255) DEFAULT NULL COMMENT '新品插图',
  `new_price` decimal(10,2) DEFAULT NULL COMMENT '新品价格',
  PRIMARY KEY (`new_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

/*Data for the table `products` */

/*Table structure for table `send_msg` */

CREATE TABLE `send_msg` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `c_name` varchar(30) NOT NULL COMMENT '姓名',
  `c_phone` varchar(11) NOT NULL COMMENT '电话号码',
  `c_email` varchar(30) NOT NULL COMMENT '邮件',
  `c_subject` varchar(30) NOT NULL COMMENT '主题',
  `c_message` varchar(255) NOT NULL COMMENT '短信',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `send_msg` */

/*Table structure for table `user` */

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id，自动增长',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_pwd` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `user_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `user_addr` varchar(100) DEFAULT NULL COMMENT '用户地址',
  `user_phone` varchar(11) DEFAULT NULL COMMENT '用户电话',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
