package com.wyett.beanscope.config;

import com.wyett.beanscope.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 15:31
 * @description: bean scope
 */

@Configuration
public class MainConfig {

    /**
     * 默认@Bean为单实例, singleton，并且是饿汉加载
     * @Scope为prototype，多实例，懒汉加载
     *
     * @return
     */
    @Bean
    @Scope(value = "singleton")
    public Person person() {
        return new Person();
    }
}
