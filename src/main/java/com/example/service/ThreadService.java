package com.example.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadService {
    private static final Log logger = LogFactory.getLog("thread");
    @Async("asyncServiceExecutor")
    public void writeTxt(String msg) throws InterruptedException {
        Thread.sleep(3000);
        logger.info("线程"+msg);
    }
}
