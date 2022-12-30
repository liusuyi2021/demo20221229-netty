package com.example.controller;

import com.example.Server.NettyUdpServer;
import com.example.service.ThreadService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@RestController
public class testController {
    private static final Log logger = LogFactory.getLog("udp");
    @Resource
    NettyUdpServer nettyUdpServer;
    @Resource
    ThreadService threadService;

    @PostConstruct
    public void init() {
        nettyUdpServer.init(50000);
        System.out.println("udp服务已开启");
    }

    @RequestMapping("/")
    String index() throws InterruptedException {
        threadService.writeTxt("1");
        threadService.writeTxt("2");
        threadService.writeTxt("3");
        threadService.writeTxt("4");
        return "nihao";
    }
}
