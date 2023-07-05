package com.hjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PackageClassName: com.hjw.EurekaDemoApplication
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-03, 0003 下午 03:38
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoApplication.class,args);
    }
}
