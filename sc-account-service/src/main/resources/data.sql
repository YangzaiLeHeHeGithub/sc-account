/* 用户表DDL */

CREATE TABLE `sc_user_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sc_id` bigint(20) NOT NULL COMMENT '用户ID',
  `user_name` varchar(20) DEFAULT NULL COMMENT '姓名 ',
  `mobile_tel_no` varchar(20) DEFAULT NULL COMMENT '手机号',
  `certificate_type` varchar(2) DEFAULT NULL COMMENT '证件类型（1：身份证 , 2：营业执照编号）',
  `certificate_no` varchar(30) DEFAULT NULL COMMENT '证件号',
  `password` varchar(256) DEFAULT NULL COMMENT '密码',
  `properties` bigint(20) DEFAULT NULL COMMENT '属性',
  `cert_expire_time` date DEFAULT NULL COMMENT '证件时效时间',
  `address` varchar(512) DEFAULT NULL COMMENT '通讯地址',
  `mailbox` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `beneficiary_info` varchar(256) DEFAULT '' COMMENT '受益人信息',
  `identity_info` varchar(1024) DEFAULT NULL COMMENT '税收居民身份信息',
  `credit_type` int(10) DEFAULT NULL COMMENT '人征信记录是否保持良好 0 没选 1各项征信记录保持良好 2：有过逾期记录',
  `penates` decimal(16,2) DEFAULT NULL COMMENT '家庭资产（两位小数）',
  `bank_num` int(8) DEFAULT '0' COMMENT '银行卡个数',
  `investors_birthday` varchar(8) DEFAULT NULL COMMENT '投资人出生日期',
  `vocation_code` varchar(3) DEFAULT NULL COMMENT '投资人职业代码',
  `annual_income` bigint(8) DEFAULT NULL COMMENT '投资人年收入',
  `tel_no` varchar(22) DEFAULT NULL COMMENT '投资人电话号码',
  `status` int(10) DEFAULT NULL COMMENT '状态',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sc_user_id` (`sc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=315 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户信息表'


/**/