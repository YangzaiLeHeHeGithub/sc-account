package com.yz.git.sc.fund.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.yz.git.sc.fund.account.client")
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.yz.git.sc.fund.account.service","com.yz.git.sc.fund.account.*"})
public class ScFundAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScFundAccountApplication.class, args);
    }

}
