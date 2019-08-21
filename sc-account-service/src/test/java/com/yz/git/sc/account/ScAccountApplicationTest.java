package com.yz.git.sc.account;

import com.yz.git.sc.account.dao.ScUserInfoMapper;
import com.yz.git.sc.account.domain.ScUserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;


/**
 * @Author xuyang
 * @Date 2019-08-21
 * @Description
 */
@ComponentScan(basePackages = "com.yz.git.sc.account.*")
//@MapperScan("com.yz.git.sc.account.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScAccountApplicationTest {
     @Resource
     ScUserInfoMapper scUserInfoMapper;
     @Test
     public void addUser(){
         ScUserInfo userInfo = new ScUserInfo();
         userInfo.setAddress("北京市朝阳区姚家园广发大厦");
         userInfo.setBankNum(312);
         userInfo.setCertExpireTime(new Date());
         userInfo.setBeneficiaryInfo("老王");
         userInfo.setPassword("1223321");
         userInfo.setCertificateType("1");
         userInfo.setScId(001L);
         scUserInfoMapper.insert(userInfo);


     }




}
