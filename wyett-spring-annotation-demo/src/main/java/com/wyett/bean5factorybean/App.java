package com.wyett.bean5factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 18:43
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        Object bean = anno.getBean("dogFactoryBean");
        System.out.println(bean);
        Object bean2 = anno.getBean("&dogFactoryBean");
        System.out.println(bean2);
    }
}
