package com.ruoyi.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 */
@Slf4j
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiJobApplication.class, args);
        log.info("定时任务模块启动成功 \n" +
                "    _       _     \n" +
                "   (_)     | |    \n" +
                "    _  ___ | |__  \n" +
                "   | |/ _ \\| '_ \\ \n" +
                "   | | (_) | |_) |\n" +
                "   | |\\___/|_.__/ \n" +
                "  _/ |            \n" +
                " |__/             ");
    }
}
