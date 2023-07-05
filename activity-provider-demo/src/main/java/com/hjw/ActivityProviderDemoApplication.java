package com.hjw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @PackageClassName: com.hjw.TeacherProviderDemoApplication
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 上午 09:51
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.hjw.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class ActivityProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityProviderDemoApplication.class, args);
    }
}
