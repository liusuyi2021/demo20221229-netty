package com.example.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class MyScheduleConfig {

    @Scheduled(cron="0/5 * * * * ?")
    private void myTasks(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("定时任务"+dateFormat.format(date));
        }
    }
