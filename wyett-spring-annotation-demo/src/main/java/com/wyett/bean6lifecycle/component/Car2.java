package com.wyett.bean6lifecycle.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 10:25
 * @description: TODO
 */

@Component
public class Car2 {

    public Car2() {
        System.out.println("Car2 constructor");
    }


    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("car2 distroy by DisposableBean");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("car2 afterPropertiesSet by InitializingBean");
    }
}
