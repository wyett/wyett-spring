package com.wyett.publishevent.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/22 17:24
 * @description: TODO
 */

@Component
public class WyettApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("触发event: " + event);
    }
}
