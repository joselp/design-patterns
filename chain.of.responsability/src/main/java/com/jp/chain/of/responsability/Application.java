package com.jp.chain.of.responsability;

import com.jp.chain.of.responsability.pipeline.alphabetic.AlphabeticPipeline;
import com.jp.chain.of.responsability.pipeline.numeric.NumericPipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private AlphabeticPipeline alphabeticPipeline;

	@Autowired
	private NumericPipeline numericPipeline;

	@PostConstruct
	public void printPipeline() {

		alphabeticPipeline.execute(new StringBuilder());

		numericPipeline.execute(1);

	}
}
