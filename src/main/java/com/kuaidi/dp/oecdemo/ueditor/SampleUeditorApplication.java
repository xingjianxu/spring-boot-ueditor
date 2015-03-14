package com.kuaidi.dp.oecdemo.ueditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleUeditorApplication {

    // Simple example shows how an application can spy on itself with AOP
    final static Logger logger = LoggerFactory.getLogger(SampleUeditorApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleUeditorApplication.class, args);
    }
}
