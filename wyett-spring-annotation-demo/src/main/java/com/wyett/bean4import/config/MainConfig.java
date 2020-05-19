package com.wyett.bean4import.config;

import com.wyett.bean4import.WyettImportBeanDefinitionRegistrar;
import com.wyett.bean4import.WyettImportSelector;
import com.wyett.conditional.component.Dog;
import com.wyett.conditional.component.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 17:06
 * @description: @import导入bean
 */

@Configuration
//@Import({Dog.class, Person.class})
//@Import({Person.class, WyettImportSelector.class})
@Import({Person.class, WyettImportSelector.class, WyettImportBeanDefinitionRegistrar.class})
public class MainConfig {
}
