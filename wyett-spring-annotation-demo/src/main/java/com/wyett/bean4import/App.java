package com.wyett.bean4import;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 17:04
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext("MainConfig.class");
        Arrays.stream(anno.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
    }
}
