package com.grain.ucenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2021/2/27 15:42
 * @description：Swagger2配置文件
 * @modified By：
 * @version: $
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket webApiConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .build();

    }

    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("广外帮帮学院-用户中心-会员API文档")
                .description("本文档描述了用户中心-会员服务接口定义")
                .version("1.0")
                .contact(new Contact("Viper", "www.dragonwen.cn", "756627124@qq.com"))
                .build();
    }

}
