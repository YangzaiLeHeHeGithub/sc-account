package com.yz.git.sc.account.api;

import com.yz.git.sc.account.common.message.Message;
import com.yz.git.sc.account.param.ProductInfo;

import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/19
 */
public interface ScAccountApi {
    /**
     * 测试调用产品部分方法openFeign
     * @return
     */
    Message<String> tryGetMsg();
    /**
     * 查询基金列表
     * @return
     */
    Message<List<ProductInfo>> queryProductList();


}
