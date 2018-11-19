package com.lomasz.springbootelk.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class RequestLoggingConfig {

    private final RequestIdFilter requestIdFilter;

    @Bean
    public FilterRegistrationBean requestIdFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(requestIdFilter);
        registrationBean.setOrder(Integer.MAX_VALUE);
        return registrationBean;
    }

}
