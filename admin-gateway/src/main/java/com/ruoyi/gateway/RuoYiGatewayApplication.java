package com.ruoyi.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RuoYiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiGatewayApplication.class, args);
        log.info("网关启动成功 \n" +
                "              _                           \n" +
                "             | |                          \n" +
                "   __ _  __ _| |_ _____      ____ _ _   _ \n" +
                "  / _` |/ _` | __/ _ \\ \\ /\\ / / _` | | | |\n" +
                " | (_| | (_| | ||  __/\\ V  V / (_| | |_| |\n" +
                "  \\__, |\\__,_|\\__\\___| \\_/\\_/ \\__,_|\\__, |\n" +
                "   __/ |                             __/ |\n" +
                "  |___/                             |___/ ");
    }
}
