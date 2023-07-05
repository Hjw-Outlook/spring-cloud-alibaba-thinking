package com.hjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageClassName: com.hjw.CheckConsumerController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:33
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CheckConsumerController {

    public static void main(String[] args) {
        SpringApplication.run(CheckConsumerController.class, args);
    }
}
