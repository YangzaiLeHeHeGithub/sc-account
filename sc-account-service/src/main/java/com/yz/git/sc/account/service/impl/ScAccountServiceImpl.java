package com.yz.git.sc.account.service.impl;

import com.yz.git.sc.account.client.ProductClient;
import com.yz.git.sc.account.param.ProductInfo;
import com.yz.git.sc.account.service.ScAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/20
 */
@Service
public class ScAccountServiceImpl implements ScAccountService {
    @Autowired
    ProductClient productClient;

    @Override
    public String tryGetMsg() {
        String response = productClient.productMsg();
        return response;
    }

    @Override
    public List<ProductInfo> queryProductList() {
        return null;
    }
}
