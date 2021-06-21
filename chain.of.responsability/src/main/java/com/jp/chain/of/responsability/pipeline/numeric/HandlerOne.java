package com.jp.chain.of.responsability.pipeline.numeric;

import com.jp.chain.of.responsability.pipeline.Handler;
import org.springframework.stereotype.Component;

@Component
public class HandlerOne implements Handler<Integer> {
    @Override
    public void handle(Integer contextData) {
        System.out.println("one");
    }
}
