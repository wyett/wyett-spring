package com.wyett.bean2bean.config;

import com.wyett.bean2bean.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 10:30
 * @description: TODO */


@Configuration
public class MainConfig {

    /**
     * 默认Bean名称为方法名，可以通过@Bean(value = "person2")修改bean名称
     * @return
     */
    @Bean(value = "person2")
    public Person person() {
        return new Person();
    }

}
