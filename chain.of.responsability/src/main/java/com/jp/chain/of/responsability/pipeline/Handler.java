package com.jp.chain.of.responsability.pipeline;

public interface Handler<T> {

    void handle(T contextData);
}
