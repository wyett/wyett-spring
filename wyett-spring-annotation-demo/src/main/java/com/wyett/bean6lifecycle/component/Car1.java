package com.wyett.bean6lifecycle.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 10:25
 * @description: TODO
 */

@Component
public class Car1 implements InitializingBean, DisposableBean {

    public Car1() {
        System.out.println("Car1 constructor");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("car1 distroy by DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("car1 afterPropertiesSet by InitializingBean");
    }
}
