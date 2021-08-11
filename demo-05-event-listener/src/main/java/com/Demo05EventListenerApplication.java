package com;

import com.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo05EventListenerApplication {

    public static void main(String[] args) {
       //获取启动后的容器，加载自定义监听器
       ConfigurableApplicationContext context = SpringApplication.run(Demo05EventListenerApplication.class, args);
       context.addApplicationListener(new CustomListener1());
    }

}
