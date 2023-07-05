package com.hjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageClassName: com.hjw.SentinelDemoApplication
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 05:37
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDemoApplication.class, args);
    }
}
