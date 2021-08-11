package com.listener;

import com.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 方式三: 不需要实现ApplicationListener接口
 * 但是先声明当前类是@Component组件 需要被加载
 * 通过在方法上增加@EventListener注解 声明这是一个监听组件
 *   监听的事件是方法的参数
 */
@Component
public class CustomListener3 {

    @EventListener
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener3监听到了");
    }
}
