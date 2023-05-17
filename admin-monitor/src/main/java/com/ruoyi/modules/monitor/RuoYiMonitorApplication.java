package com.ruoyi.modules.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 */
@Slf4j
@EnableAdminServer
@SpringBootApplication
public class RuoYiMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiMonitorApplication.class, args);
        log.info("监控中心启动成功" +
                "                        _ _             \n" +
                "                       (_) |            \n" +
                "  _ __ ___   ___  _ __  _| |_ ___  _ __ \n" +
                " | '_ ` _ \\ / _ \\| '_ \\| | __/ _ \\| '__|\n" +
                " | | | | | | (_) | | | | | || (_) | |   \n" +
                " |_| |_| |_|\\___/|_| |_|_|\\__\\___/|_|   \n" +
                "                                        \n" +
                "                                        ");
    }
}
