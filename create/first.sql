--创建序列
CREATE SEQUENCE electric_sequence
INCREMENT BY 1   -- 每次加几个
START WITH 100     -- 从1开始计数
NOMAXVALUE        -- 不设置最大值
NOCYCLE               -- 一直累加，不循环
NOCACHE;               -- 不建缓冲区

--创建触发器
create trigger electric_trig before
insert on t_electric for each row when (new.id is null)
begin
         select electric_sequence.nextval into:new.id from dual;
end;


/*
 Navicat Premium Data Transfer

 Source Server         : 106.12.27.130
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 106.12.27.130:1521
 Source Schema         : SYSTEM

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 06/08/2019 13:42:12
*/


-- ----------------------------
-- Table structure for t_electric
-- ----------------------------
DROP TABLE "SYSTEM"."t_electric";
CREATE TABLE "SYSTEM"."t_electric" (
                                     "id" NUMBER NOT NULL ,
                                     "date" DATE ,
                                     "type" NUMBER DEFAULT 1  NOT NULL ,
                                     "time_line" VARCHAR2(10 BYTE) ,
                                     "qingtian" NUMBER NOT NULL ,
                                     "shuidian" NUMBER NOT NULL ,
                                     "hongfeng" NUMBER NOT NULL ,
                                     "guangzhao" NUMBER NOT NULL ,
                                     "goupitan" NUMBER NOT NULL ,
                                     "tongjing" NUMBER NOT NULL ,
                                     "hongjiadu" NUMBER NOT NULL ,
                                     "wujiangdu" NUMBER NOT NULL ,
                                     "dongfeng" NUMBER NOT NULL ,
                                     "suofengyin" NUMBER NOT NULL ,
                                     "silin" NUMBER NOT NULL ,
                                     "shatuo" NUMBER NOT NULL ,
                                     "puding" NUMBER NOT NULL ,
                                     "yinzidu" NUMBER NOT NULL ,
                                     "mamaya" NUMBER NOT NULL ,
                                     "shannipo" NUMBER NOT NULL ,
                                     "maojiahe" NUMBER NOT NULL ,
                                     "wanjiakouzi" NUMBER NOT NULL ,
                                     "pingzhai" NUMBER NOT NULL ,
                                     "dahua" NUMBER NOT NULL ,
                                     "geliqiao" NUMBER NOT NULL ,
                                     "xiangbiling" NUMBER NOT NULL ,
                                     "xiaoyantou" NUMBER NOT NULL ,
                                     "dayandong" NUMBER NOT NULL ,
                                     "xiangshui" NUMBER NOT NULL ,
                                     "dafang" NUMBER NOT NULL ,
                                     "tongzi" NUMBER NOT NULL ,
                                     "tangzhai" NUMBER NOT NULL ,
                                     "dalong_gui" NUMBER NOT NULL ,
                                     "dalong_xiang" NUMBER NOT NULL ,
                                     "bijiere" NUMBER NOT NULL
)
  TABLESPACE "SYSTEM"
  LOGGING
  NOCOMPRESS
  PCTFREE 10
  INITRANS 1
  STORAGE (
  INITIAL 65536
  NEXT 1048576
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
          )
  PARALLEL 1
  NOCACHE
  DISABLE ROW MOVEMENT
;
COMMENT ON COLUMN "SYSTEM"."t_electric"."id" IS '主键';
COMMENT ON COLUMN "SYSTEM"."t_electric"."date" IS '日期';
COMMENT ON COLUMN "SYSTEM"."t_electric"."type" IS '类型，1为时间戳的记录，2为当天总量';
COMMENT ON COLUMN "SYSTEM"."t_electric"."time_line" IS '时间戳';
COMMENT ON COLUMN "SYSTEM"."t_electric"."qingtian" IS '黔天线';
COMMENT ON COLUMN "SYSTEM"."t_electric"."shuidian" IS '水电（直）';
COMMENT ON COLUMN "SYSTEM"."t_electric"."hongfeng" IS '红枫总厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."guangzhao" IS '光照电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."goupitan" IS '构皮滩电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."tongjing" IS '董箐电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."hongjiadu" IS '洪家渡电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."wujiangdu" IS '乌江渡电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dongfeng" IS '东风电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."suofengyin" IS '索风营电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."silin" IS '思林电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."shatuo" IS '沙沱电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."puding" IS '普定电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."yinzidu" IS '引子渡电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."mamaya" IS '马马崖电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."shannipo" IS '善泥坡电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."maojiahe" IS '毛家河电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."wanjiakouzi" IS '万家口子电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."pingzhai" IS '平寨电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dahua" IS '大花水电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."geliqiao" IS '格里桥电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."xiangbiling" IS '象鼻岭电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."xiaoyantou" IS '小岩头电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dayandong" IS '大岩洞电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."xiangshui" IS '响水电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dafang" IS '大方电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."tongzi" IS '桐梓电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."tangzhai" IS '塘寨电厂';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dalong_gui" IS '大龙电厂_贵';
COMMENT ON COLUMN "SYSTEM"."t_electric"."dalong_xiang" IS '大龙电厂_湘';
COMMENT ON COLUMN "SYSTEM"."t_electric"."bijiere" IS '毕节热电厂';

-- ----------------------------
-- Primary Key structure for table t_electric
-- ----------------------------
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011128" PRIMARY KEY ("id");

-- ----------------------------
-- Checks structure for table t_electric
-- ----------------------------
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011095" CHECK ("id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011096" CHECK ("type" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011097" CHECK ("qingtian" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011098" CHECK ("shuidian" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011099" CHECK ("hongfeng" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011100" CHECK ("guangzhao" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011101" CHECK ("goupitan" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011102" CHECK ("tongjing" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011103" CHECK ("hongjiadu" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011104" CHECK ("wujiangdu" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011105" CHECK ("dongfeng" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011106" CHECK ("suofengyin" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011107" CHECK ("silin" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011108" CHECK ("shatuo" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011109" CHECK ("puding" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011110" CHECK ("yinzidu" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011111" CHECK ("mamaya" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011112" CHECK ("shannipo" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011113" CHECK ("maojiahe" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011114" CHECK ("wanjiakouzi" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011115" CHECK ("pingzhai" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011116" CHECK ("dahua" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011117" CHECK ("geliqiao" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011118" CHECK ("xiangbiling" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011119" CHECK ("xiaoyantou" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011120" CHECK ("dayandong" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011121" CHECK ("xiangshui" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011122" CHECK ("dafang" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011123" CHECK ("tongzi" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011124" CHECK ("tangzhai" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011125" CHECK ("dalong_gui" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011126" CHECK ("dalong_xiang" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."t_electric" ADD CONSTRAINT "SYS_C0011127" CHECK ("bijiere" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
