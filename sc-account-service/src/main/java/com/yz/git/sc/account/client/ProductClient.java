package com.yz.git.sc.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author xuyang
 * @date 2019/08/20
 */
@FeignClient(name = "sc-product-dev")
public interface ProductClient {

    @GetMapping("/product/msg")
    String productMsg();
}
