package com.wyett.selfcomponent.config;

import com.wyett.selfcomponent.component.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 18:27
 * @description: TODO
 */

@Configuration
@ComponentScan(basePackages = {"com.wyett.selfcomponent"})
public class MainConfig {

    @Bean
    public Car car() {
        return new Car();
    }

}
