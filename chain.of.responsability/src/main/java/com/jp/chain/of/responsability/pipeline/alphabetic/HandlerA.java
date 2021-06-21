package com.jp.chain.of.responsability.pipeline.alphabetic;

import com.jp.chain.of.responsability.pipeline.Handler;
import org.springframework.stereotype.Component;

@Component
public class HandlerA implements Handler<StringBuilder> {

    @Override
    public void handle(StringBuilder contextData) {
        contextData.append("A");
    }
}
