package com.jp.chain.of.responsability.pipeline.numeric;

import com.jp.chain.of.responsability.pipeline.Handler;
import com.jp.chain.of.responsability.pipeline.numeric.config.NumericPipelineConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class NumericPipeline {

    private final ApplicationContext applicationContext;

    @Autowired
    public NumericPipeline(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Integer execute(Integer contextData) {

        System.out.println("Executing numeric pipeline");

        getHandlers().forEach(handlerName -> {

            Handler handler = applicationContext.getBean(handlerName, Handler.class);
            handler.handle(contextData);
        });
        System.out.println("numeric pipeline executed " + contextData);
        return contextData;
    }

    private List<String> getHandlers() {

        return Stream.of(NumericPipelineConfig.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
