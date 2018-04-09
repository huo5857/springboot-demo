package com.hcb.samples;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hcb.samples.interceptor.WebInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor());
        System.out.println("===========   拦截器注册完毕   ===========");
    }

}