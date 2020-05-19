package com.wyett.bean5factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 18:57
 * @description: TODO
 */

@Configuration
@ImportResource(locations = "classpath:bean.xml")
public class MainConfig {

    @Bean
    public DogFactoryBean dogFactoryBean() {
        return new DogFactoryBean();
    }
}
