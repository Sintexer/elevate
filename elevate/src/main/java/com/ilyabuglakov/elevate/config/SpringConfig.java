package com.ilyabuglakov.elevate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SpringConfig implements WebMvcConfigurer {

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/").setViewName("start-page");
////        registry.addViewController("/homePage").setViewName("home-page");
////        registry.addViewController("/registration").setViewName("registration");
//    }

}
