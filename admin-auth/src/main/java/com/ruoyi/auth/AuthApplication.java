package com.ruoyi.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 */
@Slf4j
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        log.info("认证授权中心启动成功 \n" +
                "              _   _     \n" +
                "             | | | |    \n" +
                "   __ _ _   _| |_| |__  \n" +
                "  / _` | | | | __| '_ \\ \n" +
                " | (_| | |_| | |_| | | |\n" +
                "  \\__,_|\\__,_|\\__|_| |_|\n" +
                "                        \n" +
                "                        ");
    }
}
