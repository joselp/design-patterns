package com.jp.chain.of.responsability.pipeline.alphabetic;

import com.jp.chain.of.responsability.pipeline.Handler;
import com.jp.chain.of.responsability.pipeline.alphabetic.config.AlphabeticPipelineConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class AlphabeticPipeline {

    private final ApplicationContext applicationContext;

    @Autowired
    public AlphabeticPipeline(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public StringBuilder execute(StringBuilder contextData) {

        System.out.println("Executing alphabetic pipeline");

        getHandlers().forEach(handlerName -> {

            Handler handler = applicationContext.getBean(handlerName, Handler.class);
            handler.handle(contextData);
        });
        System.out.println("alphabetic pipeline executed " + contextData);
        return contextData;
    }

    private List<String> getHandlers() {

        return Stream.of(AlphabeticPipelineConfig.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
