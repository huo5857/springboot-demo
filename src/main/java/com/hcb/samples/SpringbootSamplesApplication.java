package com.hcb.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootApplication
@ServletComponentScan
public class SpringbootSamplesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSamplesApplication.class, args);
	}
}
