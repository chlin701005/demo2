package com.uuu.demo.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Slf4j
public class SetupEnvironment implements CommandLineRunner {

    @Autowired
    @Qualifier("add")
    private Calculator calcx;

    @Autowired
    @Qualifier("sub")
    private Calculator calcy;

    @Override
    public void run(String... args) throws Exception {
        log.info("get calc={}", calcx.calc(5, 6));
        log.info("get calc={}", calcy.calc(6, 6));
    }
}
