package com.ruoyi.system;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 */
@Slf4j
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiSystemApplication.class, args);
        log.info("系统模块启动成功 \n" +
                "                _                 \n" +
                "               | |                \n" +
                "  ___ _   _ ___| |_ ___ _ __ ___  \n" +
                " / __| | | / __| __/ _ \\ '_ ` _ \\ \n" +
                " \\__ \\ |_| \\__ \\ ||  __/ | | | | |\n" +
                " |___/\\__, |___/\\__\\___|_| |_| |_|\n" +
                "       __/ |                      \n" +
                "      |___/                       ");
    }
}
