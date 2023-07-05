package com.hjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageClassName: com.hjw.TeacherConsumerDemoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 上午 09:42
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ActivityConsumerDemoController {

    public static void main(String[] args) {
        SpringApplication.run(ActivityConsumerDemoController.class, args);
    }
}
