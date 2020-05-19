package com.wyett.conditional.config;

import com.wyett.conditional.component.Dog;
import com.wyett.conditional.component.Person;
import com.wyett.conditional.condition.WyettCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 16:53
 * @description: TODO
 */

public class MainConfig {

    //@Bean
    public Person person() {
        return new Person();
    }

    @Bean
    @Conditional(value = { WyettCondition.class })
    public Dog dog() {
        return new Dog();
    }
}
