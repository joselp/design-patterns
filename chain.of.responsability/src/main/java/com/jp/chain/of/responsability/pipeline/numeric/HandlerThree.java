package com.jp.chain.of.responsability.pipeline.numeric;

import com.jp.chain.of.responsability.pipeline.Handler;
import org.springframework.stereotype.Component;

@Component
public class HandlerThree implements Handler<Integer> {
    @Override
    public void handle(Integer contextData) {
        System.out.println("three");
    }
}
