package com.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 切面处理
 */
@ControllerAdvice
public class MyExceptionHandler {



    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error");
        modelAndView.addObject("status","500");
        modelAndView.addObject("message",e.getMessage());
        return modelAndView;
    }
}
