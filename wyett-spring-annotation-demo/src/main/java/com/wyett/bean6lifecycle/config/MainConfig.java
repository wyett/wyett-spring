package com.wyett.bean6lifecycle.config;

import com.wyett.bean6lifecycle.component.Car;
import com.wyett.bean6lifecycle.component.Car1;
import com.wyett.bean6lifecycle.component.WyettBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 9:52
 * @description: config
 */

@Configuration
@ComponentScan(value = "com.wyett.bean6lifecycle")
public class MainConfig {

    /**
     * 当Bean的作用域类型是默认singleton时，容器启动时创建Bean，容器销毁时销毁Bean
     * 当Bean的作用域类型是prototype时，容器启动时不会创建Bean，而是在调用时创建Bean，IOC容器销毁时也不会销毁Bean
     * @return
     */
    @Scope
    //@Scope(value = "prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    /*
    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public Car1 car1() {
        return new Car1();
    }
     */

    @Bean
    public WyettBeanPostProcessor wyettBeanPostProcessor() {
        return new WyettBeanPostProcessor();
    }

}
