package com.wyett.beanscope;

import com.wyett.beanscope.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 15:45
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
//        System.out.println(anno.getBean("person"));
    }
}
