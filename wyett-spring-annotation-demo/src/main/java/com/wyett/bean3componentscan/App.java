package com.wyett.bean3componentscan;

import com.wyett.bean3componentscan.config.MainConfig;
import com.wyett.bean3componentscan.config.MainConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 10:39
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig4.class);
        Arrays.stream(anno.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

    }
}
