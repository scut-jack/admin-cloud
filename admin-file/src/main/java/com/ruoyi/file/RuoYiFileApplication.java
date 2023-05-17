package com.ruoyi.file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 */
@Slf4j
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RuoYiFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiFileApplication.class, args);
        log.info("文件服务模块启动成功 \n" +
                "   __ _ _      \n" +
                "  / _(_) |     \n" +
                " | |_ _| | ___ \n" +
                " |  _| | |/ _ \\\n" +
                " | | | | |  __/\n" +
                " |_| |_|_|\\___|\n" +
                "               \n" +
                "               ");
    }
}
