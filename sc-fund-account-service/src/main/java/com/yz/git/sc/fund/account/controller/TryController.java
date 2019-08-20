package com.yz.git.sc.fund.account.controller;

import com.yz.git.sc.fund.account.api.ScFundAccountApi;
import com.yz.git.sc.fund.account.client.ProductClient;
import com.yz.git.sc.fund.account.common.message.Message;
import com.yz.git.sc.fund.account.template.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 测试功能调用
 * @author xuyang
 * @date 2019/08/20
 */
@RestController
@RequestMapping("/account")
public class TryController {
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;


    @Resource
    ProductClient productClient;

    @Resource
    ScFundAccountApi scFundAccountApi;
    @GetMapping("msg")
    public String tryMsg(){
        return "account msg success!";
    }
    @GetMapping("/product")
    public String tryGetProduct(){
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("SC-FUND-PRODUCT-DEV");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/product/msg");
//        String response = restTemplate.getForObject(url,String.class);

        //String response = restTemplate.getForObject("http://SC-FUND-PRODUCT-DEVproduct/msg",String.class);
        String response = productClient.productMsg();
        return response;
    }
    @GetMapping("/api")
    public String  tryp(){

        Message<String> msgStr = scFundAccountApi.tryGetMsg();

        return msgStr.getMessage()+"---"+ msgStr.getData()+"haha";

    }
}
