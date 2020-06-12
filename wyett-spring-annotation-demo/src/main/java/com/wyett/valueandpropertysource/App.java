package com.wyett.valueandpropertysource;

import com.wyett.valueandpropertysource.component.DbConnection;
import com.wyett.valueandpropertysource.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 11:15
 * @description: TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig.class);
        /*Arrays.stream(anno.getBean(DbConnection.class).getClass().getFields())
                .forEach(s -> System.out.println(s));*/
        System.out.println(anno.getBean(DbConnection.class).toString());
    }
}
