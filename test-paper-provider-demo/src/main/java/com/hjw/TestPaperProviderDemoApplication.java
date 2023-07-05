package com.hjw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @PackageClassName: com.hjw.TeacherProviderDemoApplication
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 上午 09:51
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@MapperScan("com.hjw.mapper")
public class TestPaperProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestPaperProviderDemoApplication.class, args);
    }
}
