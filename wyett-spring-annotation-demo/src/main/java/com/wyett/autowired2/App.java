package com.wyett.autowired2;

import com.wyett.autowired2.component.Dog;
import com.wyett.autowired2.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 17:43
 * @description: autowired in function
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(anno.getBean(Dog.class));

    }
}
