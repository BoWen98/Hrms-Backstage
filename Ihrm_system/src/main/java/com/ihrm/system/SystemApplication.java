package com.ihrm.system;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: Hrms-Backstage
 * @Package: com.ihrm.system
 * @ClassName: SystemApplication
 * @Author: Bowen
 * @Description: 用户启动类
 * @Date: 2019/10/31 14:24
 * @Version: 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan("com.ihrm.domain.system")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
