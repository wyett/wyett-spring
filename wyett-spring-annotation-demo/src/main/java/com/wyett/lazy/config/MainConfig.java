package com.wyett.lazy.config;

import com.wyett.lazy.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 15:55
 * @description: TODO
 */

@Configuration
public class MainConfig {

    @Bean
    @Lazy
    public Person person() {
        return new Person();
    }
}
