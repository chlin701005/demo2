package com.uuu.demo.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(3)
public class PrepareDatabase implements CommandLineRunner {
    @Autowired
    ApplicationContext context;

    @Bean(name = "mul")
    Calculator getCalculator() {
        return new MulCalculator();
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            log.info("I will setup database here...with i=" + i);
        }
    }
}
