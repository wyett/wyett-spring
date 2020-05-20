package com.wyett.bean6lifecycle;

import com.wyett.bean6lifecycle.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 9:55
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        // singleton
        anno.close();

        // prototype
        //Car car = anno.getBean(Car.class);
        //anno.close();
    }
}
