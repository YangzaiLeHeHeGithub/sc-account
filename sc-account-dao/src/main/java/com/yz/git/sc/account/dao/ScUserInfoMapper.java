package com.yz.git.sc.account.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yz.git.sc.account.domain.ScUserInfo;

/**
 * @author
 */
public interface ScUserInfoMapper extends BaseMapper<ScUserInfo>{
    /**
     * 插入数据库记录
     * @return a
     * @param record
     */
    @Override
    int insert(ScUserInfo record);

    /**
     * 插入数据库记录
     * @return
     * @param record
     */
    int insertSelective(ScUserInfo record);
}