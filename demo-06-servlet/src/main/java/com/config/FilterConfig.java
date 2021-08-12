package com.config;

import com.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;


@CacheConfig
public class FilterConfig {


    @Bean(name = "CustomFilter")
    public FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean =
                new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
        filterFilterRegistrationBean.setName("CustomFilter");
//        filterFilterRegistrationBean.setOrder(0);//决定优先级
        return filterFilterRegistrationBean;
    }
}
