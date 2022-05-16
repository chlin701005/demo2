package com.uuu.demo.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrepareDatabase implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            log.info("I will setup database here...with i=" + i);
        }
    }
}
