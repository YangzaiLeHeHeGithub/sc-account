package com.yz.git.sc.fund.account.service;

import com.yz.git.sc.fund.account.param.ProductInfo;

import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/20
 */
public interface ScFundAccountService {
    /**
     * 测试调用产品部分方法openFeign
     * @return
     */
    String tryGetMsg();
    /**
     * 查询基金列表
     * @return
     */
    List<ProductInfo> queryProductList();
}
