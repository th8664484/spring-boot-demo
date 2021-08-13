package com.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@Component
public class MyErrorViewTesolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if (status.equals(HttpStatus.NOT_FOUND)){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("timestamp", new Date(System.currentTimeMillis()));
            modelAndView.addObject("status",status);
            modelAndView.addObject("message","No message available");
            modelAndView.setViewName("/resolver404");
            return modelAndView;
        }
        return null;
    }
}
