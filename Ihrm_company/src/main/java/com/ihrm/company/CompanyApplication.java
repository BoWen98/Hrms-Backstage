package com.ihrm.company;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: Hrms-Backstage
 * @Package: com.ihrm.company
 * @ClassName: CompanyApplication
 * @Author: Bowen
 * @Description: 企业启动类
 * @Date: 2019/10/30 18:03
 * @Version: 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan("com.ihrm")
public class CompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
