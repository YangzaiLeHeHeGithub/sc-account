package com.yz.git.sc.fund.account.api.impl;

import com.yz.git.sc.fund.account.api.ScFundAccountApi;
import com.yz.git.sc.fund.account.common.message.Message;
import com.yz.git.sc.fund.account.common.message.Messages;
import com.yz.git.sc.fund.account.param.ProductInfo;
import com.yz.git.sc.fund.account.service.ScFundAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyang
 * @date 2019/08/19
 */
@Slf4j
@Service
public class ScFundAccountApiImpl implements ScFundAccountApi{
    @Autowired
    ScFundAccountService scFundAccountService;
    @Override
    public Message<List<ProductInfo>> queryProductList() {
        return null;
    }

    @Override
    public Message<String> tryGetMsg() {
        log.info("调用远程产品模块!");
        String response = null;
        try {
            response = scFundAccountService.tryGetMsg();
        } catch (Exception e) {
            log.error("调用产品模块异常",e);
        }
        return Messages.success(response);
    }
}
