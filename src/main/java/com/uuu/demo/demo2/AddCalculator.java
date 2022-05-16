package com.uuu.demo.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Qualifier("add")
public class AddCalculator implements Calculator{
    public AddCalculator() {
        log.info("AddCalculator initialize.");
    }

    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
