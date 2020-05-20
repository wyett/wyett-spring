package com.wyett.selfcomponent;

import com.wyett.autowired2.config.MainConfig;
import com.wyett.selfcomponent.component.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 18:28
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(anno.getBean(Car.class));
    }
}
