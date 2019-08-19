package com.yz.git.sc.fund.account.api;

import com.yz.git.sc.fund.account.common.message.Message;
import com.yz.git.sc.fund.account.param.ProductInfo;

import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/19
 */
public interface ScFundAccountApi {
    /**
     * 查询基金列表
     * @return
     */
    Message<List<ProductInfo>> queyProductList();

}
