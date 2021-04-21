package com.grain.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2021/11/9 17:01
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
public class UcenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(UcenterApplication.class, args);
    }
}
