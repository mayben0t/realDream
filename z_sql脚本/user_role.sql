create database if not exists `thirdworld`  DEFAULT CHARSET utf8;
use thirdworld;



create table if not exists `user`(		--  用户表
id        int       auto_increment, -- 主键
roleId      int          null,      	-- 对应角色表id
account   varchar(200) null,   		-- 账户
password  varchar(200) null,  	  	-- 密码
name      varchar(200) null,   	 	-- 昵称
headUrl   varchar(255) null,    	-- 头像url地址
sex       int          null,    	-- 1男 0女 2未知
birthday  Date         null,    	-- 生日
ip        varchar(200) null,		-- ip地址
primary key(id)
)engine=innodb default charset=utf8



create table role(						-- 角色表
id        int   auto_increment      not null, -- 主键
identify  varchar(200) null,     -- 身份
authId	  int   null,             -- 对应什么样的权限
primary key(id)
)engine=innodb default charset=utf8


create table auth(     -- 权限表
id        int   auto_increment not null, -- 主键
level     int   null,   -- 对应的级别
position  varchar(200) null,  -- 模块名 （为了以后拓展为5张表时用得到）
positionLevel int  null, -- 模块对应的权限代码 （同上）
primary key(id)
)engine=innodb default charset=utf8