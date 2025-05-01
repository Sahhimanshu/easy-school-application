package com.example.EasyPortal.Configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("/home").setViewName("home");
    registry.addViewController("/about").setViewName("about");
    registry.addViewController("/courses").setViewName("courses");
    }

}
