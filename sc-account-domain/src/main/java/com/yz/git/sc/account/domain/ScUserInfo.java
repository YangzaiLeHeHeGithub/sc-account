package com.yz.git.sc.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ScUserInfo implements Serializable{
    /**
     * 主键
     * 对应字段 : id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     * 对应字段 : sc_id
     */
    private Long scId;

    /**
     * 姓名 
     * 对应字段 : user_name
     */
    private String userName;

    /**
     * 手机号
     * 对应字段 : mobile_tel_no
     */
    private String mobileTelNo;

    /**
     * 证件类型（1：身份证 , 2：营业执照编号）
     * 对应字段 : certificate_type
     */
    private String certificateType;

    /**
     * 证件号
     * 对应字段 : certificate_no
     */
    private String certificateNo;

    /**
     * 密码
     * 对应字段 : password
     */
    private String password;

    /**
     * 属性
     * 对应字段 : properties
     */
    private Long properties;

    /**
     * 证件时效时间
     * 对应字段 : cert_expire_time
     */
    private Date certExpireTime;

    /**
     * 通讯地址
     * 对应字段 : address
     */
    private String address;

    /**
     * 邮箱
     * 对应字段 : mailbox
     */
    private String mailbox;

    /**
     * 受益人信息
     * 对应字段 : beneficiary_info
     */
    private String beneficiaryInfo;

    /**
     * 税收居民身份信息
     * 对应字段 : identity_info
     */
    private String identityInfo;

    /**
     * 人征信记录是否保持良好 0 没选 1各项征信记录保持良好 2：有过逾期记录
     * 对应字段 : credit_type
     */
    private Integer creditType;

    /**
     * 家庭资产（两位小数）
     * 对应字段 : penates
     */
    private BigDecimal penates;

    /**
     * 银行卡个数
     * 对应字段 : bank_num
     */
    private Integer bankNum;

    /**
     * 投资人出生日期
     * 对应字段 : investors_birthday
     */
    private String investorsBirthday;

    /**
     * 投资人职业代码
     * 对应字段 : vocation_code
     */
    private String vocationCode;

    /**
     * 投资人年收入
     * 对应字段 : annual_income
     */
    private Long annualIncome;

    /**
     * 投资人电话号码
     * 对应字段 : tel_no
     */
    private String telNo;

    /**
     * 状态
     * 对应字段 : status
     */
    private Integer status;

    /**
     * 创建时间
     * 对应字段 : create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 对应字段 : update_time
     */
    private Date updateTime;

}