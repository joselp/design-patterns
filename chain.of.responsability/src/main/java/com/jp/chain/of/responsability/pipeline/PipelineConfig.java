package com.jp.chain.of.responsability.pipeline;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class PipelineConfig {

    private Map<String, List<String>> pipelines;
}