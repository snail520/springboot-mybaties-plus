
DROP TABLE IF EXISTS user;

CREATE TABLE user_demo
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	loginName VARCHAR(50) NULL DEFAULT NULL COMMENT '名称',
	age INT(11) NOT NULL COMMENT '年龄',
	PRIMARY KEY (id)
);