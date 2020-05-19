package com.wyett.lazy;

import com.wyett.lazy.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 15:59
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
//        System.out.println(anno.getBean("person"));
    }
}
