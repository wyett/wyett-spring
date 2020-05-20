package com.wyett.autowired2.config;

import com.wyett.autowired2.component.Dog;
import com.wyett.autowired2.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 17:51
 * @description: TODO
 */

@Configuration
@ComponentScan(basePackages = {"com.wyett.autowired2"})
public class MainConfig {

    @Bean
    public Dog dog(@Autowired Person person) {
        return new Dog(person);
    }
}
