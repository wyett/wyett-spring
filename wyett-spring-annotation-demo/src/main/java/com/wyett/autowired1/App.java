package com.wyett.autowired1;

import com.wyett.autowired1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 12:10
 * @description: autowired in fields
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        Arrays.stream(anno.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
    }
}
