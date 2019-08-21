package com.yz.git.sc.account.api.impl;

import com.yz.git.sc.account.service.ScAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author xuyang
 * @date 2019/08/19
 */
@Slf4j
@Service
public class ScAccountApiImpl implements Scaccounta{
    @Autowired
    ScAccountService scAccountService;
    @Override
    public Message<List<ProductInfo>> queryProductList() {
        return null;
    }

    @Override
    public Message<String> tryGetMsg() {
        log.info("调用远程产品模块!");
        String response = null;
        try {
            response = scAccountService.tryGetMsg();
        } catch (Exception e) {
            log.error("调用产品模块异常",e);
        }
        return Messages.success(response);
    }
}
