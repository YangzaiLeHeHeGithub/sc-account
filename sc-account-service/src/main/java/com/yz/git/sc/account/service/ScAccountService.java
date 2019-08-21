package com.yz.git.sc.account.service;


import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/20
 */
public interface ScAccountService {
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
