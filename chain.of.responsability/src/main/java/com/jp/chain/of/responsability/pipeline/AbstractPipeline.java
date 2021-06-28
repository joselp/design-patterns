package com.jp.chain.of.responsability.pipeline;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AbstractPipeline<T> {

    private static PipelineConfig pipelineConfig;

    @Autowired
    private Map<String, Handler<T>> handlers;

    static {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            pipelineConfig = objectMapper
                    .readValue(new File("src/main/resources/pipeline/config.yaml"), PipelineConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public AbstractPipeline() {
    }

    public T execute(T contextData) {

        System.out.println("Executing pipeline " + this.getClass().getSimpleName());

        getHandlers(this.getClass().getSimpleName())
                .forEach(handler -> handler.handle(contextData));

        return contextData;
    }

    private List<Handler<T>> getHandlers(String pipeline) {

        return pipelineConfig.getPipelines().get(pipeline).stream()
                .map(handlerName -> handlers.get(handlerName))
                .collect(Collectors.toList());
    }
}
