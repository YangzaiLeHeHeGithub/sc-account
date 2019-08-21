package com.yz.git.sc.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yz.git.sc.account.client")
@MapperScan("com.yz.git.sc.account.dao")
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan(basePackages = {"com.yz.git.sc.account.service","com.yz.git.sc.account.*"})
public class ScAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScAccountApplication.class, args);
    }

}
