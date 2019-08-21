package com.yz.git.sc.account.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yz.git.sc.account.domain.ScUserInfo;

public interface ScUserInfoMapper extends BaseMapper<ScUserInfo>{
    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(ScUserInfo record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(ScUserInfo record);
}