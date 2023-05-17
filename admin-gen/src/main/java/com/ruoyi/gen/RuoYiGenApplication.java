package com.ruoyi.gen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 */
@Slf4j
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiGenApplication.class, args);
        log.info("代码生成模块启动成功 \n" +
                "                   \n" +
                "                   \n" +
                "   __ _  ___ _ __  \n" +
                "  / _` |/ _ \\ '_ \\ \n" +
                " | (_| |  __/ | | |\n" +
                "  \\__, |\\___|_| |_|\n" +
                "   __/ |           \n" +
                "  |___/            ");
    }
}
