package com.example;

import com.example.Server.NettyUdpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class Demo20221229NettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo20221229NettyApplication.class, args);
    }

}
