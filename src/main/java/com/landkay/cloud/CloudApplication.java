package com.landkay.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableEurekaServer
@EnableAsync
@RefreshScope
@SpringBootApplication
/**
 * Description //TODO
 * @author landkay
 * @Date 16:10 2018/8/3
 * @return 
 **/
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
}
