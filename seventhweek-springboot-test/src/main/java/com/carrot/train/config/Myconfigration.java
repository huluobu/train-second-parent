package com.carrot.train.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.util.PathMatcher;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.resource.ResourceUrlProvider;
import org.springframework.web.util.UrlPathHelper;

import java.util.Arrays;

/**
 * @Author: carrot
 * @Date: 2020/10/13 15:11
 * @Description:
 */
@Configuration
public class Myconfigration  extends WebMvcConfigurationSupport {
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/" };




    @Bean //将组件注册在容器
    public WebMvcConfigurationSupport webMvcConfigurerAdapter(){
        WebMvcConfigurationSupport adapter = new WebMvcConfigurationSupport() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("index.html");
                registry.addViewController("/main.html").setViewName("dashboard");
            }


            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginRequiredInterceptor()).excludePathPatterns(Arrays.asList("/assets/**", "/images/**"));
            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/**")
                        .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);

            }
        };
        return adapter;}

}
